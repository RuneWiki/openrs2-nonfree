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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString140;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString141;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt11225 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!h;")
	private Class404 lb;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage16;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt11226;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt11228;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean793;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean789 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean790 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean791 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean792 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt11227 = 0;

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
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean792 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString141), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString140 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class402.aStringArray52.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt11225 = Integer.parseInt(local63);
				if (anInt11225 < 0 || Class402.anIntArray608.length <= anInt11225) {
					anInt11225 = 0;
				}
			}
			this.lb = Class402.aClass404Array1[anInt11225];
			this.anInt11228 = this.getSize().width;
			this.anInt11226 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt11227 = Integer.parseInt(local113);
				}
			} catch (@Pc(121) Exception local121) {
			}
			Class401.method9520(local98, Class402.aStringArray52[local36]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString137, 0, this.lb.anInt11223);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt11224);
					this.bar = this.method9542(this.lb.aString138);
					this.background = this.method9542(this.lb.aString139);
					this.left = this.method9542(this.lb.aString135);
					this.right = this.method9542(this.lb.aString133);
					this.top = this.method9542(this.lb.aString131);
					this.bottom = this.method9542(this.lb.aString134);
					this.bodyLeft = this.method9542(this.lb.aString132);
					this.bodyRight = this.method9542(this.lb.aString130);
					this.bodyFill = this.method9542(this.lb.aString136);
					@Pc(278) Image[] local278 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(283) MediaTracker local283 = new MediaTracker(this);
					for (@Pc(285) int local285 = 0; local285 < local278.length; local285++) {
						local283.addImage(local278[local285], local285);
					}
					while (true) {
						try {
							local283.waitForAll();
							break;
						} catch (@Pc(306) InterruptedException local306) {
						}
					}
				} catch (@Pc(310) Throwable local310) {
					this.method9541();
				}
			}
			@Pc(315) unpack local315 = null;
			@Pc(323) byte[] local323;
			try {
				Class.forName("java.util.jar.Pack200");
				local323 = this.method9533(Class402.aClass403_2);
				if (local323 == null) {
					return;
				}
				local315 = new unpack_Sub1(local323);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local315 == null) {
				local323 = this.method9533(Class402.aClass403_1);
				if (local323 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local323);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method9523(local358, local358.getName());
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method9533(Class402.aClass403_3);
				if (local373 == null) {
					return;
				}
				local315 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(407) ClassLoader_Sub1 local407 = new ClassLoader_Sub1(local315);
			@Pc(410) Class local410 = Class.forName("Class401");
			local407.method9523(local410, local410.getName());
			@Pc(420) Class local420 = local407.loadClass("client");
			synchronized (this) {
				if (this.aBoolean791) {
					return;
				}
				this.anApplet3 = (Applet) local420.getDeclaredConstructor().newInstance();
				local420.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean790) {
					this.anApplet3.start();
				}
				if (this.aBoolean789) {
					this.anApplet3.stop();
				}
			}
			this.method9539();
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt11220 = -583568938;
			if (local488 instanceof InvocationTargetException) {
				@Pc(504) Throwable local504 = ((InvocationTargetException) local488).getTargetException();
				if (local504 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9527(local488.toString(), this, local504);
			} else {
				RuntimeException_Sub2.method9527((String) null, this, local488);
			}
			this.method9531("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method9529(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg0);
			local11.write(arg1, 0, arg1.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method9531("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean790 = false;
		this.aBoolean789 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean790 = this.aBoolean789 = false;
		this.aBoolean791 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method9530(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class402.anIntArray608[anInt11225]);
			this.aColor3 = new Color(Class402.anIntArray607[anInt11225]);
			this.colourtext = new Color(Class402.anIntArray606[anInt11225]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(90) int local90;
		@Pc(97) int local97;
		@Pc(168) String local168;
		try {
			if (this.anImage16 == null) {
				this.anImage16 = this.createImage(this.anInt11228, this.anInt11226);
			}
			@Pc(68) Graphics local68 = this.anImage16.getGraphics();
			local68.setColor(Color.black);
			local68.fillRect(0, 0, this.anInt11228, this.anInt11226);
			local68.setColor(this.aColor2);
			local90 = this.anInt11228 / 2 - 152;
			local97 = this.anInt11226 / 2 - 18;
			local68.drawRect(local90, local97, 303, 33);
			local68.setColor(this.aColor3);
			local68.fillRect(local90 + 2, local97 + 2, arg1 * 3, 30);
			local68.setColor(Color.black);
			local68.drawRect(local90 + 1, local97 + 1, 301, 31);
			local68.fillRect(arg1 * 3 + local90 + 2, local97 - -2, 300 - arg1 * 3, 30);
			local68.setFont(this.bf);
			local168 = arg0 + " - " + arg1 + "%";
			local68.setColor(this.colourtext);
			local68.drawString(local168, (this.anInt11228 - this.bfm.stringWidth(local168)) / 2, this.anInt11226 / 2 + 4);
			local50.drawImage(this.anImage16, 0, 0, (ImageObserver) null);
		} catch (@Pc(200) Exception local200) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt11228, this.anInt11226);
			local50.setColor(this.aColor2);
			local90 = this.anInt11228 / 2 - 152;
			local97 = this.anInt11226 / 2 - 18;
			local50.drawRect(local90, local97, 303, 33);
			local50.setColor(this.aColor3);
			local50.fillRect(local90 + 2, local97 + 2, arg1 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local90 + 1, local97 + 1, 301, 31);
			local50.fillRect(arg1 * 3 + local90 + 2, local97 + 2, 300 - arg1 * 3, 30);
			local50.setFont(this.bf);
			local168 = arg0 + " - " + arg1 + "%";
			local50.setColor(this.colourtext);
			local50.drawString(local168, (this.anInt11228 - this.bfm.stringWidth(local168)) / 2, this.anInt11226 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9531(@OriginalArg(1) String arg0) {
		if (this.aBoolean792) {
			return;
		}
		this.aBoolean792 = true;
		try {
			if (aString140 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString140 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IBI)Z")
	private boolean method9532(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Class402.aClass404Array1[anInt11225] == null || this.aBoolean793 ? this.method9530(arg0, arg1) : this.method9535(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;I)[B")
	private byte[] method9533(@OriginalArg(0) Class403 arg0) {
		@Pc(12) File local12;
		try {
			local12 = Class401.method9521(arg0.aString128);
		} catch (@Pc(14) Exception local14) {
			this.method9531("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method9540(local12);
		if (!this.method9537(local25, arg0)) {
			local25 = this.method9536(arg0, false);
			if (local25 == null) {
				local25 = this.method9536(arg0, true);
			}
			if (local25 == null) {
				this.method9531("download");
				return null;
			}
			if (!this.method9529(local12, local25)) {
				return null;
			}
			local25 = this.method9540(local12);
			if (!this.method9537(local25, arg0)) {
				this.method9531("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9534(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt11226 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;I)Z")
	private boolean method9535(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt11228, this.anInt11226);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage16 == null) {
				this.anImage16 = this.createImage(this.anInt11228, this.anInt11226);
			}
			@Pc(52) Graphics local52 = this.anImage16.getGraphics();
			@Pc(57) int local57 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(62) int local62 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(67) int local67 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(72) int local72 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(77) int local77 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(82) int local82 = this.bodyFill.getHeight((ImageObserver) null);
			local52.drawImage(this.bodyLeft, this.method9538(local57) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9534(local72) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(126) int local126 = this.lb.boxXOffset + local57 - this.lb.boxWidth / 2;
			@Pc(136) int local136 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(138) int local138;
			for (local138 = local126; local138 <= local136; local138 += local67) {
				local52.drawImage(this.bodyFill, this.method9538(local57) + this.lb.boxXOffset + local138, this.method9534(local82) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local52.drawImage(this.bodyRight, this.method9538(local62) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9534(local77) + this.lb.boxYOffset, (ImageObserver) null);
			local138 = this.left.getWidth((ImageObserver) null);
			@Pc(216) int local216 = this.left.getHeight((ImageObserver) null);
			@Pc(221) int local221 = this.right.getWidth((ImageObserver) null);
			@Pc(226) int local226 = this.right.getHeight((ImageObserver) null);
			@Pc(231) int local231 = this.bottom.getHeight((ImageObserver) null);
			@Pc(236) int local236 = this.top.getWidth((ImageObserver) null);
			@Pc(241) int local241 = this.top.getHeight((ImageObserver) null);
			@Pc(246) int local246 = this.bottom.getWidth((ImageObserver) null);
			@Pc(251) int local251 = this.bar.getWidth((ImageObserver) null);
			@Pc(256) int local256 = this.background.getWidth((ImageObserver) null);
			@Pc(267) int local267 = this.method9538(this.lb.width) + this.lb.xOffset;
			@Pc(278) int local278 = this.method9534(this.lb.height) + this.lb.yOffset;
			local52.drawImage(this.left, local267, (this.lb.height - local216) / 2 + local278, (ImageObserver) null);
			local52.drawImage(this.right, this.lb.width + local267 - local221, (this.lb.height + -local226) / 2 + local278, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local221 - local138, this.lb.height);
			}
			@Pc(342) Graphics local342 = this.barBuf.getGraphics();
			@Pc(344) int local344;
			for (local344 = 0; local344 < this.lb.width - local138 - local221; local344 += local236) {
				local342.drawImage(this.top, local344, 0, (ImageObserver) null);
			}
			for (local344 = 0; local344 < this.lb.width - local138 - local221; local344 += local246) {
				local342.drawImage(this.bottom, local344, this.lb.height - local231, (ImageObserver) null);
			}
			local344 = arg0 * (this.lb.width - local138 - local221) / 100;
			if (local344 > 0) {
				@Pc(435) Image local435 = this.createImage(local344, this.lb.height - local231 - local241);
				@Pc(439) int local439 = local435.getWidth((ImageObserver) null);
				@Pc(442) Graphics local442 = local435.getGraphics();
				for (@Pc(446) int local446 = arg2 - local251; local446 < local439; local446 += local251) {
					local442.drawImage(this.bar, local446, 0, (ImageObserver) null);
				}
				local342.drawImage(local435, 0, local241, (ImageObserver) null);
			}
			@Pc(476) int local476 = local344;
			local344 = this.lb.width - local344 - local221 - local138;
			if (local344 > 0) {
				@Pc(507) Image local507 = this.createImage(local344, this.lb.height - local231 - local241);
				@Pc(511) int local511 = local507.getWidth((ImageObserver) null);
				@Pc(514) Graphics local514 = local507.getGraphics();
				for (@Pc(516) int local516 = 0; local516 < local511; local516 += local256) {
					local514.drawImage(this.background, local516, 0, (ImageObserver) null);
				}
				local342.drawImage(local507, local476, local241, (ImageObserver) null);
			}
			local52.drawImage(this.barBuf, local138 + local267, local278, (ImageObserver) null);
			local52.setFont(this.bf);
			local52.setColor(this.colourtext);
			@Pc(575) String local575 = arg1 + " - " + arg0 + "%";
			local52.drawString(local575, (this.lb.width - this.bfm.stringWidth(local575)) / 2 + local267, this.lb.textYOffset + local278 + this.lb.height / 2 + 4);
			local33.drawImage(this.anImage16, 0, 0, (ImageObserver) null);
		} catch (@Pc(614) Exception local614) {
			this.method9541();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;IZ)[B")
	private byte[] method9536(@OriginalArg(0) Class403 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt11222];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(32) InputStream local32;
			if (arg1) {
				@Pc(37) URL local37 = this.getCodeBase();
				@Pc(45) Socket local45 = new Socket(InetAddress.getByName(local37.getHost()), 443);
				local45.setSoTimeout(10000);
				@Pc(51) OutputStream local51 = local45.getOutputStream();
				local51.write(17);
				local51.write(("JAGGRAB " + local37.getFile() + arg0.aString129 + "\n\n").getBytes());
				local32 = local45.getInputStream();
			} else {
				local32 = (new URL(this.getCodeBase(), arg0.aString129)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			@Pc(80) int local80 = 0;
			while (true) {
				if (local78 < local5.length) {
					@Pc(97) int local97 = local5.length - local78;
					if (local97 > 1000) {
						local97 = 1000;
					}
					@Pc(110) int local110 = local32.read(local5, local78, local97);
					if (local110 >= 0) {
						local78 += local110;
						@Pc(131) int local131 = local78 * 100 / local5.length;
						@Pc(133) int local133 = 0;
						if (this.lb != null && this.bar != null) {
							local133 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local131 != local76 || local80 != local133) {
							try {
								if (this.method9532(arg0.aStringArray53[this.anInt11227], local131, local133)) {
									local76 = local131;
									local80 = local133;
								}
							} catch (@Pc(185) Exception local185) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local32.close();
				if (arg0.anInt11221 != arg0.anInt11222) {
					@Pc(203) byte[] local203 = new byte[arg0.anInt11221];
					@Pc(208) Inflater local208 = new Inflater(true);
					local208.setInput(local5);
					local208.inflate(local203);
					local5 = local203;
				}
				break;
			}
		} catch (@Pc(219) Exception local219) {
			return null;
		}
		return this.method9537(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean790 = true;
		this.aBoolean789 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!g;B)Z")
	private boolean method9537(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class403 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(30) int local30 = 0; local30 < 20; local30++) {
				if (arg1.anIntArray609[local30] != local17[local30]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(52) Exception local52) {
			this.method9531("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9538(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt11228 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9539() {
		this.anImage16 = null;
		this.barBuf = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method9540(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(18) int local18 = (int) arg0.length();
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(32) byte[] local32 = new byte[local18];
			local29.readFully(local32, 0, local18);
			local29.close();
			return local32;
		} catch (@Pc(42) IOException local42) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9541() {
		this.bf = null;
		this.aBoolean793 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method9542(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(32) Exception local32) {
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
		this.aBoolean791 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}
}
