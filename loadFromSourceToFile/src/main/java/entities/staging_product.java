package entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "staging_products", schema = "db_staging", catalog = "")
public class staging_product {
    @Basic
    @Column(name = "natural_key", nullable = true, length = 255)
    private String naturalKey;
    @Basic
    @Column(name = "sku", nullable = true, length = 255)
    private String sku;
    @Basic
    @Column(name = "product_name", nullable = true, length = 255)
    private String productName;
    @Basic
    @Column(name = "short_description", nullable = true, length = -1)
    private String shortDescription;
    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    private BigDecimal price;
    @Basic
    @Column(name = "list_price", nullable = true, precision = 2)
    private BigDecimal listPrice;
    @Basic
    @Column(name = "original_price", nullable = true, precision = 2)
    private BigDecimal originalPrice;
    @Basic
    @Column(name = "discount", nullable = true, precision = 2)
    private BigDecimal discount;
    @Basic
    @Column(name = "discount_rate", nullable = true, precision = 2)
    private BigDecimal discountRate;
    @Basic
    @Column(name = "all_time_quantity_sold", nullable = true, precision = 0)
    private Double allTimeQuantitySold;
    @Basic
    @Column(name = "rating_average", nullable = true, precision = 2)
    private BigDecimal ratingAverage;
    @Basic
    @Column(name = "review_count", nullable = true)
    private Integer reviewCount;
    @Basic
    @Column(name = "inventory_status", nullable = true, length = 50)
    private String inventoryStatus;
    @Basic
    @Column(name = "stock_item_qty", nullable = true)
    private Integer stockItemQty;
    @Basic
    @Column(name = "stock_item_max_sale_qty", nullable = true)
    private Integer stockItemMaxSaleQty;
    @Basic
    @Column(name = "brand_id", nullable = true)
    private Integer brandId;
    @Basic
    @Column(name = "brand_name", nullable = true, length = 255)
    private String brandName;
    @Basic
    @Column(name = "url_key", nullable = true, length = 255)
    private String urlKey;
    @Basic
    @Column(name = "url_path", nullable = true, length = 255)
    private String urlPath;
    @Basic
    @Column(name = "thumbnail_url", nullable = true, length = 255)
    private String thumbnailUrl;
    @Basic
    @Column(name = "options", nullable = true, length = -1)
    private String options;
    @Basic
    @Column(name = "specifications", nullable = true, length = -1)
    private String specifications;
    @Basic
    @Column(name = "variations", nullable = true, length = -1)
    private String variations;

    public String getNaturalKey() {
        return naturalKey;
    }

    public void setNaturalKey(String naturalKey) {
        this.naturalKey = naturalKey;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getListPrice() {
        return listPrice;
    }

    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(BigDecimal discountRate) {
        this.discountRate = discountRate;
    }

    public Double getAllTimeQuantitySold() {
        return allTimeQuantitySold;
    }

    public void setAllTimeQuantitySold(Double allTimeQuantitySold) {
        this.allTimeQuantitySold = allTimeQuantitySold;
    }

    public BigDecimal getRatingAverage() {
        return ratingAverage;
    }

    public void setRatingAverage(BigDecimal ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public String getInventoryStatus() {
        return inventoryStatus;
    }

    public void setInventoryStatus(String inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public Integer getStockItemQty() {
        return stockItemQty;
    }

    public void setStockItemQty(Integer stockItemQty) {
        this.stockItemQty = stockItemQty;
    }

    public Integer getStockItemMaxSaleQty() {
        return stockItemMaxSaleQty;
    }

    public void setStockItemMaxSaleQty(Integer stockItemMaxSaleQty) {
        this.stockItemMaxSaleQty = stockItemMaxSaleQty;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getVariations() {
        return variations;
    }

    public void setVariations(String variations) {
        this.variations = variations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        staging_product that = (staging_product) o;

        if (naturalKey != null ? !naturalKey.equals(that.naturalKey) : that.naturalKey != null) return false;
        if (sku != null ? !sku.equals(that.sku) : that.sku != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (listPrice != null ? !listPrice.equals(that.listPrice) : that.listPrice != null) return false;
        if (originalPrice != null ? !originalPrice.equals(that.originalPrice) : that.originalPrice != null)
            return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (discountRate != null ? !discountRate.equals(that.discountRate) : that.discountRate != null) return false;
        if (allTimeQuantitySold != null ? !allTimeQuantitySold.equals(that.allTimeQuantitySold) : that.allTimeQuantitySold != null)
            return false;
        if (ratingAverage != null ? !ratingAverage.equals(that.ratingAverage) : that.ratingAverage != null)
            return false;
        if (reviewCount != null ? !reviewCount.equals(that.reviewCount) : that.reviewCount != null) return false;
        if (inventoryStatus != null ? !inventoryStatus.equals(that.inventoryStatus) : that.inventoryStatus != null)
            return false;
        if (stockItemQty != null ? !stockItemQty.equals(that.stockItemQty) : that.stockItemQty != null) return false;
        if (stockItemMaxSaleQty != null ? !stockItemMaxSaleQty.equals(that.stockItemMaxSaleQty) : that.stockItemMaxSaleQty != null)
            return false;
        if (brandId != null ? !brandId.equals(that.brandId) : that.brandId != null) return false;
        if (brandName != null ? !brandName.equals(that.brandName) : that.brandName != null) return false;
        if (urlKey != null ? !urlKey.equals(that.urlKey) : that.urlKey != null) return false;
        if (urlPath != null ? !urlPath.equals(that.urlPath) : that.urlPath != null) return false;
        if (thumbnailUrl != null ? !thumbnailUrl.equals(that.thumbnailUrl) : that.thumbnailUrl != null) return false;
        if (options != null ? !options.equals(that.options) : that.options != null) return false;
        if (specifications != null ? !specifications.equals(that.specifications) : that.specifications != null)
            return false;
        if (variations != null ? !variations.equals(that.variations) : that.variations != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = naturalKey != null ? naturalKey.hashCode() : 0;
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (listPrice != null ? listPrice.hashCode() : 0);
        result = 31 * result + (originalPrice != null ? originalPrice.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (discountRate != null ? discountRate.hashCode() : 0);
        result = 31 * result + (allTimeQuantitySold != null ? allTimeQuantitySold.hashCode() : 0);
        result = 31 * result + (ratingAverage != null ? ratingAverage.hashCode() : 0);
        result = 31 * result + (reviewCount != null ? reviewCount.hashCode() : 0);
        result = 31 * result + (inventoryStatus != null ? inventoryStatus.hashCode() : 0);
        result = 31 * result + (stockItemQty != null ? stockItemQty.hashCode() : 0);
        result = 31 * result + (stockItemMaxSaleQty != null ? stockItemMaxSaleQty.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (brandName != null ? brandName.hashCode() : 0);
        result = 31 * result + (urlKey != null ? urlKey.hashCode() : 0);
        result = 31 * result + (urlPath != null ? urlPath.hashCode() : 0);
        result = 31 * result + (thumbnailUrl != null ? thumbnailUrl.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (specifications != null ? specifications.hashCode() : 0);
        result = 31 * result + (variations != null ? variations.hashCode() : 0);
        return result;
    }
}