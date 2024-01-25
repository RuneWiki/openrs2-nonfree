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
	private static String aString134;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString135;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private static int anInt11105 = 0;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt11102;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean760;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt11104;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!b;")
	private Class381 lb;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean759 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt11103 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean758 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean761 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean762 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!e;)[B")
	private byte[] method9269(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class383 arg1) {
		@Pc(12) byte[] local12 = new byte[arg1.anInt11100];
		@Pc(14) int local14 = 0;
		if (this.lb != null && this.bar != null) {
			local14 = this.bar.getWidth(null);
		}
		try {
			@Pc(69) InputStream local69;
			if (arg0) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg1.aString132 + "\n\n").getBytes());
				local69 = local40.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg1.aString132)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local84 < local12.length) {
					@Pc(100) int local100 = local12.length - local84;
					if (local100 > 1000) {
						local100 = 1000;
					}
					@Pc(114) int local114 = local69.read(local12, local84, local100);
					if (local114 >= 0) {
						local84 += local114;
						@Pc(132) int local132 = local84 * 100 / local12.length;
						@Pc(134) int local134 = 0;
						if (this.lb != null && this.bar != null) {
							local134 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local14;
						}
						if (local132 != local82 || local134 != local86) {
							try {
								if (this.method9280(local132, local134, arg1.aStringArray47[this.anInt11103])) {
									local86 = local134;
									local82 = local132;
								}
							} catch (@Pc(183) Exception local183) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local69.close();
				if (arg1.anInt11099 != arg1.anInt11100) {
					@Pc(201) byte[] local201 = new byte[arg1.anInt11099];
					@Pc(206) Inflater local206 = new Inflater(true);
					local206.setInput(local12);
					local12 = local201;
					local206.inflate(local201);
				}
				break;
			}
		} catch (@Pc(217) Exception local217) {
			return null;
		}
		return this.method9279(arg1, local12) ? local12 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9270(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(15) byte[] local15 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(21) int local21;
			while ((local21 = local6.read()) != -1) {
				local15[local17++] = (byte) local21;
			}
			return Toolkit.getDefaultToolkit().createImage(local15);
		} catch (@Pc(38) Exception local38) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9271() {
		this.aBoolean760 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method9272(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt11104 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9273(@OriginalArg(1) String arg0) {
		if (this.aBoolean762) {
			return;
		}
		this.aBoolean762 = true;
		try {
			if (aString135 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString135 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(4) Container local4 = this.getParent();
		if (local4 != null) {
			local4.setBackground(Color.black);
		}
		this.aBoolean758 = false;
		this.setBackground(Color.black);
		@Pc(21) Thread local21 = new Thread(this);
		local21.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method9274(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method9273("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9275() {
		this.aColor3 = null;
		this.anImage14 = null;
		this.aColor2 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method9276(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;B)[B")
	private byte[] method9277(@OriginalArg(0) Class383 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class382.method9257(arg0.aString131);
		} catch (@Pc(6) Exception local6) {
			this.method9273("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method9276(local4);
		if (!this.method9279(arg0, local17)) {
			local17 = this.method9269(false, arg0);
			if (local17 == null) {
				local17 = this.method9269(true, arg0);
			}
			if (local17 == null) {
				this.method9273("download");
				return null;
			}
			if (!this.method9274(local17, local4)) {
				return null;
			}
			local17 = this.method9276(local4);
			if (!this.method9279(arg0, local17)) {
				this.method9273("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9278(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt11102, this.anInt11104);
			this.canvas.setVisible(true);
		}
		@Pc(34) Graphics local34 = this.canvas.getGraphics();
		if (local34 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11102, this.anInt11104);
			}
			@Pc(55) Graphics local55 = this.anImage14.getGraphics();
			@Pc(60) int local60 = this.bodyLeft.getWidth(null);
			@Pc(65) int local65 = this.bodyRight.getWidth(null);
			@Pc(70) int local70 = this.bodyFill.getWidth(null);
			@Pc(75) int local75 = this.bodyLeft.getHeight(null);
			@Pc(80) int local80 = this.bodyRight.getHeight(null);
			@Pc(85) int local85 = this.bodyFill.getHeight(null);
			local55.drawImage(this.bodyLeft, this.method9281(local60) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9272(local75) + this.lb.boxYOffset, null);
			@Pc(126) int local126 = local60 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(136) int local136 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(138) int local138;
			for (local138 = local126; local138 <= local136; local138 += local70) {
				local55.drawImage(this.bodyFill, local138 + this.method9281(local60) + this.lb.boxXOffset, this.method9272(local85) - -this.lb.boxYOffset, null);
			}
			local55.drawImage(this.bodyRight, this.method9281(local65) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9272(local80) + this.lb.boxYOffset, null);
			local138 = this.left.getWidth(null);
			@Pc(217) int local217 = this.left.getHeight(null);
			@Pc(222) int local222 = this.right.getWidth(null);
			@Pc(227) int local227 = this.right.getHeight(null);
			@Pc(232) int local232 = this.bottom.getHeight(null);
			@Pc(237) int local237 = this.top.getWidth(null);
			@Pc(242) int local242 = this.top.getHeight(null);
			@Pc(247) int local247 = this.bottom.getWidth(null);
			@Pc(252) int local252 = this.bar.getWidth(null);
			@Pc(257) int local257 = this.background.getWidth(null);
			@Pc(268) int local268 = this.method9281(this.lb.width) + this.lb.xOffset;
			@Pc(279) int local279 = this.method9272(this.lb.height) + this.lb.yOffset;
			local55.drawImage(this.left, local268, (this.lb.height - local217) / 2 + local279, null);
			local55.drawImage(this.right, local268 + this.lb.width - local222, local279 + (-local227 + this.lb.height) / 2, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local222 - local138, this.lb.height);
			}
			@Pc(343) Graphics local343 = this.barBuf.getGraphics();
			@Pc(345) int local345;
			for (local345 = 0; local345 < this.lb.width - local138 - local222; local345 += local237) {
				local343.drawImage(this.top, local345, 0, null);
			}
			for (local345 = 0; local345 < this.lb.width - local138 - local222; local345 += local247) {
				local343.drawImage(this.bottom, local345, this.lb.height - local232, null);
			}
			local345 = arg2 * (this.lb.width - local138 - local222) / 100;
			if (local345 > 0) {
				@Pc(431) Image local431 = this.createImage(local345, this.lb.height - local242 - local232);
				@Pc(435) int local435 = local431.getWidth(null);
				@Pc(438) Graphics local438 = local431.getGraphics();
				for (@Pc(443) int local443 = arg1 - local252; local443 < local435; local443 += local252) {
					local438.drawImage(this.bar, local443, 0, null);
				}
				local343.drawImage(local431, 0, local242, null);
			}
			@Pc(473) int local473 = local345;
			local345 = this.lb.width - local345 - local222 - local138;
			if (local345 > 0) {
				@Pc(505) Image local505 = this.createImage(local345, this.lb.height - local232 - local242);
				@Pc(509) int local509 = local505.getWidth(null);
				@Pc(512) Graphics local512 = local505.getGraphics();
				for (@Pc(514) int local514 = 0; local514 < local509; local514 += local257) {
					local512.drawImage(this.background, local514, 0, null);
				}
				local343.drawImage(local505, local473, local242, null);
			}
			local55.drawImage(this.barBuf, local268 + local138, local279, null);
			local55.setFont(this.bf);
			local55.setColor(this.colourtext);
			@Pc(569) String local569 = arg0 + " - " + arg2 + "%";
			local55.drawString(local569, local268 + (this.lb.width - this.bfm.stringWidth(local569)) / 2, this.lb.height / 2 + (local279 - (-this.lb.textYOffset + -4)));
			local34.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(608) Exception local608) {
			this.method9271();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString134 = this.getParameter("unsignedurl");
			if (aString134 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean762 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString134), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString135 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class380.aStringArray46.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt11105 = Integer.parseInt(local64);
				if (anInt11105 < 0 || anInt11105 >= Class380.anIntArray719.length) {
					anInt11105 = 0;
				}
			}
			this.lb = Class380.aClass381Array1[anInt11105];
			this.anInt11102 = this.getSize().width;
			this.anInt11104 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt11103 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class382.method9258(Class380.aStringArray46[local38], local99);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString125, 0, this.lb.anInt11097);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt11096);
					this.bar = this.method9270(this.lb.aString124);
					this.background = this.method9270(this.lb.aString123);
					this.left = this.method9270(this.lb.aString126);
					this.right = this.method9270(this.lb.aString122);
					this.top = this.method9270(this.lb.aString121);
					this.bottom = this.method9270(this.lb.aString120);
					this.bodyLeft = this.method9270(this.lb.aString119);
					this.bodyRight = this.method9270(this.lb.aString127);
					this.bodyFill = this.method9270(this.lb.aString128);
					@Pc(279) Image[] local279 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(284) MediaTracker local284 = new MediaTracker(this);
					for (@Pc(286) int local286 = 0; local286 < local279.length; local286++) {
						local284.addImage(local279[local286], local286);
					}
					while (true) {
						try {
							local284.waitForAll();
							break;
						} catch (@Pc(307) InterruptedException local307) {
						}
					}
				} catch (@Pc(311) Throwable local311) {
					this.method9271();
				}
			}
			@Pc(316) unpack local316 = null;
			@Pc(324) byte[] local324;
			try {
				Class.forName("java.util.jar.Pack200");
				local324 = this.method9277(Class380.aClass383_2);
				if (local324 == null) {
					return;
				}
				local316 = new unpack_Sub1(local324);
			} catch (@Pc(335) Throwable local335) {
			}
			if (local316 == null) {
				local324 = this.method9277(Class380.aClass383_1);
				if (local324 == null) {
					return;
				}
				@Pc(351) unpack local351 = new unpack(local324);
				@Pc(356) ClassLoader_Sub1 local356 = new ClassLoader_Sub1(local351);
				@Pc(359) Class local359 = Class.forName("unpack");
				local356.method9260(local359.getName(), local359);
				@Pc(369) Class local369 = local356.loadClass("unpackclass");
				@Pc(374) byte[] local374 = this.method9277(Class380.aClass383_3);
				if (local374 == null) {
					return;
				}
				local316 = (unpack) local369.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local374, Boolean.TRUE);
			}
			@Pc(410) ClassLoader_Sub1 local410 = new ClassLoader_Sub1(local316);
			@Pc(413) Class local413 = Class.forName("Class382");
			local410.method9260(local413.getName(), local413);
			@Pc(423) Class local423 = local410.loadClass("client");
			synchronized (this) {
				if (this.aBoolean758) {
					return;
				}
				this.anApplet3 = (Applet) local423.getDeclaredConstructor().newInstance();
				local423.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean759) {
					this.anApplet3.start();
				}
				if (this.aBoolean761) {
					this.anApplet3.stop();
				}
			}
			this.method9275();
		} catch (@Pc(493) Exception local493) {
			RuntimeException_Sub2.anInt11101 = 25945590;
			if (local493 instanceof InvocationTargetException) {
				@Pc(502) Throwable local502 = ((InvocationTargetException) local493).getTargetException();
				if (local502 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9268(this, local502, local493.toString());
			} else {
				RuntimeException_Sub2.method9268(this, local493, null);
			}
			this.method9273("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean759 = false;
		this.aBoolean761 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;[BI)Z")
	private boolean method9279(@OriginalArg(0) Class383 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (arg0.anIntArray721[local20] != local18[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(40) Exception local40) {
			this.method9273("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method9280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class380.aClass381Array1[anInt11105] == null || this.aBoolean760 ? this.method9282(arg0, arg2) : this.method9278(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean758 = true;
		this.aBoolean759 = this.aBoolean761 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZI)I")
	private int method9281(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt11102 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean759 = true;
		this.aBoolean761 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method9282(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class380.anIntArray719[anInt11105]);
			this.aColor2 = new Color(Class380.anIntArray720[anInt11105]);
			this.colourtext = new Color(Class380.anIntArray718[anInt11105]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(87) int local87;
		@Pc(94) int local94;
		@Pc(161) String local161;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11102, this.anInt11104);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			local65.setColor(Color.black);
			local65.fillRect(0, 0, this.anInt11102, this.anInt11104);
			local65.setColor(this.aColor3);
			local87 = this.anInt11102 / 2 - 152;
			local94 = this.anInt11104 / 2 - 18;
			local65.drawRect(local87, local94, 303, 33);
			local65.setColor(this.aColor2);
			local65.fillRect(local87 + 2, local94 - -2, arg0 * 3, 30);
			local65.setColor(Color.black);
			local65.drawRect(local87 + 1, local94 + 1, 301, 31);
			local65.fillRect(local87 + arg0 * 3 + 2, local94 + 2, 300 - arg0 * 3, 30);
			local161 = arg1 + " - " + arg0 + "%";
			local65.setFont(this.bf);
			local65.setColor(this.colourtext);
			local65.drawString(local161, (this.anInt11102 - this.bfm.stringWidth(local161)) / 2, this.anInt11104 / 2 + 4);
			local44.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(197) Exception local197) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt11102, this.anInt11104);
			local44.setColor(this.aColor3);
			local87 = this.anInt11102 / 2 - 152;
			local94 = this.anInt11104 / 2 - 18;
			local44.drawRect(local87, local94, 303, 33);
			local44.setColor(this.aColor2);
			local44.fillRect(local87 + 2, local94 + 2, arg0 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local87 + 1, local94 + 1, 301, 31);
			local44.fillRect(arg0 * 3 + local87 + 2, local94 + 2, 300 - arg0 * 3, 30);
			local161 = arg1 + " - " + arg0 + "%";
			local44.setFont(this.bf);
			local44.setColor(this.colourtext);
			local44.drawString(local161, (this.anInt11102 - this.bfm.stringWidth(local161)) / 2, this.anInt11104 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}
}
