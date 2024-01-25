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

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString123;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt10674 = 0;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10676;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt10677;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!g;")
	private Class383 lb;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean769;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt10675 = 0;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean767 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean766 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean768 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method9071(@OriginalArg(0) String arg0) {
		if (this.aBoolean770) {
			return;
		}
		this.aBoolean770 = true;
		try {
			if (aString124 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString124 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method9072(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method9073(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10677 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString123 = this.getParameter("unsignedurl");
			if (aString123 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean770 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString123), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString124 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class381.aStringArray80.length) {
					local37 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10674 = Integer.parseInt(local64);
				if (anInt10674 < 0 || anInt10674 >= Class381.anIntArray608.length) {
					anInt10674 = 0;
				}
			}
			this.lb = Class381.aClass383Array1[anInt10674];
			this.anInt10676 = this.getSize().width;
			this.anInt10677 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt10675 = Integer.parseInt(local113);
				}
			} catch (@Pc(121) Exception local121) {
			}
			Class384.method9067(local98, Class381.aStringArray80[local37]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString120, 0, this.lb.anInt10672);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10671);
					this.bar = this.method9077(this.lb.aString115);
					this.background = this.method9077(this.lb.aString116);
					this.left = this.method9077(this.lb.aString112);
					this.right = this.method9077(this.lb.aString118);
					this.top = this.method9077(this.lb.aString119);
					this.bottom = this.method9077(this.lb.aString114);
					this.bodyLeft = this.method9077(this.lb.aString117);
					this.bodyRight = this.method9077(this.lb.aString111);
					this.bodyFill = this.method9077(this.lb.aString113);
					@Pc(277) Image[] local277 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(282) MediaTracker local282 = new MediaTracker(this);
					for (@Pc(284) int local284 = 0; local284 < local277.length; local284++) {
						local282.addImage(local277[local284], local284);
					}
					while (true) {
						try {
							local282.waitForAll();
							break;
						} catch (@Pc(305) InterruptedException local305) {
						}
					}
				} catch (@Pc(309) Throwable local309) {
					this.method9081();
				}
			}
			@Pc(314) unpack local314 = null;
			@Pc(322) byte[] local322;
			try {
				Class.forName("java.util.jar.Pack200");
				local322 = this.method9074(Class381.aClass382_2);
				if (local322 == null) {
					return;
				}
				local314 = new unpack_Sub1(local322);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local314 == null) {
				local322 = this.method9074(Class381.aClass382_1);
				if (local322 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local322);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method9064(local358.getName(), local358);
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method9074(Class381.aClass382_3);
				if (local373 == null) {
					return;
				}
				local314 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(408) ClassLoader_Sub1 local408 = new ClassLoader_Sub1(local314);
			@Pc(411) Class local411 = Class.forName("Class384");
			local408.method9064(local411.getName(), local411);
			@Pc(421) Class local421 = local408.loadClass("client");
			synchronized (this) {
				if (this.aBoolean768) {
					return;
				}
				this.anApplet3 = (Applet) local421.getDeclaredConstructor().newInstance();
				local421.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean766) {
					this.anApplet3.start();
				}
				if (this.aBoolean767) {
					this.anApplet3.stop();
				}
			}
			this.method9076();
		} catch (@Pc(490) Exception local490) {
			RuntimeException_Sub2.anInt10668 = -1422145613;
			if (local490 instanceof InvocationTargetException) {
				@Pc(506) Throwable local506 = ((InvocationTargetException) local490).getTargetException();
				if (local506 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9061(local490.toString(), this, local506);
			} else {
				RuntimeException_Sub2.method9061(null, this, local490);
			}
			this.method9071("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;Z)[B")
	private byte[] method9074(@OriginalArg(0) Class382 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class384.method9065(arg0.aString110);
		} catch (@Pc(6) Exception local6) {
			this.method9071("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method9072(local4);
		if (!this.method9079(local17, arg0)) {
			local17 = this.method9078(arg0, false);
			if (local17 == null) {
				local17 = this.method9078(arg0, true);
			}
			if (local17 == null) {
				this.method9071("download");
				return null;
			}
			if (!this.method9083(local17, local4)) {
				return null;
			}
			local17 = this.method9072(local4);
			if (!this.method9079(local17, arg0)) {
				this.method9071("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean767 = false;
		this.aBoolean766 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method9075(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return Class381.aClass383Array1[anInt10674] == null || this.aBoolean769 ? this.method9084(arg2, arg1) : this.method9080(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean766 = false;
		this.aBoolean767 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
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
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean766 = this.aBoolean767 = false;
		this.aBoolean768 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9076() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method9077(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!e;Z)[B")
	private byte[] method9078(@OriginalArg(1) Class382 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10669];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(61) InputStream local61;
			if (arg1) {
				@Pc(24) URL local24 = this.getCodeBase();
				@Pc(32) Socket local32 = new Socket(InetAddress.getByName(local24.getHost()), 443);
				local32.setSoTimeout(10000);
				@Pc(38) OutputStream local38 = local32.getOutputStream();
				local38.write(17);
				local38.write(("JAGGRAB " + local24.getFile() + arg0.aString109 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0.aString109)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local84 >= local5.length) {
					local61.close();
					if (arg0.anInt10669 != arg0.anInt10670) {
						@Pc(188) byte[] local188 = new byte[arg0.anInt10670];
						@Pc(193) Inflater local193 = new Inflater(true);
						local193.setInput(local5);
						local5 = local188;
						local193.inflate(local188);
					}
					break;
				}
				@Pc(95) int local95 = local5.length - local84;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(107) int local107 = local61.read(local5, local84, local95);
				if (local107 < 0) {
					throw new EOFException();
				}
				local84 += local107;
				@Pc(125) int local125 = local84 * 100 / local5.length;
				@Pc(127) int local127 = 0;
				if (this.lb != null && this.bar != null) {
					local127 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local125 != local82 || local127 != local86) {
					try {
						if (this.method9075(local127, arg0.aStringArray81[this.anInt10675], local125)) {
							local82 = local125;
							local86 = local127;
						}
					} catch (@Pc(170) Exception local170) {
					}
				}
			}
		} catch (@Pc(204) Exception local204) {
			return null;
		}
		return this.method9079(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLloader!e;)Z")
	private boolean method9079(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class382 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg1.anIntArray609[local23] != local21[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method9071("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method9080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10676, this.anInt10677);
			this.canvas.setVisible(true);
		}
		@Pc(41) Graphics local41 = this.canvas.getGraphics();
		if (local41 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10676, this.anInt10677);
			}
			@Pc(63) Graphics local63 = this.anImage14.getGraphics();
			@Pc(68) int local68 = this.bodyLeft.getWidth(null);
			@Pc(73) int local73 = this.bodyRight.getWidth(null);
			@Pc(78) int local78 = this.bodyFill.getWidth(null);
			@Pc(83) int local83 = this.bodyLeft.getHeight(null);
			@Pc(88) int local88 = this.bodyRight.getHeight(null);
			@Pc(93) int local93 = this.bodyFill.getHeight(null);
			local63.drawImage(this.bodyLeft, this.method9082(local68) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9073(local83) - -this.lb.boxYOffset, null);
			@Pc(136) int local136 = local68 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(146) int local146 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(148) int local148;
			for (local148 = local136; local148 <= local146; local148 += local78) {
				local63.drawImage(this.bodyFill, this.method9082(local68) + this.lb.boxXOffset + local148, this.method9073(local93) + this.lb.boxYOffset, null);
			}
			local63.drawImage(this.bodyRight, this.method9082(local73) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9073(local88) + this.lb.boxYOffset, null);
			local148 = this.left.getWidth(null);
			@Pc(226) int local226 = this.left.getHeight(null);
			@Pc(231) int local231 = this.right.getWidth(null);
			@Pc(236) int local236 = this.right.getHeight(null);
			@Pc(241) int local241 = this.bottom.getHeight(null);
			@Pc(246) int local246 = this.top.getWidth(null);
			@Pc(251) int local251 = this.top.getHeight(null);
			@Pc(256) int local256 = this.bottom.getWidth(null);
			@Pc(261) int local261 = this.bar.getWidth(null);
			@Pc(266) int local266 = this.background.getWidth(null);
			@Pc(277) int local277 = this.method9082(this.lb.width) + this.lb.xOffset;
			@Pc(289) int local289 = this.method9073(this.lb.height) + this.lb.yOffset;
			local63.drawImage(this.left, local277, local289 + (this.lb.height - local226) / 2, null);
			local63.drawImage(this.right, this.lb.width + local277 - local231, local289 - -((this.lb.height - local236) / 2), null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local148 - local231, this.lb.height);
			}
			@Pc(354) Graphics local354 = this.barBuf.getGraphics();
			@Pc(356) int local356;
			for (local356 = 0; local356 < this.lb.width - local148 - local231; local356 += local246) {
				local354.drawImage(this.top, local356, 0, null);
			}
			for (local356 = 0; local356 < this.lb.width - local231 - local148; local356 += local256) {
				local354.drawImage(this.bottom, local356, this.lb.height - local241, null);
			}
			local356 = arg0 * (this.lb.width - local231 - local148) / 100;
			if (local356 > 0) {
				@Pc(451) Image local451 = this.createImage(local356, this.lb.height - local241 - local251);
				@Pc(455) int local455 = local451.getWidth(null);
				@Pc(458) Graphics local458 = local451.getGraphics();
				for (@Pc(463) int local463 = arg1 - local261; local463 < local455; local463 += local261) {
					local458.drawImage(this.bar, local463, 0, null);
				}
				local354.drawImage(local451, 0, local251, null);
			}
			@Pc(493) int local493 = local356;
			local356 = this.lb.width - local148 - local231 - local356;
			if (local356 > 0) {
				@Pc(523) Image local523 = this.createImage(local356, this.lb.height - local251 - local241);
				@Pc(527) int local527 = local523.getWidth(null);
				@Pc(530) Graphics local530 = local523.getGraphics();
				for (@Pc(532) int local532 = 0; local532 < local527; local532 += local266) {
					local530.drawImage(this.background, local532, 0, null);
				}
				local354.drawImage(local523, local493, local251, null);
			}
			local63.drawImage(this.barBuf, local277 + local148, local289, null);
			local63.setFont(this.bf);
			local63.setColor(this.colourtext);
			@Pc(587) String local587 = arg2 + " - " + arg0 + "%";
			local63.drawString(local587, (this.lb.width - this.bfm.stringWidth(local587)) / 2 + local277, this.lb.textYOffset + this.lb.height / 2 + (local289 - -4));
			local41.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(626) Exception local626) {
			this.method9081();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9081() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean769 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9082(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10676 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method9083(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg1);
			local12.write(arg0, 0, arg0.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method9071("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method9084(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class381.anIntArray608[anInt10674]);
			this.aColor2 = new Color(Class381.anIntArray606[anInt10674]);
			this.colourtext = new Color(Class381.anIntArray607[anInt10674]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(87) int local87;
		@Pc(94) int local94;
		@Pc(160) String local160;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10676, this.anInt10677);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			local65.setColor(Color.black);
			local65.fillRect(0, 0, this.anInt10676, this.anInt10677);
			local65.setColor(this.aColor3);
			local87 = this.anInt10676 / 2 - 152;
			local94 = this.anInt10677 / 2 - 18;
			local65.drawRect(local87, local94, 303, 33);
			local65.setColor(this.aColor2);
			local65.fillRect(local87 + 2, local94 + 2, arg0 * 3, 30);
			local65.setColor(Color.black);
			local65.drawRect(local87 + 1, local94 + 1, 301, 31);
			local65.fillRect(arg0 * 3 + local87 + 2, local94 - -2, 300 - arg0 * 3, 30);
			local160 = arg1 + " - " + arg0 + "%";
			local65.setFont(this.bf);
			local65.setColor(this.colourtext);
			local65.drawString(local160, (this.anInt10676 - this.bfm.stringWidth(local160)) / 2, this.anInt10677 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(196) Exception local196) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10676, this.anInt10677);
			local43.setColor(this.aColor3);
			local87 = this.anInt10676 / 2 - 152;
			local94 = this.anInt10677 / 2 - 18;
			local43.drawRect(local87, local94, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local87 + 2, local94 - -2, arg0 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local87 + 1, local94 - -1, 301, 31);
			local43.fillRect(local87 + arg0 * 3 + 2, local94 + 2, 300 - arg0 * 3, 30);
			local43.setFont(this.bf);
			local160 = arg1 + " - " + arg0 + "%";
			local43.setColor(this.colourtext);
			local43.drawString(local160, (this.anInt10676 - this.bfm.stringWidth(local160)) / 2, this.anInt10677 / 2 + 4);
		}
		return true;
	}
}
