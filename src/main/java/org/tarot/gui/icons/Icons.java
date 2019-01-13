package org.tarot.gui.icons;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;

import javax.swing.ImageIcon;

/**
 * 
 * @author Théophile Dano
 *
 */
public class Icons {

    public static final ImageIcon EMPTY = new ImageIcon(new BufferedImage(22, 22, BufferedImage.TYPE_INT_ARGB));
    public static final ImageIcon ACTION = new ImageIcon(ClassLoader.getSystemResource("action.png"));
    public static final ImageIcon ADD_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("add_overlay.png"));
    public static final ImageIcon ADD = new ImageIcon(ClassLoader.getSystemResource("add.png"));
    public static final ImageIcon BACK = new ImageIcon(ClassLoader.getSystemResource("back.png"));
    public static final ImageIcon BOOKS = new ImageIcon(ClassLoader.getSystemResource("books.png"));
    public static final ImageIcon BOTTOM = new ImageIcon(ClassLoader.getSystemResource("bottom.png"));
    public static final ImageIcon BUG = new ImageIcon(ClassLoader.getSystemResource("bug.png"));
    public static final ImageIcon CALENDAR = new ImageIcon(ClassLoader.getSystemResource("calendar.png"));
    public static final ImageIcon CATEGORY = new ImageIcon(ClassLoader.getSystemResource("category.png"));
    public static final ImageIcon COLLAPSE_ALL = new ImageIcon(ClassLoader.getSystemResource("collapse_all.png"));
    public static final ImageIcon COLLAPSE = new ImageIcon(ClassLoader.getSystemResource("collapse.png"));
    public static final ImageIcon COPY = new ImageIcon(ClassLoader.getSystemResource("copy.png"));
    public static final ImageIcon DATABASE_INSERT = new ImageIcon(ClassLoader.getSystemResource("database_insert.png"));
    public static final ImageIcon DATABASE_REMOVE = new ImageIcon(ClassLoader.getSystemResource("database_remove.png"));
    public static final ImageIcon DATABASE = new ImageIcon(ClassLoader.getSystemResource("database.png"));
    public static final ImageIcon DATASET = new ImageIcon(ClassLoader.getSystemResource("dataset.png"));
    public static final ImageIcon DATASETS = new ImageIcon(ClassLoader.getSystemResource("datasets.png"));
    public static final ImageIcon DELETE_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("delete_overlay.png"));
    public static final ImageIcon DELETE = new ImageIcon(ClassLoader.getSystemResource("delete.png"));
    public static final ImageIcon DETAILS = new ImageIcon(ClassLoader.getSystemResource("details.png"));
    public static final ImageIcon DISABLED = new ImageIcon(ClassLoader.getSystemResource("disabled.png"));
    public static final ImageIcon DOCUMENT = new ImageIcon(ClassLoader.getSystemResource("document.png"));
    public static final ImageIcon DOWN = new ImageIcon(ClassLoader.getSystemResource("down.png"));
    public static final ImageIcon ENABLED = new ImageIcon(ClassLoader.getSystemResource("enabled.png"));
    public static final ImageIcon ERROR = new ImageIcon(ClassLoader.getSystemResource("error.png"));
    public static final ImageIcon EXPAND_ALL = new ImageIcon(ClassLoader.getSystemResource("expand_all.png"));
    public static final ImageIcon EXPAND = new ImageIcon(ClassLoader.getSystemResource("expand.png"));
    public static final ImageIcon EXPORT_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("export_overlay.png"));
    public static final ImageIcon EXPORT = new ImageIcon(ClassLoader.getSystemResource("export.png"));
    public static final ImageIcon FILE_XML = new ImageIcon(ClassLoader.getSystemResource("file_xml.png"));
    public static final ImageIcon FILE = new ImageIcon(ClassLoader.getSystemResource("file.png"));
    public static final ImageIcon FILTER = new ImageIcon(ClassLoader.getSystemResource("filter.png"));
    public static final ImageIcon FOLDER_CLOSED = new ImageIcon(ClassLoader.getSystemResource("folder_closed.png"));
    public static final ImageIcon FOLDER_OPEN = new ImageIcon(ClassLoader.getSystemResource("folder_open.png"));
    public static final ImageIcon GO = new ImageIcon(ClassLoader.getSystemResource("go.png"));
    public static final ImageIcon HELP = new ImageIcon(ClassLoader.getSystemResource("help.png"));
    public static final ImageIcon HOME = new ImageIcon(ClassLoader.getSystemResource("home.png"));
    public static final ImageIcon IMPORT_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("import_overlay.png"));
    public static final ImageIcon IMPORT = new ImageIcon(ClassLoader.getSystemResource("import.png"));
    public static final ImageIcon INSERT_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("insert_overlay.png"));
    public static final ImageIcon LINK_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("link_overlay.png"));
    public static final ImageIcon LINK = new ImageIcon(ClassLoader.getSystemResource("link.png"));
    public static final ImageIcon LOCK_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("lock_overlay.png"));
    public static final ImageIcon LOCK = new ImageIcon(ClassLoader.getSystemResource("lock.png"));
    public static final ImageIcon MONITOR = new ImageIcon(ClassLoader.getSystemResource("monitor.png"));
    public static final ImageIcon MIXED_SELECTION = new ImageIcon(ClassLoader.getSystemResource("mixed_selection.png"));
    public static final ImageIcon NEW_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("new_overlay.png"));
    public static final ImageIcon NEXT = new ImageIcon(ClassLoader.getSystemResource("next.png"));
    public static final ImageIcon PACKAGE_EMPTY = new ImageIcon(ClassLoader.getSystemResource("package_empty.png"));
    public static final ImageIcon PACKAGE_NEW = new ImageIcon(ClassLoader.getSystemResource("package_new.png"));
    public static final ImageIcon PACKAGE = new ImageIcon(ClassLoader.getSystemResource("package.png"));
    public static final ImageIcon PASTE = new ImageIcon(ClassLoader.getSystemResource("paste.png"));
    public static final ImageIcon PRIMARY_KEY = new ImageIcon(ClassLoader.getSystemResource("primary_key.png"));
    public static final ImageIcon PROBLEM_HINT = new ImageIcon(ClassLoader.getSystemResource("problem_hint.png"));
    public static final ImageIcon PROBLEM_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("problem_overlay.png"));
    public static final ImageIcon PROJECT_CLOSED = new ImageIcon(ClassLoader.getSystemResource("project_closed.png"));
    public static final ImageIcon PROJECT_OPEN = new ImageIcon(ClassLoader.getSystemResource("project_open.png"));
    public static final ImageIcon PROPERTIES = new ImageIcon(ClassLoader.getSystemResource("properties.png"));
    public static final ImageIcon RADIO_DISABLED = new ImageIcon(ClassLoader.getSystemResource("radio_disabled.png"));
    public static final ImageIcon RADIO_ENABLED = new ImageIcon(ClassLoader.getSystemResource("radio_enabled.png"));
    public static final ImageIcon REFRESH = new ImageIcon(ClassLoader.getSystemResource("refresh.png"));
    public static final ImageIcon REMOVE_ALL = new ImageIcon(ClassLoader.getSystemResource("remove_all.png"));
    public static final ImageIcon REMOVE_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("remove_overlay.png"));
    public static final ImageIcon REMOVE = new ImageIcon(ClassLoader.getSystemResource("remove.png"));
    public static final ImageIcon RESUME = new ImageIcon(ClassLoader.getSystemResource("resume.png"));
    public static final ImageIcon REVERT_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("revert_overlay.png"));
    public static final ImageIcon RUN = new ImageIcon(ClassLoader.getSystemResource("run.png"));
    public static final ImageIcon SAVE_ALL = new ImageIcon(ClassLoader.getSystemResource("save_all.png"));
    public static final ImageIcon SAVE_AS = new ImageIcon(ClassLoader.getSystemResource("save_as.png"));
    public static final ImageIcon SAVE = new ImageIcon(ClassLoader.getSystemResource("save.png"));
    public static final ImageIcon SEARCH = new ImageIcon(ClassLoader.getSystemResource("search.png"));
    public static final ImageIcon SHIFT_BACK = new ImageIcon(ClassLoader.getSystemResource("shift_back.png"));
    public static final ImageIcon SHIFT_NEXT = new ImageIcon(ClassLoader.getSystemResource("shift_next.png"));
    public static final ImageIcon SHORTCUT = new ImageIcon(ClassLoader.getSystemResource("shortcut.png"));
    public static final ImageIcon SORT_ALPHA = new ImageIcon(ClassLoader.getSystemResource("sort_alpha.png"));
    public static final ImageIcon SORT_DATE = new ImageIcon(ClassLoader.getSystemResource("sort_date.png"));
    public static final ImageIcon STOP = new ImageIcon(ClassLoader.getSystemResource("stop.png"));
    public static final ImageIcon SUSPEND = new ImageIcon(ClassLoader.getSystemResource("suspend.png"));
    public static final ImageIcon SYNCH = new ImageIcon(ClassLoader.getSystemResource("synch.png"));
    public static final ImageIcon TABLE_NEW = new ImageIcon(ClassLoader.getSystemResource("table_new.png"));
    public static final ImageIcon TABLE_SPLIT = new ImageIcon(ClassLoader.getSystemResource("table_split.png"));
    public static final ImageIcon TABLE = new ImageIcon(ClassLoader.getSystemResource("table.png"));
    public static final ImageIcon TAG = new ImageIcon(ClassLoader.getSystemResource("tag.png"));
    public static final ImageIcon TEMPLATE = new ImageIcon(ClassLoader.getSystemResource("template.png"));
    public static final ImageIcon TIP = new ImageIcon(ClassLoader.getSystemResource("tip.png"));
    public static final ImageIcon TOP = new ImageIcon(ClassLoader.getSystemResource("top.png"));
    public static final ImageIcon UP = new ImageIcon(ClassLoader.getSystemResource("up.png"));
    public static final ImageIcon WARNING_OVERLAY = new ImageIcon(ClassLoader.getSystemResource("warning_overlay.png"));
    public static final ImageIcon WARNING = new ImageIcon(ClassLoader.getSystemResource("warning.png"));
    public static final ImageIcon COMPONENT_CLOSED = new ImageIcon(ClassLoader.getSystemResource("closed.png"));
    public static final ImageIcon COMPONENT_COLLAPSED = new ImageIcon(ClassLoader.getSystemResource("collapsed.png"));
    public static final ImageIcon COMPONENT_EXPANDED = new ImageIcon(ClassLoader.getSystemResource("expanded.png"));

    public static ImageIcon plain(ImageIcon icon) {
        if (icon == null) {
            return null;
        }
        return new ImageIcon(bgMerge(icon.getImage(), EMPTY.getImage()));
    }

    public static ImageIcon disabled(ImageIcon icon) {
        if (icon == null) {
            return null;
        }
        BufferedImage image = toBufferedImage(icon.getImage());
        ColorConvertOp colorConvert = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
        colorConvert.filter(image, image);
        return new ImageIcon(image);
    }

    private static BufferedImage toBufferedImage(Image image) {
        if (image instanceof BufferedImage) {
            return (BufferedImage) image;
        }
        BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null),
                        BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimage.createGraphics();
        bGr.drawImage(image, 0, 0, null);
        bGr.dispose();
        return bimage;
    }

    public static Image merge(Image overlay, Image image) {
        int w = Math.max(overlay.getWidth(null), image.getWidth(null));
        int h = Math.max(overlay.getHeight(null), image.getHeight(null));
        BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics g = combined.getGraphics();
        g.drawImage(image, 0, 0, null);
        g.drawImage(overlay, 0, 0, null);
        return combined;
    }

    public static ImageIcon merge(ImageIcon overlay, ImageIcon icon) {
        return new ImageIcon(merge(overlay.getImage(), icon.getImage()));
    }

    private static Image bgMerge(Image icon, Image bg) {
        int w = Math.max(icon.getWidth(null), bg.getWidth(null));
        int h = Math.max(icon.getHeight(null), bg.getHeight(null));
        BufferedImage combined = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics g = combined.getGraphics();
        g.drawImage(bg, 0, 0, null);
        g.drawImage(icon, 3, 3, null);
        return combined;
    }
}
