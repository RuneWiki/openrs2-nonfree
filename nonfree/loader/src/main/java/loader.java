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
	private static String aString122;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString123;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt10309 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt10307;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet4;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class386 lb;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt10310;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean785;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean782 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10308 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean783 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean781 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean784 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method8695(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method8702("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;II)Z")
	private boolean method8696(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10310, this.anInt10307);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10310, this.anInt10307);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			@Pc(70) int local70 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(75) int local75 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(85) int local85 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(90) int local90 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(95) int local95 = this.bodyFill.getHeight((ImageObserver) null);
			local65.drawImage(this.bodyLeft, this.method8703(local70) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8708(local85) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(139) int local139 = this.lb.boxXOffset + local70 - this.lb.boxWidth / 2;
			@Pc(149) int local149 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(151) int local151;
			for (local151 = local139; local151 <= local149; local151 += local80) {
				local65.drawImage(this.bodyFill, local151 + this.method8703(local70) + this.lb.boxXOffset, this.method8708(local95) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local65.drawImage(this.bodyRight, this.method8703(local75) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8708(local90) - -this.lb.boxYOffset, (ImageObserver) null);
			local151 = this.left.getWidth((ImageObserver) null);
			@Pc(229) int local229 = this.left.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.right.getWidth((ImageObserver) null);
			@Pc(239) int local239 = this.right.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.bottom.getHeight((ImageObserver) null);
			@Pc(249) int local249 = this.top.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.top.getHeight((ImageObserver) null);
			@Pc(259) int local259 = this.bottom.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.bar.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.background.getWidth((ImageObserver) null);
			@Pc(281) int local281 = this.method8703(this.lb.width) + this.lb.xOffset;
			@Pc(293) int local293 = this.method8708(this.lb.height) + this.lb.yOffset;
			local65.drawImage(this.left, local281, local293 + (this.lb.height - local229) / 2, (ImageObserver) null);
			local65.drawImage(this.right, this.lb.width + local281 - local234, local293 - -((-local239 + this.lb.height) / 2), (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local151 - local234, this.lb.height);
			}
			@Pc(357) Graphics local357 = this.barBuf.getGraphics();
			@Pc(359) int local359;
			for (local359 = 0; local359 < this.lb.width - local151 - local234; local359 += local249) {
				local357.drawImage(this.top, local359, 0, (ImageObserver) null);
			}
			for (local359 = 0; local359 < this.lb.width - local234 - local151; local359 += local259) {
				local357.drawImage(this.bottom, local359, this.lb.height - local244, (ImageObserver) null);
			}
			local359 = arg2 * (this.lb.width - local151 - local234) / 100;
			if (local359 > 0) {
				@Pc(450) Image local450 = this.createImage(local359, this.lb.height - local244 - local254);
				@Pc(454) int local454 = local450.getWidth((ImageObserver) null);
				@Pc(457) Graphics local457 = local450.getGraphics();
				for (@Pc(462) int local462 = arg1 - local264; local462 < local454; local462 += local264) {
					local457.drawImage(this.bar, local462, 0, (ImageObserver) null);
				}
				local357.drawImage(local450, 0, local254, (ImageObserver) null);
			}
			@Pc(492) int local492 = local359;
			local359 = this.lb.width - local359 - local151 - local234;
			if (local359 > 0) {
				@Pc(521) Image local521 = this.createImage(local359, this.lb.height - local254 - local244);
				@Pc(525) int local525 = local521.getWidth((ImageObserver) null);
				@Pc(528) Graphics local528 = local521.getGraphics();
				for (@Pc(530) int local530 = 0; local530 < local525; local530 += local269) {
					local528.drawImage(this.background, local530, 0, (ImageObserver) null);
				}
				local357.drawImage(local521, local492, local254, (ImageObserver) null);
			}
			local65.drawImage(this.barBuf, local151 + local281, local293, (ImageObserver) null);
			local65.setFont(this.bf);
			local65.setColor(this.colourtext);
			@Pc(585) String local585 = arg0 + " - " + arg2 + "%";
			local65.drawString(local585, local281 + (this.lb.width - this.bfm.stringWidth(local585)) / 2, this.lb.textYOffset + this.lb.height / 2 + (local293 - -4));
			local33.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(624) Exception local624) {
			this.method8698();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean781 = this.aBoolean782 = false;
		this.aBoolean783 = true;
		if (this.anApplet4 != null) {
			this.anApplet4.destroy();
		}
		this.anApplet4 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!h;I)[B")
	private byte[] method8697(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class387 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10305];
		@Pc(14) int local14 = 0;
		if (this.lb != null && this.bar != null) {
			local14 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(37) InputStream local37;
			if (arg0) {
				@Pc(42) URL local42 = this.getCodeBase();
				@Pc(50) Socket local50 = new Socket(InetAddress.getByName(local42.getHost()), 443);
				local50.setSoTimeout(10000);
				@Pc(56) OutputStream local56 = local50.getOutputStream();
				local56.write(17);
				local56.write(("JAGGRAB " + local42.getFile() + arg1.aString121 + "\n\n").getBytes());
				local37 = local50.getInputStream();
			} else {
				local37 = (new URL(this.getCodeBase(), arg1.aString121)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local83 >= local5.length) {
					local37.close();
					if (arg1.anInt10305 != arg1.anInt10306) {
						@Pc(191) byte[] local191 = new byte[arg1.anInt10306];
						@Pc(196) Inflater local196 = new Inflater(true);
						local196.setInput(local5);
						local196.inflate(local191);
						local5 = local191;
					}
					break;
				}
				@Pc(94) int local94 = local5.length - local83;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(106) int local106 = local37.read(local5, local83, local94);
				if (local106 < 0) {
					throw new EOFException();
				}
				local83 += local106;
				@Pc(126) int local126 = local83 * 100 / local5.length;
				@Pc(128) int local128 = 0;
				if (this.lb != null && this.bar != null) {
					local128 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local14;
				}
				if (local126 != local81 || local128 != local85) {
					try {
						if (this.method8701(local126, local128, arg1.aStringArray84[this.anInt10308])) {
							local81 = local126;
							local85 = local128;
						}
					} catch (@Pc(173) Exception local173) {
					}
				}
			}
		} catch (@Pc(207) Exception local207) {
			return null;
		}
		return this.method8705(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean783 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8698() {
		this.aBoolean785 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean782 = false;
		this.aBoolean781 = true;
		if (this.anApplet4 != null) {
			this.anApplet4.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;Z)[B")
	private byte[] method8699(@OriginalArg(0) Class387 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class388.method8710(arg0.aString120);
		} catch (@Pc(13) Exception local13) {
			this.method8702("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method8704(local4);
		if (!this.method8705(arg0, local24)) {
			local24 = this.method8697(false, arg0);
			if (local24 == null) {
				local24 = this.method8697(true, arg0);
			}
			if (local24 == null) {
				this.method8702("download");
				return null;
			}
			if (!this.method8695(local24, local4)) {
				return null;
			}
			local24 = this.method8704(local4);
			if (!this.method8705(arg0, local24)) {
				this.method8702("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean781 = false;
		this.aBoolean782 = true;
		if (this.anApplet4 != null) {
			this.anApplet4.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	private boolean method8700(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class385.anIntArray682[anInt10309]);
			this.aColor3 = new Color(Class385.anIntArray681[anInt10309]);
			this.colourtext = new Color(Class385.anIntArray683[anInt10309]);
		}
		@Pc(49) Graphics local49 = this.getGraphics();
		if (local49 == null) {
			this.repaint();
			return false;
		}
		@Pc(89) int local89;
		@Pc(96) int local96;
		@Pc(162) String local162;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10310, this.anInt10307);
			}
			@Pc(67) Graphics local67 = this.anImage14.getGraphics();
			local67.setColor(Color.black);
			local67.fillRect(0, 0, this.anInt10310, this.anInt10307);
			local67.setColor(this.aColor2);
			local89 = this.anInt10310 / 2 - 152;
			local96 = this.anInt10307 / 2 - 18;
			local67.drawRect(local89, local96, 303, 33);
			local67.setColor(this.aColor3);
			local67.fillRect(local89 + 2, local96 + 2, arg1 * 3, 30);
			local67.setColor(Color.black);
			local67.drawRect(local89 + 1, local96 + 1, 301, 31);
			local67.fillRect(arg1 * 3 + local89 + 2, local96 + 2, 300 - arg1 * 3, 30);
			local162 = arg0 + " - " + arg1 + "%";
			local67.setFont(this.bf);
			local67.setColor(this.colourtext);
			local67.drawString(local162, (this.anInt10310 - this.bfm.stringWidth(local162)) / 2, this.anInt10307 / 2 + 4);
			local49.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(199) Exception local199) {
			local49.setColor(Color.black);
			local49.fillRect(0, 0, this.anInt10310, this.anInt10307);
			local49.setColor(this.aColor2);
			local89 = this.anInt10310 / 2 - 152;
			local96 = this.anInt10307 / 2 - 18;
			local49.drawRect(local89, local96, 303, 33);
			local49.setColor(this.aColor3);
			local49.fillRect(local89 + 2, local96 + 2, arg1 * 3, 30);
			local49.setColor(Color.black);
			local49.drawRect(local89 + 1, local96 + 1, 301, 31);
			local49.fillRect(arg1 * 3 + local89 + 2, local96 + 2, 300 - arg1 * 3, 30);
			local49.setFont(this.bf);
			local162 = arg0 + " - " + arg1 + "%";
			local49.setColor(this.colourtext);
			local49.drawString(local162, (this.anInt10310 - this.bfm.stringWidth(local162)) / 2, this.anInt10307 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString123 = this.getParameter("unsignedurl");
			if (aString123 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean784 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString123), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString122 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class385.aStringArray83.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt10309 = Integer.parseInt(local62);
				if (anInt10309 < 0 || Class385.anIntArray682.length <= anInt10309) {
					anInt10309 = 0;
				}
			}
			this.lb = Class385.aClass386Array1[anInt10309];
			this.anInt10310 = this.getSize().width;
			this.anInt10307 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt10308 = Integer.parseInt(local113);
				}
			} catch (@Pc(122) Exception local122) {
			}
			Class388.method8709(local98, Class385.aStringArray83[local37]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString118, 0, this.lb.anInt10303);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10304);
					this.bar = this.method8707(this.lb.aString111);
					this.background = this.method8707(this.lb.aString116);
					this.left = this.method8707(this.lb.aString112);
					this.right = this.method8707(this.lb.aString110);
					this.top = this.method8707(this.lb.aString114);
					this.bottom = this.method8707(this.lb.aString119);
					this.bodyLeft = this.method8707(this.lb.aString113);
					this.bodyRight = this.method8707(this.lb.aString115);
					this.bodyFill = this.method8707(this.lb.aString117);
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
					this.method8698();
				}
			}
			@Pc(314) unpack local314 = null;
			@Pc(322) byte[] local322;
			try {
				Class.forName("java.util.jar.Pack200");
				local322 = this.method8699(Class385.aClass387_2);
				if (local322 == null) {
					return;
				}
				local314 = new unpack_Sub1(local322);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local314 == null) {
				local322 = this.method8699(Class385.aClass387_1);
				if (local322 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local322);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method8691(local358.getName(), local358);
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method8699(Class385.aClass387_3);
				if (local373 == null) {
					return;
				}
				local314 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(408) ClassLoader_Sub1 local408 = new ClassLoader_Sub1(local314);
			@Pc(411) Class local411 = Class.forName("Class388");
			local408.method8691(local411.getName(), local411);
			@Pc(421) Class local421 = local408.loadClass("client");
			synchronized (this) {
				if (this.aBoolean783) {
					return;
				}
				this.anApplet4 = (Applet) local421.getDeclaredConstructor().newInstance();
				local421.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet4.init();
				if (this.aBoolean781) {
					this.anApplet4.start();
				}
				if (this.aBoolean782) {
					this.anApplet4.stop();
				}
			}
			this.method8706();
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt10302 = 1135219418;
			if (local491 instanceof InvocationTargetException) {
				@Pc(500) Throwable local500 = ((InvocationTargetException) local491).getTargetException();
				if (local500 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8687(local491.toString(), local500, this);
			} else {
				RuntimeException_Sub2.method8687((String) null, local491, this);
			}
			this.method8702("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method8701(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class385.aClass386Array1[anInt10309] == null || this.aBoolean785 ? this.method8700(arg2, arg0) : this.method8696(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8702(@OriginalArg(0) String arg0) {
		if (this.aBoolean784) {
			return;
		}
		this.aBoolean784 = true;
		try {
			if (aString122 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString122 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method8703(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10310 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8704(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local14];
			local25.readFully(local28, 0, local14);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;[BI)Z")
	private boolean method8705(@OriginalArg(0) Class387 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(19) MessageDigest local19 = MessageDigest.getInstance("SHA");
			local19.reset();
			local19.update(arg1);
			@Pc(27) byte[] local27 = local19.digest();
			for (@Pc(29) int local29 = 0; local29 < 20; local29++) {
				if (local27[local29] != arg0.anIntArray684[local29]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(54) Exception local54) {
			this.method8702("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8706() {
		this.barBuf = null;
		this.aColor3 = null;
		this.anImage14 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method8707(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(24) int local24;
			while ((local24 = local6.read()) != -1) {
				local9[local11++] = (byte) local24;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8708(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10307 - arg0) / 2 : 0;
	}
}
