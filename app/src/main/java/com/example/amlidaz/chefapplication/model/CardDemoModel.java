package com.example.amlidaz.chefapplication.model;

/**
 * Created by Amlidaz on 10/2/2017.
 */public class CardDemoModel {
        String[] titles,details;
        int[] imageUrl;

        public CardDemoModel(String[] titles, String[] details, int[] imageUrl) {
            this.titles = titles;
            this.details = details;
            this.imageUrl = imageUrl;
        }



    public String[] getTitles() {
            return titles;
        }

        public void setTitles(String[] titles) {
            this.titles = titles;
        }

        public String[] getDetails() {
            return details;
        }

        public void setDetails(String[] details) {
            this.details = details;
        }

        public int[] getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(int[] imageUrl) {
            this.imageUrl = imageUrl;
        }
    }


