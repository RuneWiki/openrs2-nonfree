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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString147;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString148;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private static int anInt10373 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class397 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean771;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt10374;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private int anInt10375;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean769 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt10372 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean772 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean773 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;B)Z")
	private boolean method8783(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class398.anIntArray674[anInt10373]);
			this.aColor2 = new Color(Class398.anIntArray675[anInt10373]);
			this.colourtext = new Color(Class398.anIntArray673[anInt10373]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(168) String local168;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10374, this.anInt10375);
			}
			@Pc(71) Graphics local71 = this.anImage14.getGraphics();
			local71.setColor(Color.black);
			local71.fillRect(0, 0, this.anInt10374, this.anInt10375);
			local71.setColor(this.aColor3);
			local93 = this.anInt10374 / 2 - 152;
			local100 = this.anInt10375 / 2 - 18;
			local71.drawRect(local93, local100, 303, 33);
			local71.setColor(this.aColor2);
			local71.fillRect(local93 + 2, local100 + 2, arg0 * 3, 30);
			local71.setColor(Color.black);
			local71.drawRect(local93 + 1, local100 + 1, 301, 31);
			local71.fillRect(local93 + arg0 * 3 + 2, local100 - -2, 300 - arg0 * 3, 30);
			local168 = arg1 + " - " + arg0 + "%";
			local71.setFont(this.bf);
			local71.setColor(this.colourtext);
			local71.drawString(local168, (this.anInt10374 - this.bfm.stringWidth(local168)) / 2, this.anInt10375 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(205) Exception local205) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10374, this.anInt10375);
			local43.setColor(this.aColor3);
			local93 = this.anInt10374 / 2 - 152;
			local100 = this.anInt10375 / 2 - 18;
			local43.drawRect(local93, local100, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local93 + 2, local100 + 2, arg0 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local93 + 1, local100 + 1, 301, 31);
			local43.fillRect(arg0 * 3 + local93 + 2, local100 + 2, 300 - arg0 * 3, 30);
			local43.setFont(this.bf);
			local168 = arg1 + " - " + arg0 + "%";
			local43.setColor(this.colourtext);
			local43.drawString(local168, (this.anInt10374 - this.bfm.stringWidth(local168)) / 2, this.anInt10375 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString147 = this.getParameter("unsignedurl");
			if (aString147 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean773 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString147), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString148 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class398.aStringArray80.length) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10373 = Integer.parseInt(local64);
				if (anInt10373 < 0 || Class398.anIntArray674.length <= anInt10373) {
					anInt10373 = 0;
				}
			}
			this.lb = Class398.aClass397Array1[anInt10373];
			this.anInt10374 = this.getSize().width;
			this.anInt10375 = this.getSize().height;
			@Pc(103) int local103 = 32;
			try {
				@Pc(108) int local108 = Integer.parseInt(this.getParameter("modewhat"));
				local103 += local108;
			} catch (@Pc(114) Exception local114) {
			}
			try {
				@Pc(118) String local118 = this.getParameter("lang");
				if (local118 != null) {
					this.anInt10372 = Integer.parseInt(local118);
				}
			} catch (@Pc(128) Exception local128) {
			}
			Class399.method8797(local103, Class398.aStringArray80[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString141, 0, this.lb.anInt10370);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10369);
					this.bar = this.method8787(this.lb.aString136);
					this.background = this.method8787(this.lb.aString139);
					this.left = this.method8787(this.lb.aString138);
					this.right = this.method8787(this.lb.aString137);
					this.top = this.method8787(this.lb.aString142);
					this.bottom = this.method8787(this.lb.aString140);
					this.bodyLeft = this.method8787(this.lb.aString144);
					this.bodyRight = this.method8787(this.lb.aString143);
					this.bodyFill = this.method8787(this.lb.aString145);
					@Pc(285) Image[] local285 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(290) MediaTracker local290 = new MediaTracker(this);
					for (@Pc(292) int local292 = 0; local292 < local285.length; local292++) {
						local290.addImage(local285[local292], local292);
					}
					while (true) {
						try {
							local290.waitForAll();
							break;
						} catch (@Pc(309) InterruptedException local309) {
						}
					}
				} catch (@Pc(313) Throwable local313) {
					this.method8793();
				}
			}
			@Pc(318) unpack local318 = null;
			@Pc(326) byte[] local326;
			try {
				Class.forName("java.util.jar.Pack200");
				local326 = this.method8791(Class398.aClass396_2);
				if (local326 == null) {
					return;
				}
				local318 = new unpack_Sub1(local326);
			} catch (@Pc(337) Throwable local337) {
			}
			if (local318 == null) {
				local326 = this.method8791(Class398.aClass396_1);
				if (local326 == null) {
					return;
				}
				@Pc(354) unpack local354 = new unpack(local326);
				@Pc(359) ClassLoader_Sub1 local359 = new ClassLoader_Sub1(local354);
				@Pc(362) Class local362 = Class.forName("unpack");
				local359.method8774(local362, local362.getName());
				@Pc(372) Class local372 = local359.loadClass("unpackclass");
				@Pc(377) byte[] local377 = this.method8791(Class398.aClass396_3);
				if (local377 == null) {
					return;
				}
				local318 = (unpack) local372.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local377, Boolean.TRUE);
			}
			@Pc(412) ClassLoader_Sub1 local412 = new ClassLoader_Sub1(local318);
			@Pc(415) Class local415 = Class.forName("Class399");
			local412.method8774(local415, local415.getName());
			@Pc(425) Class local425 = local412.loadClass("client");
			synchronized (this) {
				if (this.aBoolean770) {
					return;
				}
				this.anApplet3 = (Applet) local425.getDeclaredConstructor().newInstance();
				local425.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean772) {
					this.anApplet3.start();
				}
				if (this.aBoolean769) {
					this.anApplet3.stop();
				}
			}
			this.method8785();
		} catch (@Pc(496) Exception local496) {
			RuntimeException_Sub2.anInt10371 = -1796636326;
			if (local496 instanceof InvocationTargetException) {
				@Pc(505) Throwable local505 = ((InvocationTargetException) local496).getTargetException();
				if (local505 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8775(local496.toString(), this, local505);
			} else {
				RuntimeException_Sub2.method8775((String) null, this, local496);
			}
			this.method8788("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8784(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10374 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8785() {
		this.aColor2 = null;
		this.aColor3 = null;
		this.anImage14 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8786(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean769 = false;
		this.aBoolean772 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)Ljava/awt/Image;")
	private Image method8787(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(43) Exception local43) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method8788(@OriginalArg(1) String arg0) {
		if (this.aBoolean773) {
			return;
		}
		this.aBoolean773 = true;
		try {
			if (aString148 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString148 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean770 = true;
		this.aBoolean772 = this.aBoolean769 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!a;I)Z")
	private boolean method8789(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class396 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(19) MessageDigest local19 = MessageDigest.getInstance("SHA");
			local19.reset();
			local19.update(arg0);
			@Pc(27) byte[] local27 = local19.digest();
			for (@Pc(29) int local29 = 0; local29 < 20; local29++) {
				if (local27[local29] != arg1.anIntArray672[local29]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method8788("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
	private boolean method8790(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg0);
			local11.write(arg1, 0, arg1.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method8788("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean772 = false;
		this.aBoolean769 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!a;)[B")
	private byte[] method8791(@OriginalArg(1) Class396 arg0) {
		@Pc(10) File local10;
		try {
			local10 = Class399.method8799(arg0.aString135);
		} catch (@Pc(12) Exception local12) {
			this.method8788("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method8786(local10);
		if (!this.method8789(local23, arg0)) {
			local23 = this.method8794(false, arg0);
			if (local23 == null) {
				local23 = this.method8794(true, arg0);
			}
			if (local23 == null) {
				this.method8788("download");
				return null;
			}
			if (!this.method8790(local10, local23)) {
				return null;
			}
			local23 = this.method8786(local10);
			if (!this.method8789(local23, arg0)) {
				this.method8788("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method8792(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10374, this.anInt10375);
			this.canvas.setVisible(true);
		}
		@Pc(38) Graphics local38 = this.canvas.getGraphics();
		if (local38 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10374, this.anInt10375);
			}
			@Pc(60) Graphics local60 = this.anImage14.getGraphics();
			@Pc(65) int local65 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(70) int local70 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(75) int local75 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(85) int local85 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(90) int local90 = this.bodyFill.getHeight((ImageObserver) null);
			local60.drawImage(this.bodyLeft, this.method8784(local65) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8796(local80) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(135) int local135 = this.lb.boxXOffset + local65 - this.lb.boxWidth / 2;
			@Pc(145) int local145 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(147) int local147;
			for (local147 = local135; local147 <= local145; local147 += local75) {
				local60.drawImage(this.bodyFill, this.method8784(local65) + this.lb.boxXOffset + local147, this.method8796(local90) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local60.drawImage(this.bodyRight, this.method8784(local70) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8796(local85) + this.lb.boxYOffset, (ImageObserver) null);
			local147 = this.left.getWidth((ImageObserver) null);
			@Pc(228) int local228 = this.left.getHeight((ImageObserver) null);
			@Pc(233) int local233 = this.right.getWidth((ImageObserver) null);
			@Pc(238) int local238 = this.right.getHeight((ImageObserver) null);
			@Pc(243) int local243 = this.bottom.getHeight((ImageObserver) null);
			@Pc(248) int local248 = this.top.getWidth((ImageObserver) null);
			@Pc(253) int local253 = this.top.getHeight((ImageObserver) null);
			@Pc(258) int local258 = this.bottom.getWidth((ImageObserver) null);
			@Pc(263) int local263 = this.bar.getWidth((ImageObserver) null);
			@Pc(268) int local268 = this.background.getWidth((ImageObserver) null);
			@Pc(280) int local280 = this.method8784(this.lb.width) + this.lb.xOffset;
			@Pc(291) int local291 = this.method8796(this.lb.height) + this.lb.yOffset;
			local60.drawImage(this.left, local280, (this.lb.height - local228) / 2 + local291, (ImageObserver) null);
			local60.drawImage(this.right, local280 + this.lb.width - local233, (this.lb.height - local238) / 2 + local291, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local147 - local233, this.lb.height);
			}
			@Pc(356) Graphics local356 = this.barBuf.getGraphics();
			@Pc(358) int local358;
			for (local358 = 0; local358 < this.lb.width - local147 - local233; local358 += local248) {
				local356.drawImage(this.top, local358, 0, (ImageObserver) null);
			}
			for (local358 = 0; local358 < this.lb.width - local233 - local147; local358 += local258) {
				local356.drawImage(this.bottom, local358, this.lb.height - local243, (ImageObserver) null);
			}
			local358 = arg2 * (this.lb.width - local147 - local233) / 100;
			if (local358 > 0) {
				@Pc(447) Image local447 = this.createImage(local358, this.lb.height - local243 - local253);
				@Pc(451) int local451 = local447.getWidth((ImageObserver) null);
				@Pc(454) Graphics local454 = local447.getGraphics();
				for (@Pc(459) int local459 = arg1 - local263; local459 < local451; local459 += local263) {
					local454.drawImage(this.bar, local459, 0, (ImageObserver) null);
				}
				local356.drawImage(local447, 0, local253, (ImageObserver) null);
			}
			@Pc(489) int local489 = local358;
			local358 = this.lb.width - local233 - local147 - local358;
			if (local358 > 0) {
				@Pc(519) Image local519 = this.createImage(local358, this.lb.height - local253 - local243);
				@Pc(523) int local523 = local519.getWidth((ImageObserver) null);
				@Pc(526) Graphics local526 = local519.getGraphics();
				for (@Pc(528) int local528 = 0; local528 < local523; local528 += local268) {
					local526.drawImage(this.background, local528, 0, (ImageObserver) null);
				}
				local356.drawImage(local519, local489, local253, (ImageObserver) null);
			}
			local60.drawImage(this.barBuf, local280 + local147, local291, (ImageObserver) null);
			local60.setFont(this.bf);
			local60.setColor(this.colourtext);
			@Pc(583) String local583 = arg0 + " - " + arg2 + "%";
			local60.drawString(local583, local280 + (this.lb.width - this.bfm.stringWidth(local583)) / 2, local291 + 4 + (this.lb.height / 2 - -this.lb.textYOffset));
			local38.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(623) Exception local623) {
			this.method8793();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(B)V")
	private void method8793() {
		this.aBoolean771 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean770 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;Z)[B")
	private byte[] method8794(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class396 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10367];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString134 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1.aString134)).openStream();
			}
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = 0;
			@Pc(88) int local88 = 0;
			while (true) {
				if (local86 < local5.length) {
					@Pc(98) int local98 = local5.length - local86;
					if (local98 > 1000) {
						local98 = 1000;
					}
					@Pc(110) int local110 = local30.read(local5, local86, local98);
					if (local110 >= 0) {
						local86 += local110;
						@Pc(131) int local131 = local86 * 100 / local5.length;
						@Pc(133) int local133 = 0;
						if (this.lb != null && this.bar != null) {
							local133 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local131 != local84 || local133 != local88) {
							try {
								if (this.method8795(arg1.aStringArray79[this.anInt10372], local133, local131)) {
									local84 = local131;
									local88 = local133;
								}
							} catch (@Pc(180) Exception local180) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local30.close();
				if (arg1.anInt10368 != arg1.anInt10367) {
					@Pc(198) byte[] local198 = new byte[arg1.anInt10368];
					@Pc(203) Inflater local203 = new Inflater(true);
					local203.setInput(local5);
					local5 = local198;
					local203.inflate(local198);
				}
				break;
			}
		} catch (@Pc(214) Exception local214) {
			return null;
		}
		return this.method8789(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method8795(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Class398.aClass397Array1[anInt10373] == null || this.aBoolean771 ? this.method8783(arg2, arg0) : this.method8792(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method8796(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10375 - arg0) / 2 : 0;
	}
}
