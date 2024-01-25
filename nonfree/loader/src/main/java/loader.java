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
	private static String aString125;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString126;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt10306 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!b;")
	private Class380 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt10305;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean766;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private int anInt10307;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10304 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean763 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean764 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean767 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean765 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8618(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class383.aClass380Array1[anInt10306] == null || this.aBoolean766 ? this.method8625(arg1, arg2) : this.method8628(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean763 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!e;Z)[B")
	private byte[] method8619(@OriginalArg(1) Class381 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10301];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(30) InputStream local30;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0.aString121 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg0.aString121)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local76 < local5.length) {
					@Pc(92) int local92 = local5.length - local76;
					if (local92 > 1000) {
						local92 = 1000;
					}
					@Pc(106) int local106 = local30.read(local5, local76, local92);
					if (local106 >= 0) {
						local76 += local106;
						@Pc(127) int local127 = local76 * 100 / local5.length;
						@Pc(129) int local129 = 0;
						if (this.lb != null && this.bar != null) {
							local129 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local127 != local74 || local129 != local78) {
							try {
								if (this.method8618(local129, arg0.aStringArray48[this.anInt10304], local127)) {
									local74 = local127;
									local78 = local129;
								}
							} catch (@Pc(171) Exception local171) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local30.close();
				if (arg0.anInt10301 != arg0.anInt10300) {
					@Pc(196) byte[] local196 = new byte[arg0.anInt10300];
					@Pc(201) Inflater local201 = new Inflater(true);
					local201.setInput(local5);
					local201.inflate(local196);
					local5 = local196;
				}
				break;
			}
		} catch (@Pc(212) Exception local212) {
			return null;
		}
		return this.method8621(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8620(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(41) Exception local41) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;[BI)Z")
	private boolean method8621(@OriginalArg(0) Class381 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray757[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method8627("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8622(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10305 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method8623(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method8627("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean767 = false;
		this.aBoolean764 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8624() {
		this.aColor2 = null;
		this.anImage14 = null;
		this.aColor3 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BI)Z")
	private boolean method8625(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class383.anIntArray760[anInt10306]);
			this.aColor3 = new Color(Class383.anIntArray759[anInt10306]);
			this.colourtext = new Color(Class383.anIntArray758[anInt10306]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(85) int local85;
		@Pc(92) int local92;
		@Pc(160) String local160;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10305, this.anInt10307);
			}
			@Pc(63) Graphics local63 = this.anImage14.getGraphics();
			local63.setColor(Color.black);
			local63.fillRect(0, 0, this.anInt10305, this.anInt10307);
			local63.setColor(this.aColor2);
			local85 = this.anInt10305 / 2 - 152;
			local92 = this.anInt10307 / 2 - 18;
			local63.drawRect(local85, local92, 303, 33);
			local63.setColor(this.aColor3);
			local63.fillRect(local85 + 2, local92 - -2, arg1 * 3, 30);
			local63.setColor(Color.black);
			local63.drawRect(local85 + 1, local92 + 1, 301, 31);
			local63.fillRect(local85 + arg1 * 3 + 2, local92 - -2, 300 - arg1 * 3, 30);
			local160 = arg0 + " - " + arg1 + "%";
			local63.setFont(this.bf);
			local63.setColor(this.colourtext);
			local63.drawString(local160, (this.anInt10305 - this.bfm.stringWidth(local160)) / 2, this.anInt10307 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(196) Exception local196) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10305, this.anInt10307);
			local43.setColor(this.aColor2);
			local85 = this.anInt10305 / 2 - 152;
			local92 = this.anInt10307 / 2 - 18;
			local43.drawRect(local85, local92, 303, 33);
			local43.setColor(this.aColor3);
			local43.fillRect(local85 + 2, local92 + 2, arg1 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local85 + 1, local92 - -1, 301, 31);
			local43.fillRect(local85 + arg1 * 3 + 2, local92 + 2, 300 - arg1 * 3, 30);
			local160 = arg0 + " - " + arg1 + "%";
			local43.setFont(this.bf);
			local43.setColor(this.colourtext);
			local43.drawString(local160, (this.anInt10305 - this.bfm.stringWidth(local160)) / 2, this.anInt10307 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean764 = this.aBoolean767 = false;
		this.aBoolean763 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8626(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void method8627(@OriginalArg(0) String arg0) {
		if (this.aBoolean765) {
			return;
		}
		this.aBoolean765 = true;
		try {
			if (aString125 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString125 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString126 = this.getParameter("unsignedurl");
			if (aString126 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean765 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString126), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString125 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class383.aStringArray49.length) {
					local37 = 0;
				}
			}
			@Pc(60) String local60 = this.getParameter("colourid");
			if (local60 != null) {
				anInt10306 = Integer.parseInt(local60);
				if (anInt10306 < 0 || anInt10306 >= Class383.anIntArray760.length) {
					anInt10306 = 0;
				}
			}
			this.lb = Class383.aClass380Array1[anInt10306];
			this.anInt10305 = this.getSize().width;
			this.anInt10307 = this.getSize().height;
			@Pc(97) int local97 = 32;
			try {
				@Pc(102) int local102 = Integer.parseInt(this.getParameter("modewhat"));
				local97 += local102;
			} catch (@Pc(108) Exception local108) {
			}
			try {
				@Pc(112) String local112 = this.getParameter("lang");
				if (local112 != null) {
					this.anInt10304 = Integer.parseInt(local112);
				}
			} catch (@Pc(122) Exception local122) {
			}
			Class382.method8610(Class383.aStringArray49[local37], local97);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString118, 0, this.lb.anInt10299);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10298);
					this.bar = this.method8620(this.lb.aString113);
					this.background = this.method8620(this.lb.aString114);
					this.left = this.method8620(this.lb.aString119);
					this.right = this.method8620(this.lb.aString111);
					this.top = this.method8620(this.lb.aString110);
					this.bottom = this.method8620(this.lb.aString115);
					this.bodyLeft = this.method8620(this.lb.aString116);
					this.bodyRight = this.method8620(this.lb.aString117);
					this.bodyFill = this.method8620(this.lb.aString112);
					@Pc(277) Image[] local277 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(282) MediaTracker local282 = new MediaTracker(this);
					for (@Pc(284) int local284 = 0; local284 < local277.length; local284++) {
						local282.addImage(local277[local284], local284);
					}
					while (true) {
						try {
							local282.waitForAll();
							break;
						} catch (@Pc(301) InterruptedException local301) {
						}
					}
				} catch (@Pc(305) Throwable local305) {
					this.method8630();
				}
			}
			@Pc(310) unpack local310 = null;
			@Pc(318) byte[] local318;
			try {
				Class.forName("java.util.jar.Pack200");
				local318 = this.method8629(Class383.aClass381_2);
				if (local318 == null) {
					return;
				}
				local310 = new unpack_Sub1(local318);
			} catch (@Pc(328) Throwable local328) {
			}
			if (local310 == null) {
				local318 = this.method8629(Class383.aClass381_1);
				if (local318 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local318);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method8609(local355.getName(), local355);
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method8629(Class383.aClass381_3);
				if (local370 == null) {
					return;
				}
				local310 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(404) ClassLoader_Sub1 local404 = new ClassLoader_Sub1(local310);
			@Pc(407) Class local407 = Class.forName("Class382");
			local404.method8609(local407.getName(), local407);
			@Pc(417) Class local417 = local404.loadClass("client");
			synchronized (this) {
				if (this.aBoolean763) {
					return;
				}
				this.anApplet3 = (Applet) local417.getDeclaredConstructor().newInstance();
				local417.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean764) {
					this.anApplet3.start();
				}
				if (this.aBoolean767) {
					this.anApplet3.stop();
				}
			}
			this.method8624();
		} catch (@Pc(487) Exception local487) {
			RuntimeException_Sub2.anInt10303 = -1697780851;
			if (local487 instanceof InvocationTargetException) {
				@Pc(496) Throwable local496 = ((InvocationTargetException) local487).getTargetException();
				if (local496 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8615(local496, this, local487.toString());
			} else {
				RuntimeException_Sub2.method8615(local487, this, null);
			}
			this.method8627("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;B)Z")
	private boolean method8628(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10305, this.anInt10307);
			this.canvas.setVisible(true);
		}
		@Pc(39) Graphics local39 = this.canvas.getGraphics();
		if (local39 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10305, this.anInt10307);
			}
			@Pc(56) Graphics local56 = this.anImage14.getGraphics();
			@Pc(61) int local61 = this.bodyLeft.getWidth(null);
			@Pc(66) int local66 = this.bodyRight.getWidth(null);
			@Pc(71) int local71 = this.bodyFill.getWidth(null);
			@Pc(76) int local76 = this.bodyLeft.getHeight(null);
			@Pc(81) int local81 = this.bodyRight.getHeight(null);
			@Pc(86) int local86 = this.bodyFill.getHeight(null);
			local56.drawImage(this.bodyLeft, this.method8622(local61) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8631(local76) + this.lb.boxYOffset, null);
			@Pc(132) int local132 = this.lb.boxXOffset + local61 - this.lb.boxWidth / 2;
			@Pc(143) int local143 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(145) int local145;
			for (local145 = local132; local145 <= local143; local145 += local71) {
				local56.drawImage(this.bodyFill, local145 + this.method8622(local61) + this.lb.boxXOffset, this.method8631(local86) + this.lb.boxYOffset, null);
			}
			local56.drawImage(this.bodyRight, this.method8622(local66) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8631(local81) - -this.lb.boxYOffset, null);
			local145 = this.left.getWidth(null);
			@Pc(220) int local220 = this.left.getHeight(null);
			@Pc(225) int local225 = this.right.getWidth(null);
			@Pc(230) int local230 = this.right.getHeight(null);
			@Pc(235) int local235 = this.bottom.getHeight(null);
			@Pc(240) int local240 = this.top.getWidth(null);
			@Pc(245) int local245 = this.top.getHeight(null);
			@Pc(250) int local250 = this.bottom.getWidth(null);
			@Pc(255) int local255 = this.bar.getWidth(null);
			@Pc(260) int local260 = this.background.getWidth(null);
			@Pc(272) int local272 = this.method8622(this.lb.width) + this.lb.xOffset;
			@Pc(283) int local283 = this.method8631(this.lb.height) + this.lb.yOffset;
			local56.drawImage(this.left, local272, (this.lb.height - local220) / 2 + local283, null);
			local56.drawImage(this.right, this.lb.width + local272 - local225, (this.lb.height + -local230) / 2 + local283, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local225 - local145, this.lb.height);
			}
			@Pc(346) Graphics local346 = this.barBuf.getGraphics();
			@Pc(348) int local348;
			for (local348 = 0; local348 < this.lb.width - local225 - local145; local348 += local240) {
				local346.drawImage(this.top, local348, 0, null);
			}
			for (local348 = 0; local348 < this.lb.width - local145 - local225; local348 += local250) {
				local346.drawImage(this.bottom, local348, this.lb.height - local235, null);
			}
			local348 = (this.lb.width - local225 - local145) * arg1 / 100;
			if (local348 > 0) {
				@Pc(439) Image local439 = this.createImage(local348, this.lb.height - local235 - local245);
				@Pc(443) int local443 = local439.getWidth(null);
				@Pc(446) Graphics local446 = local439.getGraphics();
				for (@Pc(451) int local451 = arg0 - local255; local451 < local443; local451 += local255) {
					local446.drawImage(this.bar, local451, 0, null);
				}
				local346.drawImage(local439, 0, local245, null);
			}
			@Pc(481) int local481 = local348;
			local348 = this.lb.width - local225 - local145 - local348;
			if (local348 > 0) {
				@Pc(508) Image local508 = this.createImage(local348, this.lb.height - local245 - local235);
				@Pc(512) int local512 = local508.getWidth(null);
				@Pc(515) Graphics local515 = local508.getGraphics();
				for (@Pc(517) int local517 = 0; local517 < local512; local517 += local260) {
					local515.drawImage(this.background, local517, 0, null);
				}
				local346.drawImage(local508, local481, local245, null);
			}
			local56.drawImage(this.barBuf, local272 + local145, local283, null);
			local56.setFont(this.bf);
			local56.setColor(this.colourtext);
			@Pc(572) String local572 = arg2 + " - " + arg1 + "%";
			local56.drawString(local572, local272 + (this.lb.width - this.bfm.stringWidth(local572)) / 2, this.lb.textYOffset + this.lb.height / 2 + (local283 - -4));
			local39.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(610) Exception local610) {
			this.method8630();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;I)[B")
	private byte[] method8629(@OriginalArg(0) Class381 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class382.method8612(arg0.aString120);
		} catch (@Pc(6) Exception local6) {
			this.method8627("nocache");
			return null;
		}
		@Pc(19) byte[] local19 = this.method8626(local4);
		if (!this.method8621(arg0, local19)) {
			local19 = this.method8619(arg0, false);
			if (local19 == null) {
				local19 = this.method8619(arg0, true);
			}
			if (local19 == null) {
				this.method8627("download");
				return null;
			}
			if (!this.method8623(local4, local19)) {
				return null;
			}
			local19 = this.method8626(local4);
			if (!this.method8621(arg0, local19)) {
				this.method8627("mismatch");
				return null;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8630() {
		this.bf = null;
		this.bfm = null;
		this.aBoolean766 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean764 = false;
		this.aBoolean767 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method8631(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10307 - arg0) / 2 : 0;
	}
}
