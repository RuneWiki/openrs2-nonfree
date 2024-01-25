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

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString127;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString128;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private static int anInt10505 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean767;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10502;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt10504;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class385 lb;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10503 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean769 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean768 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean766 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8933() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean767 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8934(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10502 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;[B)Z")
	private boolean method8935(@OriginalArg(1) Class386 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray748[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(37) Exception local37) {
			this.method8939("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean768 = true;
		this.aBoolean766 = this.aBoolean769 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;I)[B")
	private byte[] method8936(@OriginalArg(0) Class386 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class387.method8948(arg0.aString124);
		} catch (@Pc(6) Exception local6) {
			this.method8939("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method8938(local4);
		if (!this.method8935(arg0, local17)) {
			local17 = this.method8945(arg0, false);
			if (local17 == null) {
				local17 = this.method8945(arg0, true);
			}
			if (local17 == null) {
				this.method8939("download");
				return null;
			}
			if (!this.method8941(local4, local17)) {
				return null;
			}
			local17 = this.method8938(local4);
			if (!this.method8935(arg0, local17)) {
				this.method8939("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8937(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(21) int local21;
			while ((local21 = local6.read()) != -1) {
				local9[local17++] = (byte) local21;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8938(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean766 = false;
		this.aBoolean769 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method8939(@OriginalArg(1) String arg0) {
		if (this.aBoolean770) {
			return;
		}
		this.aBoolean770 = true;
		try {
			if (aString128 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString128 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZ)I")
	private int method8940(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10504 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString127 = this.getParameter("unsignedurl");
			if (aString127 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean770 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString127), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString128 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class384.aStringArray53.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt10505 = Integer.parseInt(local68);
				if (anInt10505 < 0 || anInt10505 >= Class384.anIntArray745.length) {
					anInt10505 = 0;
				}
			}
			this.lb = Class384.aClass385Array1[anInt10505];
			this.anInt10504 = this.getSize().width;
			this.anInt10502 = this.getSize().height;
			@Pc(103) int local103 = 32;
			try {
				@Pc(108) int local108 = Integer.parseInt(this.getParameter("modewhat"));
				local103 += local108;
			} catch (@Pc(114) Exception local114) {
			}
			try {
				@Pc(118) String local118 = this.getParameter("lang");
				if (local118 != null) {
					this.anInt10503 = Integer.parseInt(local118);
				}
			} catch (@Pc(127) Exception local127) {
			}
			Class387.method8947(local103, Class384.aStringArray53[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString121, 0, this.lb.anInt10498);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10497);
					this.bar = this.method8937(this.lb.aString114);
					this.background = this.method8937(this.lb.aString118);
					this.left = this.method8937(this.lb.aString123);
					this.right = this.method8937(this.lb.aString115);
					this.top = this.method8937(this.lb.aString116);
					this.bottom = this.method8937(this.lb.aString117);
					this.bodyLeft = this.method8937(this.lb.aString119);
					this.bodyRight = this.method8937(this.lb.aString120);
					this.bodyFill = this.method8937(this.lb.aString122);
					@Pc(282) Image[] local282 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(287) MediaTracker local287 = new MediaTracker(this);
					for (@Pc(289) int local289 = 0; local289 < local282.length; local289++) {
						local287.addImage(local282[local289], local289);
					}
					while (true) {
						try {
							local287.waitForAll();
							break;
						} catch (@Pc(310) InterruptedException local310) {
						}
					}
				} catch (@Pc(314) Throwable local314) {
					this.method8933();
				}
			}
			@Pc(319) unpack local319 = null;
			@Pc(327) byte[] local327;
			try {
				Class.forName("java.util.jar.Pack200");
				local327 = this.method8936(Class384.aClass386_2);
				if (local327 == null) {
					return;
				}
				local319 = new unpack_Sub1(local327);
			} catch (@Pc(338) Throwable local338) {
			}
			if (local319 == null) {
				local327 = this.method8936(Class384.aClass386_1);
				if (local327 == null) {
					return;
				}
				@Pc(356) unpack local356 = new unpack(local327);
				@Pc(361) ClassLoader_Sub1 local361 = new ClassLoader_Sub1(local356);
				@Pc(364) Class local364 = Class.forName("unpack");
				local361.method8927(local364, local364.getName());
				@Pc(374) Class local374 = local361.loadClass("unpackclass");
				@Pc(379) byte[] local379 = this.method8936(Class384.aClass386_3);
				if (local379 == null) {
					return;
				}
				local319 = (unpack) local374.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local379, Boolean.TRUE);
			}
			@Pc(414) ClassLoader_Sub1 local414 = new ClassLoader_Sub1(local319);
			@Pc(417) Class local417 = Class.forName("Class387");
			local414.method8927(local417, local417.getName());
			@Pc(427) Class local427 = local414.loadClass("client");
			synchronized (this) {
				if (this.aBoolean768) {
					return;
				}
				this.anApplet3 = (Applet) local427.getDeclaredConstructor().newInstance();
				local427.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean766) {
					this.anApplet3.start();
				}
				if (this.aBoolean769) {
					this.anApplet3.stop();
				}
			}
			this.method8943();
		} catch (@Pc(496) Exception local496) {
			RuntimeException_Sub2.anInt10501 = -1977801021;
			if (local496 instanceof InvocationTargetException) {
				@Pc(512) Throwable local512 = ((InvocationTargetException) local496).getTargetException();
				if (local512 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8929(local512, local496.toString(), this);
			} else {
				RuntimeException_Sub2.method8929(local496, (String) null, this);
			}
			this.method8939("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method8941(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method8939("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10504, this.anInt10502);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10504, this.anInt10502);
			}
			@Pc(52) Graphics local52 = this.anImage14.getGraphics();
			@Pc(57) int local57 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(62) int local62 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(67) int local67 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(72) int local72 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(77) int local77 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(82) int local82 = this.bodyFill.getHeight((ImageObserver) null);
			local52.drawImage(this.bodyLeft, this.method8940(local57) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8934(local72) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(125) int local125 = this.lb.boxXOffset + local57 - this.lb.boxWidth / 2;
			@Pc(135) int local135 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(137) int local137;
			for (local137 = local125; local137 <= local135; local137 += local67) {
				local52.drawImage(this.bodyFill, this.method8940(local57) + this.lb.boxXOffset + local137, this.method8934(local82) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local52.drawImage(this.bodyRight, this.method8940(local62) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8934(local77) + this.lb.boxYOffset, (ImageObserver) null);
			local137 = this.left.getWidth((ImageObserver) null);
			@Pc(212) int local212 = this.left.getHeight((ImageObserver) null);
			@Pc(217) int local217 = this.right.getWidth((ImageObserver) null);
			@Pc(222) int local222 = this.right.getHeight((ImageObserver) null);
			@Pc(227) int local227 = this.bottom.getHeight((ImageObserver) null);
			@Pc(232) int local232 = this.top.getWidth((ImageObserver) null);
			@Pc(237) int local237 = this.top.getHeight((ImageObserver) null);
			@Pc(242) int local242 = this.bottom.getWidth((ImageObserver) null);
			@Pc(247) int local247 = this.bar.getWidth((ImageObserver) null);
			@Pc(252) int local252 = this.background.getWidth((ImageObserver) null);
			@Pc(263) int local263 = this.method8940(this.lb.width) + this.lb.xOffset;
			@Pc(276) int local276 = this.method8934(this.lb.height) + this.lb.yOffset;
			local52.drawImage(this.left, local263, (this.lb.height - local212) / 2 + local276, (ImageObserver) null);
			local52.drawImage(this.right, this.lb.width + local263 - local217, local276 + (-local222 + this.lb.height) / 2, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local137 - local217, this.lb.height);
			}
			@Pc(341) Graphics local341 = this.barBuf.getGraphics();
			@Pc(343) int local343;
			for (local343 = 0; local343 < this.lb.width - local217 - local137; local343 += local232) {
				local341.drawImage(this.top, local343, 0, (ImageObserver) null);
			}
			for (local343 = 0; local343 < this.lb.width - local137 - local217; local343 += local242) {
				local341.drawImage(this.bottom, local343, this.lb.height - local227, (ImageObserver) null);
			}
			local343 = arg0 * (this.lb.width - local217 - local137) / 100;
			if (local343 > 0) {
				@Pc(433) Image local433 = this.createImage(local343, this.lb.height - local227 - local237);
				@Pc(437) int local437 = local433.getWidth((ImageObserver) null);
				@Pc(440) Graphics local440 = local433.getGraphics();
				for (@Pc(445) int local445 = arg1 - local247; local445 < local437; local445 += local247) {
					local440.drawImage(this.bar, local445, 0, (ImageObserver) null);
				}
				local341.drawImage(local433, 0, local237, (ImageObserver) null);
			}
			@Pc(475) int local475 = local343;
			local343 = this.lb.width - local137 - local217 - local343;
			if (local343 > 0) {
				@Pc(503) Image local503 = this.createImage(local343, this.lb.height - local237 - local227);
				@Pc(507) int local507 = local503.getWidth((ImageObserver) null);
				@Pc(510) Graphics local510 = local503.getGraphics();
				for (@Pc(512) int local512 = 0; local512 < local507; local512 += local252) {
					local510.drawImage(this.background, local512, 0, (ImageObserver) null);
				}
				local341.drawImage(local503, local475, local237, (ImageObserver) null);
			}
			local52.drawImage(this.barBuf, local263 + local137, local276, (ImageObserver) null);
			local52.setFont(this.bf);
			local52.setColor(this.colourtext);
			@Pc(567) String local567 = arg2 + " - " + arg0 + "%";
			local52.drawString(local567, (this.lb.width - this.bfm.stringWidth(local567)) / 2 + local263, this.lb.textYOffset + 4 + this.lb.height / 2 + local276);
			local33.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(605) Exception local605) {
			this.method8933();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8943() {
		this.aColor3 = null;
		this.barBuf = null;
		this.aColor2 = null;
		this.anImage14 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean768 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method8944(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		return Class384.aClass385Array1[anInt10505] == null || this.aBoolean767 ? this.method8946(arg1, arg0) : this.method8942(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;IZ)[B")
	private byte[] method8945(@OriginalArg(0) Class386 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10500];
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
				local38.write(("JAGGRAB " + local24.getFile() + arg0.aString125 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0.aString125)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local76 < local5.length) {
					@Pc(91) int local91 = local5.length - local76;
					if (local91 > 1000) {
						local91 = 1000;
					}
					@Pc(103) int local103 = local61.read(local5, local76, local91);
					if (local103 >= 0) {
						local76 += local103;
						@Pc(124) int local124 = local76 * 100 / local5.length;
						@Pc(126) int local126 = 0;
						if (this.lb != null && this.bar != null) {
							local126 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local124 != local74 || local78 != local126) {
							try {
								if (this.method8944(local124, arg0.aStringArray54[this.anInt10503], local126)) {
									local78 = local126;
									local74 = local124;
								}
							} catch (@Pc(171) Exception local171) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local61.close();
				if (arg0.anInt10499 != arg0.anInt10500) {
					@Pc(189) byte[] local189 = new byte[arg0.anInt10499];
					@Pc(194) Inflater local194 = new Inflater(true);
					local194.setInput(local5);
					local194.inflate(local189);
					local5 = local189;
				}
				break;
			}
		} catch (@Pc(205) Exception local205) {
			return null;
		}
		return this.method8935(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean766 = true;
		this.aBoolean769 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
	private boolean method8946(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class384.anIntArray745[anInt10505]);
			this.aColor3 = new Color(Class384.anIntArray747[anInt10505]);
			this.colourtext = new Color(Class384.anIntArray746[anInt10505]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(170) String local170;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10504, this.anInt10502);
			}
			@Pc(70) Graphics local70 = this.anImage14.getGraphics();
			local70.setColor(Color.black);
			local70.fillRect(0, 0, this.anInt10504, this.anInt10502);
			local70.setColor(this.aColor2);
			local92 = this.anInt10504 / 2 - 152;
			local99 = this.anInt10502 / 2 - 18;
			local70.drawRect(local92, local99, 303, 33);
			local70.setColor(this.aColor3);
			local70.fillRect(local92 + 2, local99 + 2, arg1 * 3, 30);
			local70.setColor(Color.black);
			local70.drawRect(local92 + 1, local99 + 1, 301, 31);
			local70.fillRect(arg1 * 3 + local92 + 2, local99 + 2, 300 - arg1 * 3, 30);
			local70.setFont(this.bf);
			local170 = arg0 + " - " + arg1 + "%";
			local70.setColor(this.colourtext);
			local70.drawString(local170, (this.anInt10504 - this.bfm.stringWidth(local170)) / 2, this.anInt10502 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(202) Exception local202) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10504, this.anInt10502);
			local43.setColor(this.aColor2);
			local92 = this.anInt10504 / 2 - 152;
			local99 = this.anInt10502 / 2 - 18;
			local43.drawRect(local92, local99, 303, 33);
			local43.setColor(this.aColor3);
			local43.fillRect(local92 + 2, local99 - -2, arg1 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local92 + 1, local99 + 1, 301, 31);
			local43.fillRect(local92 + arg1 * 3 + 2, local99 + 2, 300 - arg1 * 3, 30);
			local43.setFont(this.bf);
			local170 = arg0 + " - " + arg1 + "%";
			local43.setColor(this.colourtext);
			local43.drawString(local170, (this.anInt10504 - this.bfm.stringWidth(local170)) / 2, this.anInt10502 / 2 + 4);
		}
		return true;
	}
}
