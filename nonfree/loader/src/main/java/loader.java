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

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString143;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString144;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private static int anInt10906 = 0;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt10904;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt10905;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean827;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!e;")
	private Class396 lb;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt10907 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean829 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean831 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean830 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean828 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9394(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Class398.aClass396Array1[anInt10906] == null || this.aBoolean827 ? this.method9400(arg0, arg2) : this.method9396(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;[BI)Z")
	private boolean method9395(@OriginalArg(0) Class397 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(18) int local18 = 0; local18 < 20; local18++) {
				if (arg0.anIntArray963[local18] != local16[local18]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(51) Exception local51) {
			this.method9406("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean831 = true;
		this.aBoolean830 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method9396(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10905, this.anInt10904);
			this.canvas.setVisible(true);
		}
		@Pc(34) Graphics local34 = this.canvas.getGraphics();
		if (local34 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10905, this.anInt10904);
			}
			@Pc(51) Graphics local51 = this.anImage14.getGraphics();
			@Pc(56) int local56 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(61) int local61 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(66) int local66 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(71) int local71 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(76) int local76 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(81) int local81 = this.bodyFill.getHeight((ImageObserver) null);
			local51.drawImage(this.bodyLeft, this.method9401(local56) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9398(local71) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(125) int local125 = this.lb.boxXOffset + local56 - this.lb.boxWidth / 2;
			@Pc(136) int local136 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(138) int local138;
			for (local138 = local125; local138 <= local136; local138 += local66) {
				local51.drawImage(this.bodyFill, local138 + this.method9401(local56) + this.lb.boxXOffset, this.method9398(local81) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local51.drawImage(this.bodyRight, this.method9401(local61) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9398(local76) - -this.lb.boxYOffset, (ImageObserver) null);
			local138 = this.left.getWidth((ImageObserver) null);
			@Pc(210) int local210 = this.left.getHeight((ImageObserver) null);
			@Pc(215) int local215 = this.right.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.right.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.bottom.getHeight((ImageObserver) null);
			@Pc(230) int local230 = this.top.getWidth((ImageObserver) null);
			@Pc(235) int local235 = this.top.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.bottom.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.bar.getWidth((ImageObserver) null);
			@Pc(250) int local250 = this.background.getWidth((ImageObserver) null);
			@Pc(261) int local261 = this.method9401(this.lb.width) + this.lb.xOffset;
			@Pc(272) int local272 = this.method9398(this.lb.height) + this.lb.yOffset;
			local51.drawImage(this.left, local261, local272 + (this.lb.height - local210) / 2, (ImageObserver) null);
			local51.drawImage(this.right, this.lb.width + local261 - local215, local272 + (this.lb.height + -local220) / 2, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local215 - local138, this.lb.height);
			}
			@Pc(336) Graphics local336 = this.barBuf.getGraphics();
			@Pc(338) int local338;
			for (local338 = 0; local338 < this.lb.width - local215 - local138; local338 += local230) {
				local336.drawImage(this.top, local338, 0, (ImageObserver) null);
			}
			for (local338 = 0; local338 < this.lb.width - local215 - local138; local338 += local240) {
				local336.drawImage(this.bottom, local338, this.lb.height - local225, (ImageObserver) null);
			}
			local338 = arg2 * (this.lb.width - local215 - local138) / 100;
			if (local338 > 0) {
				@Pc(434) Image local434 = this.createImage(local338, this.lb.height - local235 - local225);
				@Pc(438) int local438 = local434.getWidth((ImageObserver) null);
				@Pc(441) Graphics local441 = local434.getGraphics();
				for (@Pc(446) int local446 = arg0 - local245; local446 < local438; local446 += local245) {
					local441.drawImage(this.bar, local446, 0, (ImageObserver) null);
				}
				local336.drawImage(local434, 0, local235, (ImageObserver) null);
			}
			@Pc(476) int local476 = local338;
			local338 = this.lb.width - local215 - local138 - local338;
			if (local338 > 0) {
				@Pc(502) Image local502 = this.createImage(local338, this.lb.height - local225 - local235);
				@Pc(506) int local506 = local502.getWidth((ImageObserver) null);
				@Pc(509) Graphics local509 = local502.getGraphics();
				for (@Pc(511) int local511 = 0; local511 < local506; local511 += local250) {
					local509.drawImage(this.background, local511, 0, (ImageObserver) null);
				}
				local336.drawImage(local502, local476, local235, (ImageObserver) null);
			}
			local51.drawImage(this.barBuf, local261 + local138, local272, (ImageObserver) null);
			local51.setFont(this.bf);
			local51.setColor(this.colourtext);
			@Pc(567) String local567 = arg1 + " - " + arg2 + "%";
			local51.drawString(local567, local261 + (this.lb.width - this.bfm.stringWidth(local567)) / 2, this.lb.textYOffset + 4 + this.lb.height / 2 + local272);
			local34.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(605) Exception local605) {
			this.method9399();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean829 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean830 = true;
		this.aBoolean831 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method9397(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg1);
			local13.write(arg0, 0, arg0.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method9406("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean830 = this.aBoolean831 = false;
		this.aBoolean829 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9398(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10904 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9399() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean827 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	private boolean method9400(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class398.anIntArray965[anInt10906]);
			this.aColor2 = new Color(Class398.anIntArray966[anInt10906]);
			this.colourtext = new Color(Class398.anIntArray964[anInt10906]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(84) int local84;
		@Pc(91) int local91;
		@Pc(158) String local158;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10905, this.anInt10904);
			}
			@Pc(62) Graphics local62 = this.anImage14.getGraphics();
			local62.setColor(Color.black);
			local62.fillRect(0, 0, this.anInt10905, this.anInt10904);
			local62.setColor(this.aColor3);
			local84 = this.anInt10905 / 2 - 152;
			local91 = this.anInt10904 / 2 - 18;
			local62.drawRect(local84, local91, 303, 33);
			local62.setColor(this.aColor2);
			local62.fillRect(local84 + 2, local91 - -2, arg1 * 3, 30);
			local62.setColor(Color.black);
			local62.drawRect(local84 + 1, local91 - -1, 301, 31);
			local62.fillRect(arg1 * 3 + local84 + 2, local91 + 2, 300 - arg1 * 3, 30);
			local158 = arg0 + " - " + arg1 + "%";
			local62.setFont(this.bf);
			local62.setColor(this.colourtext);
			local62.drawString(local158, (this.anInt10905 - this.bfm.stringWidth(local158)) / 2, this.anInt10904 / 2 + 4);
			local44.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(195) Exception local195) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt10905, this.anInt10904);
			local44.setColor(this.aColor3);
			local84 = this.anInt10905 / 2 - 152;
			local91 = this.anInt10904 / 2 - 18;
			local44.drawRect(local84, local91, 303, 33);
			local44.setColor(this.aColor2);
			local44.fillRect(local84 + 2, local91 + 2, arg1 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local84 + 1, local91 + 1, 301, 31);
			local44.fillRect(arg1 * 3 + local84 + 2, local91 + 2, 300 - arg1 * 3, 30);
			local158 = arg0 + " - " + arg1 + "%";
			local44.setFont(this.bf);
			local44.setColor(this.colourtext);
			local44.drawString(local158, (this.anInt10905 - this.bfm.stringWidth(local158)) / 2, this.anInt10904 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZ)I")
	private int method9401(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10905 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!f;I)[B")
	private byte[] method9402(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class397 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10902];
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
				local38.write(("JAGGRAB " + local24.getFile() + arg1.aString142 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg1.aString142)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local5.length > local76) {
					@Pc(87) int local87 = local5.length - local76;
					if (local87 > 1000) {
						local87 = 1000;
					}
					@Pc(101) int local101 = local61.read(local5, local76, local87);
					if (local101 >= 0) {
						local76 += local101;
						@Pc(122) int local122 = local76 * 100 / local5.length;
						@Pc(124) int local124 = 0;
						if (this.lb != null && this.bar != null) {
							local124 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local122 != local74 || local78 != local124) {
							try {
								if (this.method9394(arg1.aStringArray44[this.anInt10907], local124, local122)) {
									local74 = local122;
									local78 = local124;
								}
							} catch (@Pc(169) Exception local169) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local61.close();
				if (arg1.anInt10903 != arg1.anInt10902) {
					@Pc(186) byte[] local186 = new byte[arg1.anInt10903];
					@Pc(191) Inflater local191 = new Inflater(true);
					local191.setInput(local5);
					local191.inflate(local186);
					local5 = local186;
				}
				break;
			}
		} catch (@Pc(202) Exception local202) {
			return null;
		}
		return this.method9395(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9403() {
		this.barBuf = null;
		this.aColor2 = null;
		this.anImage14 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;)[B")
	private byte[] method9404(@OriginalArg(1) Class397 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class399.method9410(arg0.aString141);
		} catch (@Pc(13) Exception local13) {
			this.method9406("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method9407(local4);
		if (!this.method9395(arg0, local24)) {
			local24 = this.method9402(false, arg0);
			if (local24 == null) {
				local24 = this.method9402(true, arg0);
			}
			if (local24 == null) {
				this.method9406("download");
				return null;
			}
			if (!this.method9397(local24, local4)) {
				return null;
			}
			local24 = this.method9407(local4);
			if (!this.method9395(arg0, local24)) {
				this.method9406("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9405(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method9406(@OriginalArg(1) String arg0) {
		if (this.aBoolean828) {
			return;
		}
		this.aBoolean828 = true;
		try {
			if (aString143 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString143 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
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
	private byte[] method9407(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString144 = this.getParameter("unsignedurl");
			if (aString144 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean828 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString144), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString143 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class398.aStringArray45.length) {
					local37 = 0;
				}
			}
			@Pc(66) String local66 = this.getParameter("colourid");
			if (local66 != null) {
				anInt10906 = Integer.parseInt(local66);
				if (anInt10906 < 0 || anInt10906 >= Class398.anIntArray965.length) {
					anInt10906 = 0;
				}
			}
			this.lb = Class398.aClass396Array1[anInt10906];
			this.anInt10905 = this.getSize().width;
			this.anInt10904 = this.getSize().height;
			@Pc(101) int local101 = 32;
			try {
				@Pc(106) int local106 = Integer.parseInt(this.getParameter("modewhat"));
				local101 += local106;
			} catch (@Pc(112) Exception local112) {
			}
			try {
				@Pc(116) String local116 = this.getParameter("lang");
				if (local116 != null) {
					this.anInt10907 = Integer.parseInt(local116);
				}
			} catch (@Pc(126) Exception local126) {
			}
			Class399.method9408(local101, Class398.aStringArray45[local37]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString140, 0, this.lb.anInt10900);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10901);
					this.bar = this.method9405(this.lb.aString134);
					this.background = this.method9405(this.lb.aString133);
					this.left = this.method9405(this.lb.aString136);
					this.right = this.method9405(this.lb.aString131);
					this.top = this.method9405(this.lb.aString132);
					this.bottom = this.method9405(this.lb.aString135);
					this.bodyLeft = this.method9405(this.lb.aString137);
					this.bodyRight = this.method9405(this.lb.aString138);
					this.bodyFill = this.method9405(this.lb.aString139);
					@Pc(281) Image[] local281 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(286) MediaTracker local286 = new MediaTracker(this);
					for (@Pc(288) int local288 = 0; local288 < local281.length; local288++) {
						local286.addImage(local281[local288], local288);
					}
					while (true) {
						try {
							local286.waitForAll();
							break;
						} catch (@Pc(309) InterruptedException local309) {
						}
					}
				} catch (@Pc(313) Throwable local313) {
					this.method9399();
				}
			}
			@Pc(318) unpack local318 = null;
			@Pc(326) byte[] local326;
			try {
				Class.forName("java.util.jar.Pack200");
				local326 = this.method9404(Class398.aClass397_2);
				if (local326 == null) {
					return;
				}
				local318 = new unpack_Sub1(local326);
			} catch (@Pc(336) Throwable local336) {
			}
			if (local318 == null) {
				local326 = this.method9404(Class398.aClass397_1);
				if (local326 == null) {
					return;
				}
				@Pc(353) unpack local353 = new unpack(local326);
				@Pc(358) ClassLoader_Sub1 local358 = new ClassLoader_Sub1(local353);
				@Pc(361) Class local361 = Class.forName("unpack");
				local358.method9385(local361, local361.getName());
				@Pc(371) Class local371 = local358.loadClass("unpackclass");
				@Pc(376) byte[] local376 = this.method9404(Class398.aClass397_3);
				if (local376 == null) {
					return;
				}
				local318 = (unpack) local371.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local376, Boolean.TRUE);
			}
			@Pc(411) ClassLoader_Sub1 local411 = new ClassLoader_Sub1(local318);
			@Pc(414) Class local414 = Class.forName("Class399");
			local411.method9385(local414, local414.getName());
			@Pc(424) Class local424 = local411.loadClass("client");
			synchronized (this) {
				if (this.aBoolean829) {
					return;
				}
				this.anApplet3 = (Applet) local424.getDeclaredConstructor().newInstance();
				local424.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean830) {
					this.anApplet3.start();
				}
				if (this.aBoolean831) {
					this.anApplet3.stop();
				}
			}
			this.method9403();
		} catch (@Pc(493) Exception local493) {
			RuntimeException_Sub2.anInt10899 = -671256955;
			if (local493 instanceof InvocationTargetException) {
				@Pc(502) Throwable local502 = ((InvocationTargetException) local493).getTargetException();
				if (local502 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9389(local493.toString(), local502, this);
			} else {
				RuntimeException_Sub2.method9389((String) null, local493, this);
			}
			this.method9406("crash");
		}
	}
}
