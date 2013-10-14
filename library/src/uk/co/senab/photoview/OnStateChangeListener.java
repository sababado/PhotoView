package uk.co.senab.photoview;

public interface OnStateChangeListener {
    /**
     * Called when the zoom level has changed from one to another.
     *
     * @param oldZoomLevel The level of the old zoom.
     * @param newZoomLevel The level of the new zoom.
     */
    public void onZoomLevelChange(final int oldZoomLevel, final int newZoomLevel);
}
