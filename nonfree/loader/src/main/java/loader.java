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
	private static String aString149;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString150;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt11302 = 0;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt11301;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean972;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt11303;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class410 lb;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean975 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt11304 = 0;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean976 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean974 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean973 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9894(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(42) Exception local42) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean976 = this.aBoolean975 = false;
		this.aBoolean973 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZIILjava/lang/String;)Z")
	private boolean method9895(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt11301, this.anInt11303);
			this.canvas.setVisible(true);
		}
		@Pc(39) Graphics local39 = this.canvas.getGraphics();
		if (local39 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11301, this.anInt11303);
			}
			@Pc(57) Graphics local57 = this.anImage14.getGraphics();
			@Pc(62) int local62 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(67) int local67 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(72) int local72 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(77) int local77 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(82) int local82 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(87) int local87 = this.bodyFill.getHeight((ImageObserver) null);
			local57.drawImage(this.bodyLeft, this.method9903(local62) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9901(local77) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(131) int local131 = this.lb.boxXOffset + local62 - this.lb.boxWidth / 2;
			@Pc(141) int local141 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(143) int local143;
			for (local143 = local131; local143 <= local141; local143 += local72) {
				local57.drawImage(this.bodyFill, local143 + this.method9903(local62) + this.lb.boxXOffset, this.method9901(local87) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local57.drawImage(this.bodyRight, this.method9903(local67) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9901(local82) + this.lb.boxYOffset, (ImageObserver) null);
			local143 = this.left.getWidth((ImageObserver) null);
			@Pc(219) int local219 = this.left.getHeight((ImageObserver) null);
			@Pc(224) int local224 = this.right.getWidth((ImageObserver) null);
			@Pc(229) int local229 = this.right.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.bottom.getHeight((ImageObserver) null);
			@Pc(239) int local239 = this.top.getWidth((ImageObserver) null);
			@Pc(244) int local244 = this.top.getHeight((ImageObserver) null);
			@Pc(249) int local249 = this.bottom.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.bar.getWidth((ImageObserver) null);
			@Pc(259) int local259 = this.background.getWidth((ImageObserver) null);
			@Pc(270) int local270 = this.method9903(this.lb.width) + this.lb.xOffset;
			@Pc(281) int local281 = this.method9901(this.lb.height) + this.lb.yOffset;
			local57.drawImage(this.left, local270, local281 + (this.lb.height - local219) / 2, (ImageObserver) null);
			local57.drawImage(this.right, this.lb.width + local270 - local224, local281 + (-local229 + this.lb.height) / 2, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local143 - local224, this.lb.height);
			}
			@Pc(345) Graphics local345 = this.barBuf.getGraphics();
			@Pc(347) int local347;
			for (local347 = 0; local347 < this.lb.width - local224 - local143; local347 += local239) {
				local345.drawImage(this.top, local347, 0, (ImageObserver) null);
			}
			for (local347 = 0; local347 < this.lb.width - local224 - local143; local347 += local249) {
				local345.drawImage(this.bottom, local347, this.lb.height - local234, (ImageObserver) null);
			}
			local347 = (this.lb.width - local224 - local143) * arg0 / 100;
			if (local347 > 0) {
				@Pc(440) Image local440 = this.createImage(local347, this.lb.height - local244 - local234);
				@Pc(444) int local444 = local440.getWidth((ImageObserver) null);
				@Pc(447) Graphics local447 = local440.getGraphics();
				for (@Pc(451) int local451 = arg1 - local254; local451 < local444; local451 += local254) {
					local447.drawImage(this.bar, local451, 0, (ImageObserver) null);
				}
				local345.drawImage(local440, 0, local244, (ImageObserver) null);
			}
			@Pc(477) int local477 = local347;
			local347 = this.lb.width - local143 - local224 - local347;
			if (local347 > 0) {
				@Pc(506) Image local506 = this.createImage(local347, this.lb.height - local234 - local244);
				@Pc(510) int local510 = local506.getWidth((ImageObserver) null);
				@Pc(513) Graphics local513 = local506.getGraphics();
				for (@Pc(515) int local515 = 0; local515 < local510; local515 += local259) {
					local513.drawImage(this.background, local515, 0, (ImageObserver) null);
				}
				local345.drawImage(local506, local477, local244, (ImageObserver) null);
			}
			local57.drawImage(this.barBuf, local270 + local143, local281, (ImageObserver) null);
			local57.setFont(this.bf);
			local57.setColor(this.colourtext);
			@Pc(575) String local575 = arg2 + " - " + arg0 + "%";
			local57.drawString(local575, local270 + (this.lb.width - this.bfm.stringWidth(local575)) / 2, this.lb.textYOffset + 4 + local281 + this.lb.height / 2);
			local39.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(614) Exception local614) {
			this.method9902();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZI)[B")
	private byte[] method9896(@OriginalArg(0) Class412 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt11298];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(60) InputStream local60;
			if (arg1) {
				@Pc(23) URL local23 = this.getCodeBase();
				@Pc(31) Socket local31 = new Socket(InetAddress.getByName(local23.getHost()), 443);
				local31.setSoTimeout(10000);
				@Pc(37) OutputStream local37 = local31.getOutputStream();
				local37.write(17);
				local37.write(("JAGGRAB " + local23.getFile() + arg0.aString144 + "\n\n").getBytes());
				local60 = local31.getInputStream();
			} else {
				local60 = (new URL(this.getCodeBase(), arg0.aString144)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			@Pc(77) int local77 = 0;
			while (true) {
				if (local5.length > local75) {
					@Pc(87) int local87 = local5.length - local75;
					if (local87 > 1000) {
						local87 = 1000;
					}
					@Pc(98) int local98 = local60.read(local5, local75, local87);
					if (local98 >= 0) {
						local75 += local98;
						@Pc(119) int local119 = local75 * 100 / local5.length;
						@Pc(121) int local121 = 0;
						if (this.lb != null && this.bar != null) {
							local121 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local73 != local119 || local121 != local77) {
							try {
								if (this.method9904(local121, local119, arg0.aStringArray46[this.anInt11304])) {
									local73 = local119;
									local77 = local121;
								}
							} catch (@Pc(172) Exception local172) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local60.close();
				if (arg0.anInt11298 != arg0.anInt11297) {
					@Pc(190) byte[] local190 = new byte[arg0.anInt11297];
					@Pc(195) Inflater local195 = new Inflater(true);
					local195.setInput(local5);
					local195.inflate(local190);
					local5 = local190;
				}
				break;
			}
		} catch (@Pc(206) Exception local206) {
			return null;
		}
		return this.method9898(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean973 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method9897(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class411.anIntArray769[anInt11302]);
			this.aColor2 = new Color(Class411.anIntArray770[anInt11302]);
			this.colourtext = new Color(Class411.anIntArray768[anInt11302]);
		}
		@Pc(55) Graphics local55 = this.getGraphics();
		if (local55 == null) {
			this.repaint();
			return false;
		}
		@Pc(100) int local100;
		@Pc(107) int local107;
		@Pc(174) String local174;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11301, this.anInt11303);
			}
			@Pc(78) Graphics local78 = this.anImage14.getGraphics();
			local78.setColor(Color.black);
			local78.fillRect(0, 0, this.anInt11301, this.anInt11303);
			local78.setColor(this.aColor3);
			local100 = this.anInt11301 / 2 - 152;
			local107 = this.anInt11303 / 2 - 18;
			local78.drawRect(local100, local107, 303, 33);
			local78.setColor(this.aColor2);
			local78.fillRect(local100 + 2, local107 - -2, arg0 * 3, 30);
			local78.setColor(Color.black);
			local78.drawRect(local100 + 1, local107 + 1, 301, 31);
			local78.fillRect(local100 + arg0 * 3 + 2, local107 + 2, 300 - arg0 * 3, 30);
			local174 = arg1 + " - " + arg0 + "%";
			local78.setFont(this.bf);
			local78.setColor(this.colourtext);
			local78.drawString(local174, (this.anInt11301 - this.bfm.stringWidth(local174)) / 2, this.anInt11303 / 2 + 4);
			local55.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(211) Exception local211) {
			local55.setColor(Color.black);
			local55.fillRect(0, 0, this.anInt11301, this.anInt11303);
			local55.setColor(this.aColor3);
			local100 = this.anInt11301 / 2 - 152;
			local107 = this.anInt11303 / 2 - 18;
			local55.drawRect(local100, local107, 303, 33);
			local55.setColor(this.aColor2);
			local55.fillRect(local100 + 2, local107 + 2, arg0 * 3, 30);
			local55.setColor(Color.black);
			local55.drawRect(local100 + 1, local107 + 1, 301, 31);
			local55.fillRect(arg0 * 3 + local100 + 2, local107 + 2, 300 - arg0 * 3, 30);
			local55.setFont(this.bf);
			local174 = arg1 + " - " + arg0 + "%";
			local55.setColor(this.colourtext);
			local55.drawString(local174, (this.anInt11301 - this.bfm.stringWidth(local174)) / 2, this.anInt11303 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!f;)Z")
	private boolean method9898(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class412 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg1.anIntArray771[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(38) Exception local38) {
			this.method9905("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean976 = true;
		this.aBoolean975 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;)[B")
	private byte[] method9899(@OriginalArg(1) Class412 arg0) {
		@Pc(12) File local12;
		try {
			local12 = Class413.method9887(arg0.aString145);
		} catch (@Pc(14) Exception local14) {
			this.method9905("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method9900(local12);
		if (!this.method9898(local25, arg0)) {
			local25 = this.method9896(arg0, false);
			if (local25 == null) {
				local25 = this.method9896(arg0, true);
			}
			if (local25 == null) {
				this.method9905("download");
				return null;
			}
			if (!this.method9906(local12, local25)) {
				return null;
			}
			local25 = this.method9900(local12);
			if (!this.method9898(local25, arg0)) {
				this.method9905("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean975 = true;
		this.aBoolean976 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString149 = this.getParameter("unsignedurl");
			if (aString149 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean974 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString149), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString150 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || local36 >= Class411.aStringArray45.length) {
					local36 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt11302 = Integer.parseInt(local64);
				if (anInt11302 < 0 || anInt11302 >= Class411.anIntArray769.length) {
					anInt11302 = 0;
				}
			}
			this.lb = Class411.aClass410Array1[anInt11302];
			this.anInt11301 = this.getSize().width;
			this.anInt11303 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt11304 = Integer.parseInt(local111);
				}
			} catch (@Pc(120) Exception local120) {
			}
			Class413.method9886(Class411.aStringArray45[local36], local96);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString135, 0, this.lb.anInt11296);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt11295);
					this.bar = this.method9894(this.lb.aString136);
					this.background = this.method9894(this.lb.aString142);
					this.left = this.method9894(this.lb.aString134);
					this.right = this.method9894(this.lb.aString143);
					this.top = this.method9894(this.lb.aString140);
					this.bottom = this.method9894(this.lb.aString141);
					this.bodyLeft = this.method9894(this.lb.aString139);
					this.bodyRight = this.method9894(this.lb.aString137);
					this.bodyFill = this.method9894(this.lb.aString138);
					@Pc(276) Image[] local276 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(281) MediaTracker local281 = new MediaTracker(this);
					for (@Pc(283) int local283 = 0; local283 < local276.length; local283++) {
						local281.addImage(local276[local283], local283);
					}
					while (true) {
						try {
							local281.waitForAll();
							break;
						} catch (@Pc(304) InterruptedException local304) {
						}
					}
				} catch (@Pc(308) Throwable local308) {
					this.method9902();
				}
			}
			@Pc(313) unpack local313 = null;
			@Pc(321) byte[] local321;
			try {
				Class.forName("java.util.jar.Pack200");
				local321 = this.method9899(Class411.aClass412_2);
				if (local321 == null) {
					return;
				}
				local313 = new unpack_Sub1(local321);
			} catch (@Pc(331) Throwable local331) {
			}
			if (local313 == null) {
				local321 = this.method9899(Class411.aClass412_1);
				if (local321 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local321);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method9885(local355.getName(), local355);
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method9899(Class411.aClass412_3);
				if (local370 == null) {
					return;
				}
				local313 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(405) ClassLoader_Sub1 local405 = new ClassLoader_Sub1(local313);
			@Pc(408) Class local408 = Class.forName("Class413");
			local405.method9885(local408.getName(), local408);
			@Pc(418) Class local418 = local405.loadClass("client");
			synchronized (this) {
				if (this.aBoolean973) {
					return;
				}
				this.anApplet3 = (Applet) local418.getDeclaredConstructor().newInstance();
				local418.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean976) {
					this.anApplet3.start();
				}
				if (this.aBoolean975) {
					this.anApplet3.stop();
				}
			}
			this.method9907();
		} catch (@Pc(487) Exception local487) {
			RuntimeException_Sub2.anInt11300 = 667240655;
			if (local487 instanceof InvocationTargetException) {
				@Pc(503) Throwable local503 = ((InvocationTargetException) local487).getTargetException();
				if (local503 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9890(local487.toString(), local503, this);
			} else {
				RuntimeException_Sub2.method9890((String) null, local487, this);
			}
			this.method9905("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method9900(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9901(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt11303 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9902() {
		this.bf = null;
		this.aBoolean972 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9903(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt11301 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;B)Z")
	private boolean method9904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return Class411.aClass410Array1[anInt11302] == null || this.aBoolean972 ? this.method9897(arg1, arg2) : this.method9895(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void method9905(@OriginalArg(0) String arg0) {
		if (this.aBoolean974) {
			return;
		}
		this.aBoolean974 = true;
		try {
			if (aString150 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString150 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BZ)Z")
	private boolean method9906(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(8) FileOutputStream local8 = new FileOutputStream(arg0);
			local8.write(arg1, 0, arg1.length);
			local8.close();
			return true;
		} catch (@Pc(19) IOException local19) {
			this.method9905("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9907() {
		this.anImage14 = null;
		this.barBuf = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}
}
