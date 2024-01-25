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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString141;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString142;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt10646 = 0;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!h;")
	private Class399 lb;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10645;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean810;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt10647;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt10644 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean808 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean811 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean809 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean812 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9019(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10647, this.anInt10645);
			this.canvas.setVisible(true);
		}
		@Pc(41) Graphics local41 = this.canvas.getGraphics();
		if (local41 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10647, this.anInt10645);
			}
			@Pc(60) Graphics local60 = this.anImage14.getGraphics();
			@Pc(65) int local65 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(70) int local70 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(75) int local75 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(85) int local85 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(90) int local90 = this.bodyFill.getHeight((ImageObserver) null);
			local60.drawImage(this.bodyLeft, this.method9028(local65) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9032(local80) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(134) int local134 = this.lb.boxXOffset + local65 - this.lb.boxWidth / 2;
			@Pc(144) int local144 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(146) int local146;
			for (local146 = local134; local146 <= local144; local146 += local75) {
				local60.drawImage(this.bodyFill, this.method9028(local65) + this.lb.boxXOffset + local146, this.method9032(local90) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local60.drawImage(this.bodyRight, this.method9028(local70) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9032(local85) + this.lb.boxYOffset, (ImageObserver) null);
			local146 = this.left.getWidth((ImageObserver) null);
			@Pc(224) int local224 = this.left.getHeight((ImageObserver) null);
			@Pc(229) int local229 = this.right.getWidth((ImageObserver) null);
			@Pc(234) int local234 = this.right.getHeight((ImageObserver) null);
			@Pc(239) int local239 = this.bottom.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.top.getWidth((ImageObserver) null);
			@Pc(249) int local249 = this.top.getHeight((ImageObserver) null);
			@Pc(254) int local254 = this.bottom.getWidth((ImageObserver) null);
			@Pc(259) int local259 = this.bar.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.background.getWidth((ImageObserver) null);
			@Pc(275) int local275 = this.method9028(this.lb.width) + this.lb.xOffset;
			@Pc(286) int local286 = this.method9032(this.lb.height) + this.lb.yOffset;
			local60.drawImage(this.left, local275, local286 + (this.lb.height - local224) / 2, (ImageObserver) null);
			local60.drawImage(this.right, this.lb.width + local275 - local229, (-local234 + this.lb.height) / 2 + local286, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local229 - local146, this.lb.height);
			}
			@Pc(352) Graphics local352 = this.barBuf.getGraphics();
			@Pc(354) int local354;
			for (local354 = 0; local354 < this.lb.width - local146 - local229; local354 += local244) {
				local352.drawImage(this.top, local354, 0, (ImageObserver) null);
			}
			for (local354 = 0; local354 < this.lb.width - local229 - local146; local354 += local254) {
				local352.drawImage(this.bottom, local354, this.lb.height - local239, (ImageObserver) null);
			}
			local354 = arg1 * (this.lb.width - local146 - local229) / 100;
			if (local354 > 0) {
				@Pc(441) Image local441 = this.createImage(local354, this.lb.height - local249 - local239);
				@Pc(445) int local445 = local441.getWidth((ImageObserver) null);
				@Pc(448) Graphics local448 = local441.getGraphics();
				for (@Pc(452) int local452 = arg2 - local259; local452 < local445; local452 += local259) {
					local448.drawImage(this.bar, local452, 0, (ImageObserver) null);
				}
				local352.drawImage(local441, 0, local249, (ImageObserver) null);
			}
			@Pc(482) int local482 = local354;
			local354 = this.lb.width - local229 - local146 - local354;
			if (local354 > 0) {
				@Pc(510) Image local510 = this.createImage(local354, this.lb.height - local249 - local239);
				@Pc(514) int local514 = local510.getWidth((ImageObserver) null);
				@Pc(517) Graphics local517 = local510.getGraphics();
				for (@Pc(519) int local519 = 0; local519 < local514; local519 += local264) {
					local517.drawImage(this.background, local519, 0, (ImageObserver) null);
				}
				local352.drawImage(local510, local482, local249, (ImageObserver) null);
			}
			local60.drawImage(this.barBuf, local275 + local146, local286, (ImageObserver) null);
			local60.setFont(this.bf);
			local60.setColor(this.colourtext);
			@Pc(574) String local574 = arg0 + " - " + arg1 + "%";
			local60.drawString(local574, local275 + (this.lb.width - this.bfm.stringWidth(local574)) / 2, this.lb.textYOffset + 4 + this.lb.height / 2 + local286);
			local41.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(613) Exception local613) {
			this.method9029();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/awt/Image;")
	private Image method9020(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(12) InputStream local12 = this.getClass().getResourceAsStream(arg0);
			@Pc(15) byte[] local15 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(21) int local21;
			while ((local21 = local12.read()) != -1) {
				local15[local17++] = (byte) local21;
			}
			return Toolkit.getDefaultToolkit().createImage(local15);
		} catch (@Pc(38) Exception local38) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9021() {
		this.aColor3 = null;
		this.anImage14 = null;
		this.aColor2 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method9022(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class398.anIntArray732[anInt10646]);
			this.aColor3 = new Color(Class398.anIntArray733[anInt10646]);
			this.colourtext = new Color(Class398.anIntArray731[anInt10646]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(95) int local95;
		@Pc(102) int local102;
		@Pc(174) String local174;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10647, this.anInt10645);
			}
			@Pc(73) Graphics local73 = this.anImage14.getGraphics();
			local73.setColor(Color.black);
			local73.fillRect(0, 0, this.anInt10647, this.anInt10645);
			local73.setColor(this.aColor2);
			local95 = this.anInt10647 / 2 - 152;
			local102 = this.anInt10645 / 2 - 18;
			local73.drawRect(local95, local102, 303, 33);
			local73.setColor(this.aColor3);
			local73.fillRect(local95 + 2, local102 + 2, arg0 * 3, 30);
			local73.setColor(Color.black);
			local73.drawRect(local95 + 1, local102 + 1, 301, 31);
			local73.fillRect(local95 + arg0 * 3 + 2, local102 + 2, 300 - arg0 * 3, 30);
			local73.setFont(this.bf);
			local174 = arg1 + " - " + arg0 + "%";
			local73.setColor(this.colourtext);
			local73.drawString(local174, (this.anInt10647 - this.bfm.stringWidth(local174)) / 2, this.anInt10645 / 2 + 4);
			local50.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(206) Exception local206) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt10647, this.anInt10645);
			local50.setColor(this.aColor2);
			local95 = this.anInt10647 / 2 - 152;
			local102 = this.anInt10645 / 2 - 18;
			local50.drawRect(local95, local102, 303, 33);
			local50.setColor(this.aColor3);
			local50.fillRect(local95 + 2, local102 + 2, arg0 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local95 + 1, local102 + 1, 301, 31);
			local50.fillRect(local95 + arg0 * 3 + 2, local102 + 2, 300 - arg0 * 3, 30);
			local174 = arg1 + " - " + arg0 + "%";
			local50.setFont(this.bf);
			local50.setColor(this.colourtext);
			local50.drawString(local174, (this.anInt10647 - this.bfm.stringWidth(local174)) / 2, this.anInt10645 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean812 = this.aBoolean809 = false;
		this.aBoolean811 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method9023(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local15];
			local26.readFully(local29, 0, local15);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BILjava/lang/String;I)Z")
	private boolean method9024(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class398.aClass399Array1[anInt10646] == null || this.aBoolean810 ? this.method9022(arg2, arg1) : this.method9019(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method9025(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method9026("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method9026(@OriginalArg(0) String arg0) {
		if (this.aBoolean808) {
			return;
		}
		this.aBoolean808 = true;
		try {
			if (aString142 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString142 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString141 = this.getParameter("unsignedurl");
			if (aString141 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean808 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString141), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString142 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class398.aStringArray51.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10646 = Integer.parseInt(local64);
				if (anInt10646 < 0 || Class398.anIntArray732.length <= anInt10646) {
					anInt10646 = 0;
				}
			}
			this.lb = Class398.aClass399Array1[anInt10646];
			this.anInt10647 = this.getSize().width;
			this.anInt10645 = this.getSize().height;
			@Pc(103) int local103 = 32;
			try {
				@Pc(108) int local108 = Integer.parseInt(this.getParameter("modewhat"));
				local103 += local108;
			} catch (@Pc(114) Exception local114) {
			}
			try {
				@Pc(118) String local118 = this.getParameter("lang");
				if (local118 != null) {
					this.anInt10644 = Integer.parseInt(local118);
				}
			} catch (@Pc(127) Exception local127) {
			}
			Class397.method9007(local103, Class398.aStringArray51[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString138, 0, this.lb.anInt10643);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10642);
					this.bar = this.method9020(this.lb.aString135);
					this.background = this.method9020(this.lb.aString140);
					this.left = this.method9020(this.lb.aString137);
					this.right = this.method9020(this.lb.aString131);
					this.top = this.method9020(this.lb.aString136);
					this.bottom = this.method9020(this.lb.aString133);
					this.bodyLeft = this.method9020(this.lb.aString139);
					this.bodyRight = this.method9020(this.lb.aString132);
					this.bodyFill = this.method9020(this.lb.aString134);
					@Pc(284) Image[] local284 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(289) MediaTracker local289 = new MediaTracker(this);
					for (@Pc(291) int local291 = 0; local291 < local284.length; local291++) {
						local289.addImage(local284[local291], local291);
					}
					while (true) {
						try {
							local289.waitForAll();
							break;
						} catch (@Pc(312) InterruptedException local312) {
						}
					}
				} catch (@Pc(316) Throwable local316) {
					this.method9029();
				}
			}
			@Pc(321) unpack local321 = null;
			@Pc(329) byte[] local329;
			try {
				Class.forName("java.util.jar.Pack200");
				local329 = this.method9030(Class398.aClass396_2);
				if (local329 == null) {
					return;
				}
				local321 = new unpack_Sub1(local329);
			} catch (@Pc(340) Throwable local340) {
			}
			if (local321 == null) {
				local329 = this.method9030(Class398.aClass396_1);
				if (local329 == null) {
					return;
				}
				@Pc(355) unpack local355 = new unpack(local329);
				@Pc(360) ClassLoader_Sub1 local360 = new ClassLoader_Sub1(local355);
				@Pc(363) Class local363 = Class.forName("unpack");
				local360.method9010(local363, local363.getName());
				@Pc(373) Class local373 = local360.loadClass("unpackclass");
				@Pc(378) byte[] local378 = this.method9030(Class398.aClass396_3);
				if (local378 == null) {
					return;
				}
				local321 = (unpack) local373.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local378, Boolean.TRUE);
			}
			@Pc(413) ClassLoader_Sub1 local413 = new ClassLoader_Sub1(local321);
			@Pc(416) Class local416 = Class.forName("Class397");
			local413.method9010(local416, local416.getName());
			@Pc(426) Class local426 = local413.loadClass("client");
			synchronized (this) {
				if (this.aBoolean811) {
					return;
				}
				this.anApplet3 = (Applet) local426.getDeclaredConstructor().newInstance();
				local426.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean812) {
					this.anApplet3.start();
				}
				if (this.aBoolean809) {
					this.anApplet3.stop();
				}
			}
			this.method9021();
		} catch (@Pc(496) Exception local496) {
			RuntimeException_Sub2.anInt10641 = -701111871;
			if (local496 instanceof InvocationTargetException) {
				@Pc(505) Throwable local505 = ((InvocationTargetException) local496).getTargetException();
				if (local505 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9015(this, local496.toString(), local505);
			} else {
				RuntimeException_Sub2.method9015(this, (String) null, local496);
			}
			this.method9026("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean809 = true;
		this.aBoolean812 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!b;[B)Z")
	private boolean method9027(@OriginalArg(1) Class396 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg1);
			@Pc(21) byte[] local21 = local13.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (local21[local23] != arg0.anIntArray730[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(42) Exception local42) {
			this.method9026("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9028(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10647 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9029() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean810 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean811 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;I)[B")
	private byte[] method9030(@OriginalArg(0) Class396 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class397.method9006(arg0.aString127);
		} catch (@Pc(6) Exception local6) {
			this.method9026("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method9023(local4);
		if (!this.method9027(arg0, local24)) {
			local24 = this.method9031(arg0, false);
			if (local24 == null) {
				local24 = this.method9031(arg0, true);
			}
			if (local24 == null) {
				this.method9026("download");
				return null;
			}
			if (!this.method9025(local4, local24)) {
				return null;
			}
			local24 = this.method9023(local4);
			if (!this.method9027(arg0, local24)) {
				this.method9026("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;ZI)[B")
	private byte[] method9031(@OriginalArg(0) Class396 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10638];
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
				local38.write(("JAGGRAB " + local24.getFile() + arg0.aString126 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0.aString126)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local76 >= local5.length) {
					local61.close();
					if (arg0.anInt10638 != arg0.anInt10639) {
						@Pc(192) byte[] local192 = new byte[arg0.anInt10639];
						@Pc(197) Inflater local197 = new Inflater(true);
						local197.setInput(local5);
						local197.inflate(local192);
						local5 = local192;
					}
					break;
				}
				@Pc(88) int local88 = local5.length - local76;
				if (local88 > 1000) {
					local88 = 1000;
				}
				@Pc(101) int local101 = local61.read(local5, local76, local88);
				if (local101 < 0) {
					throw new EOFException();
				}
				local76 += local101;
				@Pc(121) int local121 = local76 * 100 / local5.length;
				@Pc(123) int local123 = 0;
				if (this.lb != null && this.bar != null) {
					local123 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local121 != local74 || local78 != local123) {
					try {
						if (this.method9024(local123, arg0.aStringArray50[this.anInt10644], local121)) {
							local78 = local123;
							local74 = local121;
						}
					} catch (@Pc(174) Exception local174) {
					}
				}
			}
		} catch (@Pc(208) Exception local208) {
			return null;
		}
		return this.method9027(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean809 = false;
		this.aBoolean812 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method9032(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10645 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}
}
