import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.MessageDigest;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString170;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString171;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt10838 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean748;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10839;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet7;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt10840;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class396 lb;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean749 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean751 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean750 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private int anInt10841 = 0;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean752 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean750 = true;
		this.aBoolean752 = false;
		if (this.anApplet7 != null) {
			this.anApplet7.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	private boolean method9191(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class398.anIntArray719[anInt10838]);
			this.aColor2 = new Color(Class398.anIntArray721[anInt10838]);
			this.colourtext = new Color(Class398.anIntArray720[anInt10838]);
		}
		@Pc(45) Graphics local45 = this.getGraphics();
		if (local45 == null) {
			this.repaint();
			return false;
		}
		@Pc(94) int local94;
		@Pc(101) int local101;
		@Pc(172) String local172;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10839, this.anInt10840);
			}
			@Pc(72) Graphics local72 = this.anImage14.getGraphics();
			local72.setColor(Color.black);
			local72.fillRect(0, 0, this.anInt10839, this.anInt10840);
			local72.setColor(this.aColor3);
			local94 = this.anInt10839 / 2 - 152;
			local101 = this.anInt10840 / 2 - 18;
			local72.drawRect(local94, local101, 303, 33);
			local72.setColor(this.aColor2);
			local72.fillRect(local94 + 2, local101 + 2, arg1 * 3, 30);
			local72.setColor(Color.black);
			local72.drawRect(local94 + 1, local101 - -1, 301, 31);
			local72.fillRect(arg1 * 3 + local94 + 2, local101 - -2, 300 - arg1 * 3, 30);
			local72.setFont(this.bf);
			local172 = arg0 + " - " + arg1 + "%";
			local72.setColor(this.colourtext);
			local72.drawString(local172, (this.anInt10839 - this.bfm.stringWidth(local172)) / 2, this.anInt10840 / 2 + 4);
			local45.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(205) Exception local205) {
			local45.setColor(Color.black);
			local45.fillRect(0, 0, this.anInt10839, this.anInt10840);
			local45.setColor(this.aColor3);
			local94 = this.anInt10839 / 2 - 152;
			local101 = this.anInt10840 / 2 - 18;
			local45.drawRect(local94, local101, 303, 33);
			local45.setColor(this.aColor2);
			local45.fillRect(local94 + 2, local101 + 2, arg1 * 3, 30);
			local45.setColor(Color.black);
			local45.drawRect(local94 + 1, local101 - -1, 301, 31);
			local45.fillRect(arg1 * 3 + local94 + 2, local101 + 2, 300 - arg1 * 3, 30);
			local45.setFont(this.bf);
			local172 = arg0 + " - " + arg1 + "%";
			local45.setColor(this.colourtext);
			local45.drawString(local172, (this.anInt10839 - this.bfm.stringWidth(local172)) / 2, this.anInt10840 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString170 = this.getParameter("unsignedurl");
			if (aString170 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean751 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString170), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString171 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class398.aStringArray67.length) {
					local37 = 0;
				}
			}
			@Pc(65) String local65 = this.getParameter("colourid");
			if (local65 != null) {
				anInt10838 = Integer.parseInt(local65);
				if (anInt10838 < 0 || anInt10838 >= Class398.anIntArray719.length) {
					anInt10838 = 0;
				}
			}
			this.lb = Class398.aClass396Array1[anInt10838];
			this.anInt10839 = this.getSize().width;
			this.anInt10840 = this.getSize().height;
			@Pc(101) int local101 = 32;
			try {
				@Pc(106) int local106 = Integer.parseInt(this.getParameter("modewhat"));
				local101 += local106;
			} catch (@Pc(112) Exception local112) {
			}
			try {
				@Pc(116) String local116 = this.getParameter("lang");
				if (local116 != null) {
					this.anInt10841 = Integer.parseInt(local116);
				}
			} catch (@Pc(125) Exception local125) {
			}
			Class399.method9206(Class398.aStringArray67[local37], local101);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString160, 0, this.lb.anInt10835);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10834);
					this.bar = this.method9204(this.lb.aString159);
					this.background = this.method9204(this.lb.aString164);
					this.left = this.method9204(this.lb.aString167);
					this.right = this.method9204(this.lb.aString162);
					this.top = this.method9204(this.lb.aString161);
					this.bottom = this.method9204(this.lb.aString165);
					this.bodyLeft = this.method9204(this.lb.aString163);
					this.bodyRight = this.method9204(this.lb.aString158);
					this.bodyFill = this.method9204(this.lb.aString166);
					@Pc(280) Image[] local280 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(285) MediaTracker local285 = new MediaTracker(this);
					for (@Pc(287) int local287 = 0; local287 < local280.length; local287++) {
						local285.addImage(local280[local287], local287);
					}
					while (true) {
						try {
							local285.waitForAll();
							break;
						} catch (@Pc(304) InterruptedException local304) {
						}
					}
				} catch (@Pc(308) Throwable local308) {
					this.method9193();
				}
			}
			@Pc(313) unpack local313 = null;
			@Pc(321) byte[] local321;
			try {
				Class.forName("java.util.jar.Pack200");
				local321 = this.method9199(Class398.aClass397_2);
				if (local321 == null) {
					return;
				}
				local313 = new unpack_Sub1(local321);
			} catch (@Pc(331) Throwable local331) {
			}
			if (local313 == null) {
				local321 = this.method9199(Class398.aClass397_1);
				if (local321 == null) {
					return;
				}
				@Pc(348) unpack local348 = new unpack(local321);
				@Pc(353) ClassLoader_Sub1 local353 = new ClassLoader_Sub1(local348);
				@Pc(356) Class local356 = Class.forName("unpack");
				local353.method9190(local356, local356.getName());
				@Pc(366) Class local366 = local353.loadClass("unpackclass");
				@Pc(371) byte[] local371 = this.method9199(Class398.aClass397_3);
				if (local371 == null) {
					return;
				}
				local313 = (unpack) local366.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local371, Boolean.TRUE);
			}
			@Pc(406) ClassLoader_Sub1 local406 = new ClassLoader_Sub1(local313);
			@Pc(409) Class local409 = Class.forName("Class399");
			local406.method9190(local409, local409.getName());
			@Pc(419) Class local419 = local406.loadClass("client");
			synchronized (this) {
				if (this.aBoolean749) {
					return;
				}
				this.anApplet7 = (Applet) local419.getDeclaredConstructor().newInstance();
				local419.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet7.init();
				if (this.aBoolean752) {
					this.anApplet7.start();
				}
				if (this.aBoolean750) {
					this.anApplet7.stop();
				}
			}
			this.method9201();
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt10833 = -588529318;
			if (local488 instanceof InvocationTargetException) {
				@Pc(497) Throwable local497 = ((InvocationTargetException) local488).getTargetException();
				if (local497 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9181(local497, this, local488.toString());
			} else {
				RuntimeException_Sub2.method9181(local488, this, (String) null);
			}
			this.method9194("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9192(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10839 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet7 != null) {
			this.anApplet7.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9193() {
		this.bfm = null;
		this.aBoolean748 = true;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9194(@OriginalArg(1) String arg0) {
		if (this.aBoolean751) {
			return;
		}
		this.aBoolean751 = true;
		try {
			if (aString171 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString171 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method9195(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10839, this.anInt10840);
			this.canvas.setVisible(true);
		}
		@Pc(32) Graphics local32 = this.canvas.getGraphics();
		if (local32 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10839, this.anInt10840);
			}
			@Pc(54) Graphics local54 = this.anImage14.getGraphics();
			@Pc(59) int local59 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(64) int local64 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(69) int local69 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(74) int local74 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(79) int local79 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(84) int local84 = this.bodyFill.getHeight((ImageObserver) null);
			local54.drawImage(this.bodyLeft, this.method9192(local59) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9197(local74) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(127) int local127 = local59 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(137) int local137 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(139) int local139;
			for (local139 = local127; local139 <= local137; local139 += local69) {
				local54.drawImage(this.bodyFill, local139 + this.method9192(local59) + this.lb.boxXOffset, this.method9197(local84) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local54.drawImage(this.bodyRight, this.method9192(local64) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9197(local79) - -this.lb.boxYOffset, (ImageObserver) null);
			local139 = this.left.getWidth((ImageObserver) null);
			@Pc(217) int local217 = this.left.getHeight((ImageObserver) null);
			@Pc(222) int local222 = this.right.getWidth((ImageObserver) null);
			@Pc(227) int local227 = this.right.getHeight((ImageObserver) null);
			@Pc(232) int local232 = this.bottom.getHeight((ImageObserver) null);
			@Pc(237) int local237 = this.top.getWidth((ImageObserver) null);
			@Pc(242) int local242 = this.top.getHeight((ImageObserver) null);
			@Pc(247) int local247 = this.bottom.getWidth((ImageObserver) null);
			@Pc(252) int local252 = this.bar.getWidth((ImageObserver) null);
			@Pc(257) int local257 = this.background.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.method9192(this.lb.width) + this.lb.xOffset;
			@Pc(281) int local281 = this.method9197(this.lb.height) + this.lb.yOffset;
			local54.drawImage(this.left, local269, (this.lb.height - local217) / 2 + local281, (ImageObserver) null);
			local54.drawImage(this.right, this.lb.width + local269 - local222, (-local227 + this.lb.height) / 2 + local281, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local222 - local139, this.lb.height);
			}
			@Pc(346) Graphics local346 = this.barBuf.getGraphics();
			@Pc(348) int local348;
			for (local348 = 0; local348 < this.lb.width - local139 - local222; local348 += local237) {
				local346.drawImage(this.top, local348, 0, (ImageObserver) null);
			}
			for (local348 = 0; local348 < this.lb.width - local222 - local139; local348 += local247) {
				local346.drawImage(this.bottom, local348, this.lb.height - local232, (ImageObserver) null);
			}
			local348 = (this.lb.width - local139 - local222) * arg0 / 100;
			if (local348 > 0) {
				@Pc(436) Image local436 = this.createImage(local348, this.lb.height - local232 - local242);
				@Pc(440) int local440 = local436.getWidth((ImageObserver) null);
				@Pc(443) Graphics local443 = local436.getGraphics();
				for (@Pc(448) int local448 = arg2 - local252; local448 < local440; local448 += local252) {
					local443.drawImage(this.bar, local448, 0, (ImageObserver) null);
				}
				local346.drawImage(local436, 0, local242, (ImageObserver) null);
			}
			@Pc(474) int local474 = local348;
			local348 = this.lb.width - local348 - local139 - local222;
			if (local348 > 0) {
				@Pc(501) Image local501 = this.createImage(local348, this.lb.height - local242 - local232);
				@Pc(505) int local505 = local501.getWidth((ImageObserver) null);
				@Pc(508) Graphics local508 = local501.getGraphics();
				for (@Pc(510) int local510 = 0; local510 < local505; local510 += local257) {
					local508.drawImage(this.background, local510, 0, (ImageObserver) null);
				}
				local346.drawImage(local501, local474, local242, (ImageObserver) null);
			}
			local54.drawImage(this.barBuf, local139 + local269, local281, (ImageObserver) null);
			local54.setFont(this.bf);
			local54.setColor(this.colourtext);
			@Pc(565) String local565 = arg1 + " - " + arg0 + "%";
			local54.drawString(local565, (this.lb.width - this.bfm.stringWidth(local565)) / 2 + local269, local281 - (-(this.lb.height / 2) + -4 + -this.lb.textYOffset));
			local32.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(605) Exception local605) {
			this.method9193();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method9196(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local16];
			local27.readFully(local30, 0, local16);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean749 = true;
		this.aBoolean752 = this.aBoolean750 = false;
		if (this.anApplet7 != null) {
			this.anApplet7.destroy();
		}
		this.anApplet7 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9197(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10840 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method9198(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method9194("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;)[B")
	private byte[] method9199(@OriginalArg(1) Class397 arg0) {
		@Pc(6) File local6;
		try {
			local6 = Class399.method9207(arg0.aString169);
		} catch (@Pc(8) Exception local8) {
			this.method9194("nocache");
			return null;
		}
		@Pc(19) byte[] local19 = this.method9196(local6);
		if (!this.method9203(local19, arg0)) {
			local19 = this.method9202(arg0, false);
			if (local19 == null) {
				local19 = this.method9202(arg0, true);
			}
			if (local19 == null) {
				this.method9194("download");
				return null;
			}
			if (!this.method9198(local19, local6)) {
				return null;
			}
			local19 = this.method9196(local6);
			if (!this.method9203(local19, arg0)) {
				this.method9194("mismatch");
				return null;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(4) Container local4 = this.getParent();
		if (local4 != null) {
			local4.setBackground(Color.black);
		}
		this.aBoolean749 = false;
		this.setBackground(Color.black);
		@Pc(22) Thread local22 = new Thread(this);
		local22.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;I)Z")
	private boolean method9200(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class398.aClass396Array1[anInt10838] == null || this.aBoolean748 ? this.method9191(arg1, arg0) : this.method9195(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9201() {
		this.aColor3 = null;
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet7 != null) {
			this.anApplet7.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean752 = true;
		this.aBoolean750 = false;
		if (this.anApplet7 != null) {
			this.anApplet7.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!d;Z)[B")
	private byte[] method9202(@OriginalArg(1) Class397 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10837];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(61) InputStream local61;
			if (arg1) {
				@Pc(24) URL local24 = this.getCodeBase();
				@Pc(32) Socket local32 = new Socket(InetAddress.getByName(local24.getHost()), 443);
				local32.setSoTimeout(10000);
				@Pc(38) OutputStream local38 = local32.getOutputStream();
				local38.write(17);
				local38.write(("JAGGRAB " + local24.getFile() + arg0.aString168 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0.aString168)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local5.length <= local76) {
					local61.close();
					if (arg0.anInt10837 != arg0.anInt10836) {
						@Pc(185) byte[] local185 = new byte[arg0.anInt10836];
						@Pc(190) Inflater local190 = new Inflater(true);
						local190.setInput(local5);
						local5 = local185;
						local190.inflate(local185);
					}
					break;
				}
				@Pc(92) int local92 = local5.length - local76;
				if (local92 > 1000) {
					local92 = 1000;
				}
				@Pc(106) int local106 = local61.read(local5, local76, local92);
				if (local106 < 0) {
					throw new EOFException();
				}
				local76 += local106;
				@Pc(123) int local123 = local76 * 100 / local5.length;
				@Pc(125) int local125 = 0;
				if (this.lb != null && this.bar != null) {
					local125 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local123 != local74 || local78 != local125) {
					try {
						if (this.method9200(local123, arg0.aStringArray66[this.anInt10841], local125)) {
							local78 = local125;
							local74 = local123;
						}
					} catch (@Pc(171) Exception local171) {
					}
				}
			}
		} catch (@Pc(201) Exception local201) {
			return null;
		}
		return this.method9203(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!d;)Z")
	private boolean method9203(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class397 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(26) byte[] local26 = local10.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (local26[local28] != arg1.anIntArray718[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method9194("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)Ljava/awt/Image;")
	private Image method9204(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}
}
