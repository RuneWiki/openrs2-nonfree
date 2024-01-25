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
	private static String aString138;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString139;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt10907 = 0;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt10905;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10906;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean931;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!h;")
	private Class399 lb;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean930 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean929 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean933 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private int anInt10908 = 0;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean932 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!f;B)Z")
	private boolean method9069(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class397 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(27) int local27 = 0; local27 < 20; local27++) {
				if (local17[local27] != arg1.anIntArray613[local27]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method9077("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIZLjava/lang/String;)Z")
	private boolean method9070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10906, this.anInt10905);
			this.canvas.setVisible(true);
		}
		@Pc(38) Graphics local38 = this.canvas.getGraphics();
		if (local38 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10906, this.anInt10905);
			}
			@Pc(62) Graphics local62 = this.anImage14.getGraphics();
			@Pc(67) int local67 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(72) int local72 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(77) int local77 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(82) int local82 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(87) int local87 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(92) int local92 = this.bodyFill.getHeight((ImageObserver) null);
			local62.drawImage(this.bodyLeft, this.method9074(local67) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9079(local82) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(136) int local136 = local67 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(146) int local146 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(148) int local148;
			for (local148 = local136; local148 <= local146; local148 += local77) {
				local62.drawImage(this.bodyFill, local148 + this.method9074(local67) + this.lb.boxXOffset, this.method9079(local92) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local62.drawImage(this.bodyRight, this.method9074(local72) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9079(local87) + this.lb.boxYOffset, (ImageObserver) null);
			local148 = this.left.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.left.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.right.getWidth((ImageObserver) null);
			@Pc(230) int local230 = this.right.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.bottom.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.top.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.top.getHeight((ImageObserver) null);
			@Pc(250) int local250 = this.bottom.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.bar.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.background.getWidth((ImageObserver) null);
			@Pc(272) int local272 = this.method9074(this.lb.width) + this.lb.xOffset;
			@Pc(283) int local283 = this.method9079(this.lb.height) + this.lb.yOffset;
			local62.drawImage(this.left, local272, local283 + (this.lb.height - local220) / 2, (ImageObserver) null);
			local62.drawImage(this.right, local272 + this.lb.width - local225, local283 - -((-local230 + this.lb.height) / 2), (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local225 - local148, this.lb.height);
			}
			@Pc(348) Graphics local348 = this.barBuf.getGraphics();
			@Pc(350) int local350;
			for (local350 = 0; local350 < this.lb.width - local148 - local225; local350 += local240) {
				local348.drawImage(this.top, local350, 0, (ImageObserver) null);
			}
			for (local350 = 0; local350 < this.lb.width - local225 - local148; local350 += local250) {
				local348.drawImage(this.bottom, local350, this.lb.height - local235, (ImageObserver) null);
			}
			local350 = arg1 * (this.lb.width - local225 - local148) / 100;
			if (local350 > 0) {
				@Pc(440) Image local440 = this.createImage(local350, this.lb.height - local235 - local245);
				@Pc(444) int local444 = local440.getWidth((ImageObserver) null);
				@Pc(447) Graphics local447 = local440.getGraphics();
				for (@Pc(452) int local452 = arg0 - local255; local452 < local444; local452 += local255) {
					local447.drawImage(this.bar, local452, 0, (ImageObserver) null);
				}
				local348.drawImage(local440, 0, local245, (ImageObserver) null);
			}
			@Pc(482) int local482 = local350;
			local350 = this.lb.width - local350 - local148 - local225;
			if (local350 > 0) {
				@Pc(509) Image local509 = this.createImage(local350, this.lb.height - local235 - local245);
				@Pc(513) int local513 = local509.getWidth((ImageObserver) null);
				@Pc(516) Graphics local516 = local509.getGraphics();
				for (@Pc(518) int local518 = 0; local518 < local513; local518 += local260) {
					local516.drawImage(this.background, local518, 0, (ImageObserver) null);
				}
				local348.drawImage(local509, local482, local245, (ImageObserver) null);
			}
			local62.drawImage(this.barBuf, local272 + local148, local283, (ImageObserver) null);
			local62.setFont(this.bf);
			local62.setColor(this.colourtext);
			@Pc(573) String local573 = arg2 + " - " + arg1 + "%";
			local62.drawString(local573, (this.lb.width - this.bfm.stringWidth(local573)) / 2 + local272, this.lb.textYOffset + 4 + (local283 - -(this.lb.height / 2)));
			local38.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(612) Exception local612) {
			this.method9078();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZZLloader!f;)[B")
	private byte[] method9071(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class397 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10901];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(61) InputStream local61;
			if (arg0) {
				@Pc(24) URL local24 = this.getCodeBase();
				@Pc(32) Socket local32 = new Socket(InetAddress.getByName(local24.getHost()), 443);
				local32.setSoTimeout(10000);
				@Pc(38) OutputStream local38 = local32.getOutputStream();
				local38.write(17);
				local38.write(("JAGGRAB " + local24.getFile() + arg1.aString127 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg1.aString127)).openStream();
			}
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = 0;
			@Pc(84) int local84 = 0;
			while (true) {
				if (local82 < local5.length) {
					@Pc(98) int local98 = local5.length - local82;
					if (local98 > 1000) {
						local98 = 1000;
					}
					@Pc(111) int local111 = local61.read(local5, local82, local98);
					if (local111 >= 0) {
						local82 += local111;
						@Pc(130) int local130 = local82 * 100 / local5.length;
						@Pc(132) int local132 = 0;
						if (this.lb != null && this.bar != null) {
							local132 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local130 != local80 || local132 != local84) {
							try {
								if (this.method9076(local132, local130, arg1.aStringArray62[this.anInt10908])) {
									local84 = local132;
									local80 = local130;
								}
							} catch (@Pc(183) Exception local183) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local61.close();
				if (arg1.anInt10901 != arg1.anInt10902) {
					@Pc(197) byte[] local197 = new byte[arg1.anInt10902];
					@Pc(202) Inflater local202 = new Inflater(true);
					local202.setInput(local5);
					local5 = local197;
					local202.inflate(local197);
				}
				break;
			}
		} catch (@Pc(213) Exception local213) {
			return null;
		}
		return this.method9069(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method9072(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(32) byte[] local32 = new byte[local9];
			local29.readFully(local32, 0, local9);
			local29.close();
			return local32;
		} catch (@Pc(42) IOException local42) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean930 = this.aBoolean929 = false;
		this.aBoolean932 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean929 = false;
		this.aBoolean930 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9073() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean929 = true;
		this.aBoolean930 = false;
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString138 = this.getParameter("unsignedurl");
			if (aString138 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean933 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString138), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString139 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class398.aStringArray63.length) {
					local39 = 0;
				}
			}
			@Pc(69) String local69 = this.getParameter("colourid");
			if (local69 != null) {
				anInt10907 = Integer.parseInt(local69);
				if (anInt10907 < 0 || Class398.anIntArray616.length <= anInt10907) {
					anInt10907 = 0;
				}
			}
			this.lb = Class398.aClass399Array1[anInt10907];
			this.anInt10906 = this.getSize().width;
			this.anInt10905 = this.getSize().height;
			@Pc(103) int local103 = 32;
			try {
				@Pc(108) int local108 = Integer.parseInt(this.getParameter("modewhat"));
				local103 += local108;
			} catch (@Pc(114) Exception local114) {
			}
			try {
				@Pc(118) String local118 = this.getParameter("lang");
				if (local118 != null) {
					this.anInt10908 = Integer.parseInt(local118);
				}
			} catch (@Pc(127) Exception local127) {
			}
			Class396.method9064(local103, Class398.aStringArray63[local39]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString132, 0, this.lb.anInt10904);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10903);
					this.bar = this.method9080(this.lb.aString137);
					this.background = this.method9080(this.lb.aString134);
					this.left = this.method9080(this.lb.aString133);
					this.right = this.method9080(this.lb.aString135);
					this.top = this.method9080(this.lb.aString130);
					this.bottom = this.method9080(this.lb.aString129);
					this.bodyLeft = this.method9080(this.lb.aString136);
					this.bodyRight = this.method9080(this.lb.aString128);
					this.bodyFill = this.method9080(this.lb.aString131);
					@Pc(283) Image[] local283 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(288) MediaTracker local288 = new MediaTracker(this);
					for (@Pc(290) int local290 = 0; local290 < local283.length; local290++) {
						local288.addImage(local283[local290], local290);
					}
					while (true) {
						try {
							local288.waitForAll();
							break;
						} catch (@Pc(311) InterruptedException local311) {
						}
					}
				} catch (@Pc(315) Throwable local315) {
					this.method9078();
				}
			}
			@Pc(320) unpack local320 = null;
			@Pc(328) byte[] local328;
			try {
				Class.forName("java.util.jar.Pack200");
				local328 = this.method9081(Class398.aClass397_2);
				if (local328 == null) {
					return;
				}
				local320 = new unpack_Sub1(local328);
			} catch (@Pc(338) Throwable local338) {
			}
			if (local320 == null) {
				local328 = this.method9081(Class398.aClass397_1);
				if (local328 == null) {
					return;
				}
				@Pc(353) unpack local353 = new unpack(local328);
				@Pc(358) ClassLoader_Sub1 local358 = new ClassLoader_Sub1(local353);
				@Pc(361) Class local361 = Class.forName("unpack");
				local358.method9065(local361.getName(), local361);
				@Pc(371) Class local371 = local358.loadClass("unpackclass");
				@Pc(376) byte[] local376 = this.method9081(Class398.aClass397_3);
				if (local376 == null) {
					return;
				}
				local320 = (unpack) local371.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local376, Boolean.TRUE);
			}
			@Pc(412) ClassLoader_Sub1 local412 = new ClassLoader_Sub1(local320);
			@Pc(415) Class local415 = Class.forName("Class396");
			local412.method9065(local415.getName(), local415);
			@Pc(425) Class local425 = local412.loadClass("client");
			synchronized (this) {
				if (this.aBoolean932) {
					return;
				}
				this.anApplet3 = (Applet) local425.getDeclaredConstructor().newInstance();
				local425.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean930) {
					this.anApplet3.start();
				}
				if (this.aBoolean929) {
					this.anApplet3.stop();
				}
			}
			this.method9073();
		} catch (@Pc(495) Exception local495) {
			RuntimeException_Sub2.anInt10899 = 1761605156;
			if (local495 instanceof InvocationTargetException) {
				@Pc(511) Throwable local511 = ((InvocationTargetException) local495).getTargetException();
				if (local511 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9057(local511, this, local495.toString());
			} else {
				RuntimeException_Sub2.method9057(local495, this, (String) null);
			}
			this.method9077("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9074(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10906 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method9075(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class398.anIntArray616[anInt10907]);
			this.aColor2 = new Color(Class398.anIntArray615[anInt10907]);
			this.colourtext = new Color(Class398.anIntArray614[anInt10907]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(91) int local91;
		@Pc(98) int local98;
		@Pc(164) String local164;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10906, this.anInt10905);
			}
			@Pc(69) Graphics local69 = this.anImage14.getGraphics();
			local69.setColor(Color.black);
			local69.fillRect(0, 0, this.anInt10906, this.anInt10905);
			local69.setColor(this.aColor3);
			local91 = this.anInt10906 / 2 - 152;
			local98 = this.anInt10905 / 2 - 18;
			local69.drawRect(local91, local98, 303, 33);
			local69.setColor(this.aColor2);
			local69.fillRect(local91 + 2, local98 + 2, arg0 * 3, 30);
			local69.setColor(Color.black);
			local69.drawRect(local91 + 1, local98 + 1, 301, 31);
			local69.fillRect(arg0 * 3 + local91 + 2, local98 - -2, 300 - arg0 * 3, 30);
			local164 = arg1 + " - " + arg0 + "%";
			local69.setFont(this.bf);
			local69.setColor(this.colourtext);
			local69.drawString(local164, (this.anInt10906 - this.bfm.stringWidth(local164)) / 2, this.anInt10905 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(200) Exception local200) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10906, this.anInt10905);
			local43.setColor(this.aColor3);
			local91 = this.anInt10906 / 2 - 152;
			local98 = this.anInt10905 / 2 - 18;
			local43.drawRect(local91, local98, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local91 + 2, local98 - -2, arg0 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local91 + 1, local98 - -1, 301, 31);
			local43.fillRect(local91 + arg0 * 3 + 2, local98 - -2, 300 - arg0 * 3, 30);
			local164 = arg1 + " - " + arg0 + "%";
			local43.setFont(this.bf);
			local43.setColor(this.colourtext);
			local43.drawString(local164, (this.anInt10906 - this.bfm.stringWidth(local164)) / 2, this.anInt10905 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method9076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class398.aClass399Array1[anInt10907] == null || this.aBoolean931 ? this.method9075(arg1, arg2) : this.method9070(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method9077(@OriginalArg(1) String arg0) {
		if (this.aBoolean933) {
			return;
		}
		this.aBoolean933 = true;
		try {
			if (aString139 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString139 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method9078() {
		this.aBoolean931 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9079(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10905 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method9080(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(13) InputStream local13 = this.getClass().getResourceAsStream(arg0);
			@Pc(16) byte[] local16 = new byte[3000];
			@Pc(18) int local18 = 0;
			@Pc(23) int local23;
			while ((local23 = local13.read()) != -1) {
				local16[local18++] = (byte) local23;
			}
			return Toolkit.getDefaultToolkit().createImage(local16);
		} catch (@Pc(41) Exception local41) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean932 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;B)[B")
	private byte[] method9081(@OriginalArg(0) Class397 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class396.method9062(arg0.aString126);
		} catch (@Pc(6) Exception local6) {
			this.method9077("nocache");
			return null;
		}
		@Pc(22) byte[] local22 = this.method9072(local4);
		if (!this.method9069(local22, arg0)) {
			local22 = this.method9071(false, arg0);
			if (local22 == null) {
				local22 = this.method9071(true, arg0);
			}
			if (local22 == null) {
				this.method9077("download");
				return null;
			}
			if (!this.method9082(local4, local22)) {
				return null;
			}
			local22 = this.method9072(local4);
			if (!this.method9069(local22, arg0)) {
				this.method9077("mismatch");
				return null;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	private boolean method9082(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method9077("savefile");
			return false;
		}
	}
}
