package com.example.intern.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.example.intern.BR;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")

public class Movie extends BaseObservable implements Parcelable {

    @SerializedName("adult")
    @Expose
    private Boolean adult;
    @SerializedName("backdrop_path")
    @Expose
    private String backdropPath;
    @SerializedName("genre_ids")
    @Expose
    private List<Integer> genreIds;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("original_language")
    @Expose
    private String originalLanguage;
    @SerializedName("original_title")
    @Expose
    private String originalTitle;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("popularity")
    @Expose
    private Double popularity;
    @SerializedName("poster_path")
    @Expose
    private String posterPath;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("video")
    @Expose
    private Boolean video;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;
    @SerializedName("rating")
    @Expose
    private Integer rating;
    @Bindable

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }
@Bindable
    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
        notifyPropertyChanged(BR.backdropPath);
    }
    @Bindable

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
        notifyPropertyChanged(BR.genreIds);

    }
    @Bindable

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        notifyPropertyChanged(BR.id);


    }
    @Bindable

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
        notifyPropertyChanged(BR.originalLanguage);

    }
    @Bindable

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
        notifyPropertyChanged(BR.originalTitle);

    }
    @Bindable

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
        notifyPropertyChanged(BR.overview);

    }
    @Bindable

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
        notifyPropertyChanged(BR.originalLanguage);

    }

    @Bindable
    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
        notifyPropertyChanged(BR.posterPath);

    }
    @Bindable

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
        notifyPropertyChanged(BR.releaseDate);

    }
    @Bindable

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);

    }
    @Bindable

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
        notifyPropertyChanged(BR.video);
    }
    @Bindable

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
        notifyPropertyChanged(BR.voteAverage);

    }
    @Bindable

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
        notifyPropertyChanged(BR.voteCount);

    }
    @Bindable

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
        notifyPropertyChanged(BR.rating);
    }



    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(@NonNull Parcel parcel, int flags) {
        parcel.writeValue(voteCount);
        parcel.writeValue(id);
        parcel.writeValue(video);
        parcel.writeValue(voteAverage);
        parcel.writeValue(title);
        parcel.writeValue(popularity);
        parcel.writeValue(posterPath);
        parcel.writeValue(originalLanguage);
        parcel.writeValue(originalTitle);
        //    parcel.writeList(genreIds);
        parcel.writeValue(backdropPath);
        parcel.writeValue(adult);
        parcel.writeValue(overview);
        parcel.writeValue(releaseDate);
    }

    public Movie(Parcel in) {

        this.voteCount = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.id = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.video = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.voteAverage = ((Double) in.readValue((Double.class.getClassLoader())));
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.popularity = ((Double) in.readValue((Double.class.getClassLoader())));
        this.posterPath = ((String) in.readValue((String.class.getClassLoader())));
        this.originalLanguage = ((String) in.readValue((String.class.getClassLoader())));
        this.originalTitle = ((String) in.readValue((String.class.getClassLoader())));
//        in.readList(this.genreIds, (java.lang.Integer.class.getClassLoader()));
        this.backdropPath = ((String) in.readValue((String.class.getClassLoader())));
        this.adult = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.overview = ((String) in.readValue((String.class.getClassLoader())));
        this.releaseDate = ((String) in.readValue((String.class.getClassLoader())));

    }
@BindingAdapter({"posterPath"})
public static void loadImg(ImageView imageView, String imageURL){

    // BASIC IMAGE URL
    // https://image.tmdb.org/t/p/original/[poster_path]

    String imagePath = "https://image.tmdb.org/t/p/w500"+imageURL;
System.out.println(imageURL);
    Glide.with(imageView.getContext())
            .load(imagePath)
            .into(imageView);


}

 public final static    Parcelable.Creator<Movie> CREATOR =  new Creator<Movie>() {
    @Override
    public Movie createFromParcel(Parcel source) {
        return new Movie(source);
    }

    @Override
    public Movie[] newArray(int size) {
        return new Movie[size];
    }
};

    @BindingAdapter({"isadult"})
    public static void isadult(TextView textView, Boolean b)
    {
     if(b==true)
     {
         textView.setText("18+");
     }
     else {
         textView.setText("13+");
     }
    }

}


