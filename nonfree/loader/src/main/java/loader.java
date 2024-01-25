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

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString126;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString127;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt10718 = 0;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean768;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage21;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class381 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt10717;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt10719;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean766 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean769 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean767 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private int anInt10720 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8655() {
		this.anImage21 = null;
		this.aColor2 = null;
		this.barBuf = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;I)[B")
	private byte[] method8656(@OriginalArg(0) Class382 arg0) {
		@Pc(6) File local6;
		try {
			local6 = Class383.method8670(arg0.aString124);
		} catch (@Pc(17) Exception local17) {
			this.method8662("nocache");
			return null;
		}
		@Pc(30) byte[] local30 = this.method8658(local6);
		if (!this.method8659(arg0, local30)) {
			local30 = this.method8667(false, arg0);
			if (local30 == null) {
				local30 = this.method8667(true, arg0);
			}
			if (local30 == null) {
				this.method8662("download");
				return null;
			}
			if (!this.method8657(local6, local30)) {
				return null;
			}
			local30 = this.method8658(local6);
			if (!this.method8659(arg0, local30)) {
				this.method8662("mismatch");
				return null;
			}
		}
		return local30;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString127 = this.getParameter("unsignedurl");
			if (aString127 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean770 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString127), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString126 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class380.aStringArray40.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(65) String local65 = this.getParameter("colourid");
			if (local65 != null) {
				anInt10718 = Integer.parseInt(local65);
				if (anInt10718 < 0 || anInt10718 >= Class380.anIntArray628.length) {
					anInt10718 = 0;
				}
			}
			this.lb = Class380.aClass381Array1[anInt10718];
			this.anInt10717 = this.getSize().width;
			this.anInt10719 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt10720 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class383.method8669(local99, Class380.aStringArray40[local39]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString115, 0, this.lb.anInt10713);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10712);
					this.bar = this.method8665(this.lb.aString119);
					this.background = this.method8665(this.lb.aString113);
					this.left = this.method8665(this.lb.aString122);
					this.right = this.method8665(this.lb.aString120);
					this.top = this.method8665(this.lb.aString117);
					this.bottom = this.method8665(this.lb.aString114);
					this.bodyLeft = this.method8665(this.lb.aString116);
					this.bodyRight = this.method8665(this.lb.aString118);
					this.bodyFill = this.method8665(this.lb.aString121);
					@Pc(279) Image[] local279 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(284) MediaTracker local284 = new MediaTracker(this);
					for (@Pc(286) int local286 = 0; local286 < local279.length; local286++) {
						local284.addImage(local279[local286], local286);
					}
					while (true) {
						try {
							local284.waitForAll();
							break;
						} catch (@Pc(303) InterruptedException local303) {
						}
					}
				} catch (@Pc(307) Throwable local307) {
					this.method8668();
				}
			}
			@Pc(312) unpack local312 = null;
			@Pc(320) byte[] local320;
			try {
				Class.forName("java.util.jar.Pack200");
				local320 = this.method8656(Class380.aClass382_2);
				if (local320 == null) {
					return;
				}
				local312 = new unpack_Sub1(local320);
			} catch (@Pc(332) Throwable local332) {
			}
			if (local312 == null) {
				local320 = this.method8656(Class380.aClass382_1);
				if (local320 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local320);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method8651(local355.getName(), local355);
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method8656(Class380.aClass382_3);
				if (local370 == null) {
					return;
				}
				local312 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(406) ClassLoader_Sub1 local406 = new ClassLoader_Sub1(local312);
			@Pc(409) Class local409 = Class.forName("Class383");
			local406.method8651(local409.getName(), local409);
			@Pc(419) Class local419 = local406.loadClass("client");
			synchronized (this) {
				if (this.aBoolean767) {
					return;
				}
				this.anApplet3 = (Applet) local419.getDeclaredConstructor().newInstance();
				local419.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean769) {
					this.anApplet3.start();
				}
				if (this.aBoolean766) {
					this.anApplet3.stop();
				}
			}
			this.method8655();
		} catch (@Pc(489) Exception local489) {
			RuntimeException_Sub2.anInt10716 = -129461914;
			if (local489 instanceof InvocationTargetException) {
				@Pc(505) Throwable local505 = ((InvocationTargetException) local489).getTargetException();
				if (local505 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8650(local489.toString(), local505, this);
			} else {
				RuntimeException_Sub2.method8650(null, local489, this);
			}
			this.method8662("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean769 = this.aBoolean766 = false;
		this.aBoolean767 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method8657(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method8662("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method8658(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local8];
			local27.readFully(local30, 0, local8);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean767 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;B[B)Z")
	private boolean method8659(@OriginalArg(0) Class382 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(25) byte[] local25 = local9.digest();
			for (@Pc(27) int local27 = 0; local27 < 20; local27++) {
				if (local25[local27] != arg0.anIntArray630[local27]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(52) Exception local52) {
			this.method8662("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8660(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10717 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method8661(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class380.aClass381Array1[anInt10718] == null || this.aBoolean768 ? this.method8666(arg2, arg0) : this.method8663(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean766 = false;
		this.aBoolean769 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8662(@OriginalArg(0) String arg0) {
		if (this.aBoolean770) {
			return;
		}
		this.aBoolean770 = true;
		try {
			if (aString126 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString126 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method8663(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10717, this.anInt10719);
			this.canvas.setVisible(true);
		}
		@Pc(43) Graphics local43 = this.canvas.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage21 == null) {
				this.anImage21 = this.createImage(this.anInt10717, this.anInt10719);
			}
			@Pc(61) Graphics local61 = this.anImage21.getGraphics();
			@Pc(66) int local66 = this.bodyLeft.getWidth(null);
			@Pc(71) int local71 = this.bodyRight.getWidth(null);
			@Pc(76) int local76 = this.bodyFill.getWidth(null);
			@Pc(81) int local81 = this.bodyLeft.getHeight(null);
			@Pc(86) int local86 = this.bodyRight.getHeight(null);
			@Pc(91) int local91 = this.bodyFill.getHeight(null);
			local61.drawImage(this.bodyLeft, this.method8660(local66) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8664(local81) + this.lb.boxYOffset, null);
			@Pc(133) int local133 = local66 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(143) int local143 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(145) int local145;
			for (local145 = local133; local145 <= local143; local145 += local76) {
				local61.drawImage(this.bodyFill, this.method8660(local66) + this.lb.boxXOffset + local145, this.method8664(local91) + this.lb.boxYOffset, null);
			}
			local61.drawImage(this.bodyRight, this.method8660(local71) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8664(local86) - -this.lb.boxYOffset, null);
			local145 = this.left.getWidth(null);
			@Pc(223) int local223 = this.left.getHeight(null);
			@Pc(228) int local228 = this.right.getWidth(null);
			@Pc(233) int local233 = this.right.getHeight(null);
			@Pc(238) int local238 = this.bottom.getHeight(null);
			@Pc(243) int local243 = this.top.getWidth(null);
			@Pc(248) int local248 = this.top.getHeight(null);
			@Pc(253) int local253 = this.bottom.getWidth(null);
			@Pc(258) int local258 = this.bar.getWidth(null);
			@Pc(263) int local263 = this.background.getWidth(null);
			@Pc(275) int local275 = this.method8660(this.lb.width) + this.lb.xOffset;
			@Pc(286) int local286 = this.method8664(this.lb.height) + this.lb.yOffset;
			local61.drawImage(this.left, local275, (this.lb.height - local223) / 2 + local286, null);
			local61.drawImage(this.right, this.lb.width + local275 - local228, local286 - -((this.lb.height + -local233) / 2), null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local145 - local228, this.lb.height);
			}
			@Pc(350) Graphics local350 = this.barBuf.getGraphics();
			@Pc(352) int local352;
			for (local352 = 0; local352 < this.lb.width - local228 - local145; local352 += local243) {
				local350.drawImage(this.top, local352, 0, null);
			}
			for (local352 = 0; local352 < this.lb.width - local228 - local145; local352 += local253) {
				local350.drawImage(this.bottom, local352, this.lb.height - local238, null);
			}
			local352 = arg2 * (this.lb.width - local145 - local228) / 100;
			if (local352 > 0) {
				@Pc(443) Image local443 = this.createImage(local352, this.lb.height - local238 - local248);
				@Pc(447) int local447 = local443.getWidth(null);
				@Pc(450) Graphics local450 = local443.getGraphics();
				for (@Pc(455) int local455 = arg0 - local258; local455 < local447; local455 += local258) {
					local450.drawImage(this.bar, local455, 0, null);
				}
				local350.drawImage(local443, 0, local248, null);
			}
			@Pc(481) int local481 = local352;
			local352 = this.lb.width - local228 - local145 - local352;
			if (local352 > 0) {
				@Pc(508) Image local508 = this.createImage(local352, this.lb.height - local238 - local248);
				@Pc(512) int local512 = local508.getWidth(null);
				@Pc(515) Graphics local515 = local508.getGraphics();
				for (@Pc(517) int local517 = 0; local517 < local512; local517 += local263) {
					local515.drawImage(this.background, local517, 0, null);
				}
				local350.drawImage(local508, local481, local248, null);
			}
			local61.drawImage(this.barBuf, local145 + local275, local286, null);
			local61.setFont(this.bf);
			local61.setColor(this.colourtext);
			@Pc(576) String local576 = arg1 + " - " + arg2 + "%";
			local61.drawString(local576, (this.lb.width - this.bfm.stringWidth(local576)) / 2 + local275, this.lb.textYOffset + 4 + this.lb.height / 2 + local286);
			local43.drawImage(this.anImage21, 0, 0, null);
		} catch (@Pc(615) Exception local615) {
			this.method8668();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean769 = false;
		this.aBoolean766 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method8664(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10719 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/awt/Image;")
	private Image method8665(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(38) Exception local38) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method8666(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class380.anIntArray628[anInt10718]);
			this.aColor2 = new Color(Class380.anIntArray629[anInt10718]);
			this.colourtext = new Color(Class380.anIntArray627[anInt10718]);
		}
		@Pc(51) Graphics local51 = this.getGraphics();
		if (local51 == null) {
			this.repaint();
			return false;
		}
		@Pc(91) int local91;
		@Pc(98) int local98;
		@Pc(165) String local165;
		try {
			if (this.anImage21 == null) {
				this.anImage21 = this.createImage(this.anInt10717, this.anInt10719);
			}
			@Pc(69) Graphics local69 = this.anImage21.getGraphics();
			local69.setColor(Color.black);
			local69.fillRect(0, 0, this.anInt10717, this.anInt10719);
			local69.setColor(this.aColor3);
			local91 = this.anInt10717 / 2 - 152;
			local98 = this.anInt10719 / 2 - 18;
			local69.drawRect(local91, local98, 303, 33);
			local69.setColor(this.aColor2);
			local69.fillRect(local91 + 2, local98 + 2, arg0 * 3, 30);
			local69.setColor(Color.black);
			local69.drawRect(local91 + 1, local98 + 1, 301, 31);
			local69.fillRect(arg0 * 3 + local91 + 2, local98 + 2, 300 - arg0 * 3, 30);
			local165 = arg1 + " - " + arg0 + "%";
			local69.setFont(this.bf);
			local69.setColor(this.colourtext);
			local69.drawString(local165, (this.anInt10717 - this.bfm.stringWidth(local165)) / 2, this.anInt10719 / 2 + 4);
			local51.drawImage(this.anImage21, 0, 0, null);
		} catch (@Pc(201) Exception local201) {
			local51.setColor(Color.black);
			local51.fillRect(0, 0, this.anInt10717, this.anInt10719);
			local51.setColor(this.aColor3);
			local91 = this.anInt10717 / 2 - 152;
			local98 = this.anInt10719 / 2 - 18;
			local51.drawRect(local91, local98, 303, 33);
			local51.setColor(this.aColor2);
			local51.fillRect(local91 + 2, local98 + 2, arg0 * 3, 30);
			local51.setColor(Color.black);
			local51.drawRect(local91 + 1, local98 + 1, 301, 31);
			local51.fillRect(arg0 * 3 + local91 + 2, local98 - -2, 300 - arg0 * 3, 30);
			local165 = arg1 + " - " + arg0 + "%";
			local51.setFont(this.bf);
			local51.setColor(this.colourtext);
			local51.drawString(local165, (this.anInt10717 - this.bfm.stringWidth(local165)) / 2, this.anInt10719 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!d;)[B")
	private byte[] method8667(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class382 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10715];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString123 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1.aString123)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local5.length <= local76) {
					local30.close();
					if (arg1.anInt10714 != arg1.anInt10715) {
						@Pc(182) byte[] local182 = new byte[arg1.anInt10714];
						@Pc(187) Inflater local187 = new Inflater(true);
						local187.setInput(local5);
						local187.inflate(local182);
						local5 = local182;
					}
					break;
				}
				@Pc(88) int local88 = local5.length - local76;
				if (local88 > 1000) {
					local88 = 1000;
				}
				@Pc(102) int local102 = local30.read(local5, local76, local88);
				if (local102 < 0) {
					throw new EOFException();
				}
				local76 += local102;
				@Pc(122) int local122 = local76 * 100 / local5.length;
				@Pc(124) int local124 = 0;
				if (this.lb != null && this.bar != null) {
					local124 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local74 != local122 || local124 != local78) {
					try {
						if (this.method8661(arg1.aStringArray41[this.anInt10720], local124, local122)) {
							local78 = local124;
							local74 = local122;
						}
					} catch (@Pc(165) Exception local165) {
					}
				}
			}
		} catch (@Pc(198) Exception local198) {
			return null;
		}
		return this.method8659(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method8668() {
		this.aBoolean768 = true;
		this.bfm = null;
		this.bf = null;
	}
}
