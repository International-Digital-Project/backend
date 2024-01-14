package com.restapi.rest.model;
//
//public class NewPriceRequest {
//    public static class Addresses {
//        private String senderStreet;
//        private String senderZip;
//        private String senderCity;
//        private String senderCountry;
//        private String receiverStreet;
//        private String receiverZip;
//        private String receiverCity;
//        private String receiverCountry;
//
//        // Getters and setters
//        // ...
//        public String getSenderStreet() {
//            return senderStreet;
//        }
//
//        public void setSenderStreet(String senderStreet) {
//            this.senderStreet = senderStreet;
//        }
//
//        public String getSenderZip() {
//            return senderZip;
//        }
//
//        public void setSenderZip(String senderZip) {
//            this.senderZip = senderZip;
//        }
//
//        public String getSenderCity() {
//            return senderCity;
//        }
//
//        public void setSenderCity(String senderCity) {
//            this.senderCity = senderCity;
//        }
//
//        public String getSenderCountry() {
//            return senderCountry;
//        }
//
//        public void setSenderCountry(String senderCountry) {
//            this.senderCountry = senderCountry;
//        }
//
//        public String getReceiverStreet() {
//            return receiverStreet;
//        }
//
//        public void setReceiverStreet(String receiverStreet) {
//            this.receiverStreet = receiverStreet;
//        }
//
//        public String getReceiverZip() {
//            return receiverZip;
//        }
//
//        public void setReceiverZip(String receiverZip) {
//            this.receiverZip = receiverZip;
//        }
//
//        public String getReceiverCity() {
//            return receiverCity;
//        }
//
//        public void setReceiverCity(String receiverCity) {
//            this.receiverCity = receiverCity;
//        }
//
//        public String getReceiverCountry() {
//            return receiverCountry;
//        }
//
//        public void setReceiverCountry(String receiverCountry) {
//            this.receiverCountry = receiverCountry;
//        }
//
//        @Override
//        public String toString() {
//            return "Addresses{" +
//                    "senderStreet='" + senderStreet + '\'' +
//                    ", senderZip='" + senderZip + '\'' +
//                    ", senderCity='" + senderCity + '\'' +
//                    ", senderCountry='" + senderCountry + '\'' +
//                    ", receiverStreet='" + receiverStreet + '\'' +
//                    ", receiverZip='" + receiverZip + '\'' +
//                    ", receiverCity='" + receiverCity + '\'' +
//                    ", receiverCountry='" + receiverCountry + '\'' +
//                    '}';
//        }
//    }
//
//    public static class Parcel {
//        private double weight;
//        private int length;
//        private int width;
//        private int height;
//        private String state;
//
//        // Getters and setters
//        // ...
//        public double getWeight() {
//            return weight;
//        }
//
//        public void setWeight(double weight) {
//            this.weight = weight;
//        }
//
//        public int getLength() {
//            return length;
//        }
//
//        public void setLength(int length) {
//            this.length = length;
//        }
//
//        public int getWidth() {
//            return width;
//        }
//
//        public void setWidth(int width) {
//            this.width = width;
//        }
//
//        public int getHeight() {
//            return height;
//        }
//
//        public void setHeight(int height) {
//            this.height = height;
//        }
//
//        public String getState() {
//            return state;
//        }
//
//        public void setState(String state) {
//            this.state = state;
//        }
//
//
//        @Override
//        public String toString() {
//            return "Parcel{" +
//                    "weight=" + weight +
//                    ", length=" + length +
//                    ", width=" + width +
//                    ", height=" + height +
//                    ", state='" + state + '\'' +
//                    '}';
//        }
//    }
//
//    private Addresses addresses;
//    private Parcel parcel;
//
//
//    @Override
//    public String toString() {
//        return "ShippingRequest{" +
//                "addresses=" + addresses +
//                ", parcel=" + parcel +
//                '}';
//    }
//}
public class NewPriceRequest {
    Addresses AddressesObject;
    Parcel ParcelObject;


    // Getter Methods

    public Addresses getAddresses() {
        return AddressesObject;
    }

    public Parcel getParcel() {
        return ParcelObject;
    }

    // Setter Methods

    public void setAddresses( Addresses addressesObject ) {
        this.AddressesObject = addressesObject;
    }

    public void setParcel( Parcel parcelObject ) {
        this.ParcelObject = parcelObject;
    }
}


