package com.aiToolFinder.aiToolFinder.entity;


    import jakarta.persistence.*;

    @Entity
    public class Tool {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;
        private String useCase;
        private String category;
        private String pricingType;
        private double rating;

        public Tool() {
        }

        public Tool(Long id, String name, String useCase, String category, String pricingType, double rating) {
            this.id = id;
            this.name = name;
            this.useCase = useCase;
            this.category = category;
            this.pricingType = pricingType;
            this.rating = rating;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUseCase() {
            return useCase;
        }

        public void setUseCase(String useCase) {
            this.useCase = useCase;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getPricingType() {
            return pricingType;
        }

        public void setPricingType(String pricingType) {
            this.pricingType = pricingType;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        @Override
        public String toString() {
            return "Tool{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", useCase='" + useCase + '\'' +
                    ", category='" + category + '\'' +
                    ", pricingType='" + pricingType + '\'' +
                    ", rating=" + rating +
                    '}';
        }
    }


