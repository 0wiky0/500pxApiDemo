package com.wiky.a500pxapidemo.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * {"current_page":1,"total_pages":1000,"total_items":55180,"photos":[{"id":172110159,"user_id":324706,"name":"Field of Dreams","description":"The fourth image in a long and diverse series of shots from places I visited this summer in the wilds of British Columbia and Alaska while heli-backpacking on multiple trips. You might call this a 'sister' image to the last which I posted here - wildflowers, cascades, enormous glacial mountains, turquoise lakes, etc, but it is from a different place. There are so many places up here, fifteen hundred miles of non-stop mountains - the most beautiful and undiscovered on the entire continent.\n\nOn September 13 of this year I will be announcing a new kind of photographic adventure trip which will highlight these regions in both Alaska and BC, utilizing our own helicopters on call at all times to take a select few in small groups to experience these most magical and wild of places. The way to sign up for these trips is to contact me personally at marc@marcadamus.com and be added to my tour announcement list, as the spaces I have will fill up fast!\n\nOh yeah, and the image?  This was a focus-stacked shot for the Aster flowers which grow in great abundance throughout this region.  The light and sky are the real thing.","camera":null,"lens":null,"focal_length":null,"iso":null,"shutter_speed":null,"aperture":null,"times_viewed":43569,"rating":99.9,"status":1,"created_at":"2016-09-11T11:12:36-04:00","category":8,"location":null,"latitude":null,"longitude":null,"taken_at":null,"hi_res_uploaded":0,"for_sale":false,"width":1408,"height":2000,"votes_count":3452,"favorites_count":0,"comments_count":134,"nsfw":false,"sales_count":0,"for_sale_date":null,"highest_rating":99.9,"highest_rating_date":"2016-09-11T19:24:59-04:00","license_type":0,"converted":27,"collections_count":395,"crop_version":3,"privacy":false,"profile":true,"image_url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","images":[{"size":2,"url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","https_url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","format":"jpeg"}],"url":"/photo/172110159/field-of-dreams-by-marc-adamus","positive_votes_count":3452,"converted_bits":27,"watermark":false,"image_format":"jpeg","user":{"id":324706,"username":"MAPhoto","firstname":"Marc ","lastname":"Adamus","city":"Anywhere","country":"Earth","usertype":11,"fullname":"Marc  Adamus","userpic_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5","userpic_https_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5","cover_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/cover_2048.jpg?11","upgrade_status":0,"store_on":false,"affection":541362,"avatars":{"default":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5"},"large":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/2.jpg?5"},"small":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/3.jpg?5"},"tiny":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/4.jpg?5"}}},"licensing_requested":false,"licensing_suggested":false,"is_free_photo":false}],"filters":{"category":false,"exclude":4},"feature":"popular"}
 * Created by wiky on 2016/9/12.
 */
public class Photo {

    /**
     * current_page : 1
     * total_pages : 1000
     * total_items : 55180
     * photos : [{"id":172110159,"user_id":324706,"name":"Field of Dreams","description":"The fourth image in a long and diverse series of shots from places I visited this summer in the wilds of British Columbia and Alaska while heli-backpacking on multiple trips. You might call this a 'sister' image to the last which I posted here - wildflowers, cascades, enormous glacial mountains, turquoise lakes, etc, but it is from a different place. There are so many places up here, fifteen hundred miles of non-stop mountains - the most beautiful and undiscovered on the entire continent.\n\nOn September 13 of this year I will be announcing a new kind of photographic adventure trip which will highlight these regions in both Alaska and BC, utilizing our own helicopters on call at all times to take a select few in small groups to experience these most magical and wild of places. The way to sign up for these trips is to contact me personally at marc@marcadamus.com and be added to my tour announcement list, as the spaces I have will fill up fast!\n\nOh yeah, and the image?  This was a focus-stacked shot for the Aster flowers which grow in great abundance throughout this region.  The light and sky are the real thing.","camera":null,"lens":null,"focal_length":null,"iso":null,"shutter_speed":null,"aperture":null,"times_viewed":43569,"rating":99.9,"status":1,"created_at":"2016-09-11T11:12:36-04:00","category":8,"location":null,"latitude":null,"longitude":null,"taken_at":null,"hi_res_uploaded":0,"for_sale":false,"width":1408,"height":2000,"votes_count":3452,"favorites_count":0,"comments_count":134,"nsfw":false,"sales_count":0,"for_sale_date":null,"highest_rating":99.9,"highest_rating_date":"2016-09-11T19:24:59-04:00","license_type":0,"converted":27,"collections_count":395,"crop_version":3,"privacy":false,"profile":true,"image_url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","images":[{"size":2,"url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","https_url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","format":"jpeg"}],"url":"/photo/172110159/field-of-dreams-by-marc-adamus","positive_votes_count":3452,"converted_bits":27,"watermark":false,"image_format":"jpeg","user":{"id":324706,"username":"MAPhoto","firstname":"Marc ","lastname":"Adamus","city":"Anywhere","country":"Earth","usertype":11,"fullname":"Marc  Adamus","userpic_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5","userpic_https_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5","cover_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/cover_2048.jpg?11","upgrade_status":0,"store_on":false,"affection":541362,"avatars":{"default":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5"},"large":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/2.jpg?5"},"small":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/3.jpg?5"},"tiny":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/4.jpg?5"}}},"licensing_requested":false,"licensing_suggested":false,"is_free_photo":false}]
     * filters : {"category":false,"exclude":4}
     * feature : popular
     */

    private int current_page;
    private int total_pages;
    private int total_items;
    /**
     * category : false
     * exclude : 4
     */

    private FiltersBean filters;
    private String feature;
    /**
     * id : 172110159
     * user_id : 324706
     * name : Field of Dreams
     * description : The fourth image in a long and diverse series of shots from places I visited this summer in the wilds of British Columbia and Alaska while heli-backpacking on multiple trips. You might call this a 'sister' image to the last which I posted here - wildflowers, cascades, enormous glacial mountains, turquoise lakes, etc, but it is from a different place. There are so many places up here, fifteen hundred miles of non-stop mountains - the most beautiful and undiscovered on the entire continent.
     * <p/>
     * On September 13 of this year I will be announcing a new kind of photographic adventure trip which will highlight these regions in both Alaska and BC, utilizing our own helicopters on call at all times to take a select few in small groups to experience these most magical and wild of places. The way to sign up for these trips is to contact me personally at marc@marcadamus.com and be added to my tour announcement list, as the spaces I have will fill up fast!
     * <p/>
     * Oh yeah, and the image?  This was a focus-stacked shot for the Aster flowers which grow in great abundance throughout this region.  The light and sky are the real thing.
     * camera : null
     * lens : null
     * focal_length : null
     * iso : null
     * shutter_speed : null
     * aperture : null
     * times_viewed : 43569
     * rating : 99.9
     * status : 1
     * created_at : 2016-09-11T11:12:36-04:00
     * category : 8
     * location : null
     * latitude : null
     * longitude : null
     * taken_at : null
     * hi_res_uploaded : 0
     * for_sale : false
     * width : 1408
     * height : 2000
     * votes_count : 3452
     * favorites_count : 0
     * comments_count : 134
     * nsfw : false
     * sales_count : 0
     * for_sale_date : null
     * highest_rating : 99.9
     * highest_rating_date : 2016-09-11T19:24:59-04:00
     * license_type : 0
     * converted : 27
     * collections_count : 395
     * crop_version : 3
     * privacy : false
     * profile : true
     * image_url : https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3
     * images : [{"size":2,"url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","https_url":"https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3","format":"jpeg"}]
     * url : /photo/172110159/field-of-dreams-by-marc-adamus
     * positive_votes_count : 3452
     * converted_bits : 27
     * watermark : false
     * image_format : jpeg
     * user : {"id":324706,"username":"MAPhoto","firstname":"Marc ","lastname":"Adamus","city":"Anywhere","country":"Earth","usertype":11,"fullname":"Marc  Adamus","userpic_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5","userpic_https_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5","cover_url":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/cover_2048.jpg?11","upgrade_status":0,"store_on":false,"affection":541362,"avatars":{"default":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5"},"large":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/2.jpg?5"},"small":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/3.jpg?5"},"tiny":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/4.jpg?5"}}}
     * licensing_requested : false
     * licensing_suggested : false
     * is_free_photo : false
     */

    private List<PhotosBean> photos;

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public FiltersBean getFilters() {
        return filters;
    }

    public void setFilters(FiltersBean filters) {
        this.filters = filters;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public List<PhotosBean> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotosBean> photos) {
        this.photos = photos;
    }

    public static class FiltersBean {
        private boolean category;
        private int exclude;

        public boolean isCategory() {
            return category;
        }

        public void setCategory(boolean category) {
            this.category = category;
        }

        public int getExclude() {
            return exclude;
        }

        public void setExclude(int exclude) {
            this.exclude = exclude;
        }
    }

    public static class PhotosBean {
        private int id;
        private int user_id;
        private String name;
        private String description;
        private Object camera;
        private Object lens;
        private Object focal_length;
        private Object iso;
        private Object shutter_speed;
        private Object aperture;
        private int times_viewed;
        private double rating;
        private int status;
        private String created_at;
        private int category;
        private Object location;
        private Object latitude;
        private Object longitude;
        private Object taken_at;
        private int hi_res_uploaded;
        private boolean for_sale;
        private int width;
        private int height;
        private int votes_count;
        private int favorites_count;
        private int comments_count;
        private boolean nsfw;
        private int sales_count;
        private Object for_sale_date;
        private double highest_rating;
        private String highest_rating_date;
        private int license_type;
        private int converted;
        private int collections_count;
        private int crop_version;
        private boolean privacy;
        private boolean profile;
        private String image_url;
        private String url;
        private int positive_votes_count;
        private int converted_bits;
        private boolean watermark;
        private String image_format;
        /**
         * id : 324706
         * username : MAPhoto
         * firstname : Marc
         * lastname : Adamus
         * city : Anywhere
         * country : Earth
         * usertype : 11
         * fullname : Marc  Adamus
         * userpic_url : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5
         * userpic_https_url : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5
         * cover_url : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/cover_2048.jpg?11
         * upgrade_status : 0
         * store_on : false
         * affection : 541362
         * avatars : {"default":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5"},"large":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/2.jpg?5"},"small":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/3.jpg?5"},"tiny":{"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/4.jpg?5"}}
         */

        private UserBean user;
        private boolean licensing_requested;
        private boolean licensing_suggested;
        private boolean is_free_photo;
        /**
         * size : 2
         * url : https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3
         * https_url : https://drscdn.500px.org/photo/172110159/q%3D50_w%3D140_h%3D140/7e93fde0421955120e46a2e7b381d895?v=3
         * format : jpeg
         */

        private List<ImagesBean> images;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Object getCamera() {
            return camera;
        }

        public void setCamera(Object camera) {
            this.camera = camera;
        }

        public Object getLens() {
            return lens;
        }

        public void setLens(Object lens) {
            this.lens = lens;
        }

        public Object getFocal_length() {
            return focal_length;
        }

        public void setFocal_length(Object focal_length) {
            this.focal_length = focal_length;
        }

        public Object getIso() {
            return iso;
        }

        public void setIso(Object iso) {
            this.iso = iso;
        }

        public Object getShutter_speed() {
            return shutter_speed;
        }

        public void setShutter_speed(Object shutter_speed) {
            this.shutter_speed = shutter_speed;
        }

        public Object getAperture() {
            return aperture;
        }

        public void setAperture(Object aperture) {
            this.aperture = aperture;
        }

        public int getTimes_viewed() {
            return times_viewed;
        }

        public void setTimes_viewed(int times_viewed) {
            this.times_viewed = times_viewed;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public int getCategory() {
            return category;
        }

        public void setCategory(int category) {
            this.category = category;
        }

        public Object getLocation() {
            return location;
        }

        public void setLocation(Object location) {
            this.location = location;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
            this.latitude = latitude;
        }

        public Object getLongitude() {
            return longitude;
        }

        public void setLongitude(Object longitude) {
            this.longitude = longitude;
        }

        public Object getTaken_at() {
            return taken_at;
        }

        public void setTaken_at(Object taken_at) {
            this.taken_at = taken_at;
        }

        public int getHi_res_uploaded() {
            return hi_res_uploaded;
        }

        public void setHi_res_uploaded(int hi_res_uploaded) {
            this.hi_res_uploaded = hi_res_uploaded;
        }

        public boolean isFor_sale() {
            return for_sale;
        }

        public void setFor_sale(boolean for_sale) {
            this.for_sale = for_sale;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getVotes_count() {
            return votes_count;
        }

        public void setVotes_count(int votes_count) {
            this.votes_count = votes_count;
        }

        public int getFavorites_count() {
            return favorites_count;
        }

        public void setFavorites_count(int favorites_count) {
            this.favorites_count = favorites_count;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public boolean isNsfw() {
            return nsfw;
        }

        public void setNsfw(boolean nsfw) {
            this.nsfw = nsfw;
        }

        public int getSales_count() {
            return sales_count;
        }

        public void setSales_count(int sales_count) {
            this.sales_count = sales_count;
        }

        public Object getFor_sale_date() {
            return for_sale_date;
        }

        public void setFor_sale_date(Object for_sale_date) {
            this.for_sale_date = for_sale_date;
        }

        public double getHighest_rating() {
            return highest_rating;
        }

        public void setHighest_rating(double highest_rating) {
            this.highest_rating = highest_rating;
        }

        public String getHighest_rating_date() {
            return highest_rating_date;
        }

        public void setHighest_rating_date(String highest_rating_date) {
            this.highest_rating_date = highest_rating_date;
        }

        public int getLicense_type() {
            return license_type;
        }

        public void setLicense_type(int license_type) {
            this.license_type = license_type;
        }

        public int getConverted() {
            return converted;
        }

        public void setConverted(int converted) {
            this.converted = converted;
        }

        public int getCollections_count() {
            return collections_count;
        }

        public void setCollections_count(int collections_count) {
            this.collections_count = collections_count;
        }

        public int getCrop_version() {
            return crop_version;
        }

        public void setCrop_version(int crop_version) {
            this.crop_version = crop_version;
        }

        public boolean isPrivacy() {
            return privacy;
        }

        public void setPrivacy(boolean privacy) {
            this.privacy = privacy;
        }

        public boolean isProfile() {
            return profile;
        }

        public void setProfile(boolean profile) {
            this.profile = profile;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getPositive_votes_count() {
            return positive_votes_count;
        }

        public void setPositive_votes_count(int positive_votes_count) {
            this.positive_votes_count = positive_votes_count;
        }

        public int getConverted_bits() {
            return converted_bits;
        }

        public void setConverted_bits(int converted_bits) {
            this.converted_bits = converted_bits;
        }

        public boolean isWatermark() {
            return watermark;
        }

        public void setWatermark(boolean watermark) {
            this.watermark = watermark;
        }

        public String getImage_format() {
            return image_format;
        }

        public void setImage_format(String image_format) {
            this.image_format = image_format;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public boolean isLicensing_requested() {
            return licensing_requested;
        }

        public void setLicensing_requested(boolean licensing_requested) {
            this.licensing_requested = licensing_requested;
        }

        public boolean isLicensing_suggested() {
            return licensing_suggested;
        }

        public void setLicensing_suggested(boolean licensing_suggested) {
            this.licensing_suggested = licensing_suggested;
        }

        public boolean isIs_free_photo() {
            return is_free_photo;
        }

        public void setIs_free_photo(boolean is_free_photo) {
            this.is_free_photo = is_free_photo;
        }

        public List<ImagesBean> getImages() {
            return images;
        }

        public void setImages(List<ImagesBean> images) {
            this.images = images;
        }

        public static class UserBean {
            private int id;
            private String username;
            private String firstname;
            private String lastname;
            private String city;
            private String country;
            private int usertype;
            private String fullname;
            private String userpic_url;
            private String userpic_https_url;
            private String cover_url;
            private int upgrade_status;
            private boolean store_on;
            private int affection;
            /**
             * default : {"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5"}
             * large : {"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/2.jpg?5"}
             * small : {"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/3.jpg?5"}
             * tiny : {"https":"https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/4.jpg?5"}
             */

            private AvatarsBean avatars;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getFirstname() {
                return firstname;
            }

            public void setFirstname(String firstname) {
                this.firstname = firstname;
            }

            public String getLastname() {
                return lastname;
            }

            public void setLastname(String lastname) {
                this.lastname = lastname;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public int getUsertype() {
                return usertype;
            }

            public void setUsertype(int usertype) {
                this.usertype = usertype;
            }

            public String getFullname() {
                return fullname;
            }

            public void setFullname(String fullname) {
                this.fullname = fullname;
            }

            public String getUserpic_url() {
                return userpic_url;
            }

            public void setUserpic_url(String userpic_url) {
                this.userpic_url = userpic_url;
            }

            public String getUserpic_https_url() {
                return userpic_https_url;
            }

            public void setUserpic_https_url(String userpic_https_url) {
                this.userpic_https_url = userpic_https_url;
            }

            public String getCover_url() {
                return cover_url;
            }

            public void setCover_url(String cover_url) {
                this.cover_url = cover_url;
            }

            public int getUpgrade_status() {
                return upgrade_status;
            }

            public void setUpgrade_status(int upgrade_status) {
                this.upgrade_status = upgrade_status;
            }

            public boolean isStore_on() {
                return store_on;
            }

            public void setStore_on(boolean store_on) {
                this.store_on = store_on;
            }

            public int getAffection() {
                return affection;
            }

            public void setAffection(int affection) {
                this.affection = affection;
            }

            public AvatarsBean getAvatars() {
                return avatars;
            }

            public void setAvatars(AvatarsBean avatars) {
                this.avatars = avatars;
            }

            public static class AvatarsBean {
                /**
                 * https : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/1.jpg?5
                 */

                @SerializedName("default")
                private DefaultBean defaultX;
                /**
                 * https : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/2.jpg?5
                 */

                private LargeBean large;
                /**
                 * https : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/3.jpg?5
                 */

                private SmallBean small;
                /**
                 * https : https://pacdn.500px.org/324706/9fdb6516fab9a65a6bad39c282732c4f8ab7197c/4.jpg?5
                 */

                private TinyBean tiny;

                public DefaultBean getDefaultX() {
                    return defaultX;
                }

                public void setDefaultX(DefaultBean defaultX) {
                    this.defaultX = defaultX;
                }

                public LargeBean getLarge() {
                    return large;
                }

                public void setLarge(LargeBean large) {
                    this.large = large;
                }

                public SmallBean getSmall() {
                    return small;
                }

                public void setSmall(SmallBean small) {
                    this.small = small;
                }

                public TinyBean getTiny() {
                    return tiny;
                }

                public void setTiny(TinyBean tiny) {
                    this.tiny = tiny;
                }

                public static class DefaultBean {
                    private String https;

                    public String getHttps() {
                        return https;
                    }

                    public void setHttps(String https) {
                        this.https = https;
                    }
                }

                public static class LargeBean {
                    private String https;

                    public String getHttps() {
                        return https;
                    }

                    public void setHttps(String https) {
                        this.https = https;
                    }
                }

                public static class SmallBean {
                    private String https;

                    public String getHttps() {
                        return https;
                    }

                    public void setHttps(String https) {
                        this.https = https;
                    }
                }

                public static class TinyBean {
                    private String https;

                    public String getHttps() {
                        return https;
                    }

                    public void setHttps(String https) {
                        this.https = https;
                    }
                }
            }
        }

        public static class ImagesBean {
            private int size;
            private String url;
            private String https_url;
            private String format;

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHttps_url() {
                return https_url;
            }

            public void setHttps_url(String https_url) {
                this.https_url = https_url;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }
        }
    }
}
