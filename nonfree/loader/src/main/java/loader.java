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

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString145;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/lang/String;")
	private static String aString146;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt10553 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt10551;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean785;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class401 lb;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private int anInt10554;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean786 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean787 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean788 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean789 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt10552 = 0;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString145 = this.getParameter("unsignedurl");
			if (aString145 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean786 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString145), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString146 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class402.aStringArray50.length) {
					local38 = 0;
				}
			}
			@Pc(65) String local65 = this.getParameter("colourid");
			if (local65 != null) {
				anInt10553 = Integer.parseInt(local65);
				if (anInt10553 < 0 || anInt10553 >= Class402.anIntArray702.length) {
					anInt10553 = 0;
				}
			}
			this.lb = Class402.aClass401Array1[anInt10553];
			this.anInt10554 = this.getSize().width;
			this.anInt10551 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt10552 = Integer.parseInt(local115);
				}
			} catch (@Pc(124) Exception local124) {
			}
			Class403.method9056(Class402.aStringArray50[local38], local100);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString138, 0, this.lb.anInt10548);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10547);
					this.bar = this.method9071(this.lb.aString141);
					this.background = this.method9071(this.lb.aString136);
					this.left = this.method9071(this.lb.aString137);
					this.right = this.method9071(this.lb.aString134);
					this.top = this.method9071(this.lb.aString140);
					this.bottom = this.method9071(this.lb.aString135);
					this.bodyLeft = this.method9071(this.lb.aString132);
					this.bodyRight = this.method9071(this.lb.aString133);
					this.bodyFill = this.method9071(this.lb.aString139);
					@Pc(280) Image[] local280 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(285) MediaTracker local285 = new MediaTracker(this);
					for (@Pc(287) int local287 = 0; local287 < local280.length; local287++) {
						local285.addImage(local280[local287], local287);
					}
					while (true) {
						try {
							local285.waitForAll();
							break;
						} catch (@Pc(308) InterruptedException local308) {
						}
					}
				} catch (@Pc(312) Throwable local312) {
					this.method9075();
				}
			}
			@Pc(317) unpack local317 = null;
			@Pc(325) byte[] local325;
			try {
				Class.forName("java.util.jar.Pack200");
				local325 = this.method9077(Class402.aClass400_2);
				if (local325 == null) {
					return;
				}
				local317 = new unpack_Sub1(local325);
			} catch (@Pc(337) Throwable local337) {
			}
			if (local317 == null) {
				local325 = this.method9077(Class402.aClass400_1);
				if (local325 == null) {
					return;
				}
				@Pc(354) unpack local354 = new unpack(local325);
				@Pc(359) ClassLoader_Sub1 local359 = new ClassLoader_Sub1(local354);
				@Pc(362) Class local362 = Class.forName("unpack");
				local359.method9054(local362.getName(), local362);
				@Pc(372) Class local372 = local359.loadClass("unpackclass");
				@Pc(377) byte[] local377 = this.method9077(Class402.aClass400_3);
				if (local377 == null) {
					return;
				}
				local317 = (unpack) local372.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local377, Boolean.TRUE);
			}
			@Pc(412) ClassLoader_Sub1 local412 = new ClassLoader_Sub1(local317);
			@Pc(415) Class local415 = Class.forName("Class403");
			local412.method9054(local415.getName(), local415);
			@Pc(425) Class local425 = local412.loadClass("client");
			synchronized (this) {
				if (this.aBoolean789) {
					return;
				}
				this.anApplet3 = (Applet) local425.getDeclaredConstructor().newInstance();
				local425.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean788) {
					this.anApplet3.start();
				}
				if (this.aBoolean787) {
					this.anApplet3.stop();
				}
			}
			this.method9070();
		} catch (@Pc(494) Exception local494) {
			RuntimeException_Sub2.anInt10550 = -998602398;
			if (local494 instanceof InvocationTargetException) {
				@Pc(510) Throwable local510 = ((InvocationTargetException) local494).getTargetException();
				if (local510 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9061(local494.toString(), this, local510);
			} else {
				RuntimeException_Sub2.method9061((String) null, this, local494);
			}
			this.method9076("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;II)Z")
	private boolean method9066(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10554, this.anInt10551);
			this.canvas.setVisible(true);
		}
		@Pc(40) Graphics local40 = this.canvas.getGraphics();
		if (local40 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage15 == null) {
				this.anImage15 = this.createImage(this.anInt10554, this.anInt10551);
			}
			@Pc(58) Graphics local58 = this.anImage15.getGraphics();
			@Pc(63) int local63 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(68) int local68 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(73) int local73 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(78) int local78 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(83) int local83 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(88) int local88 = this.bodyFill.getHeight((ImageObserver) null);
			local58.drawImage(this.bodyLeft, this.method9069(local63) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9079(local78) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(130) int local130 = local63 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(140) int local140 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(142) int local142;
			for (local142 = local130; local142 <= local140; local142 += local73) {
				local58.drawImage(this.bodyFill, local142 + this.method9069(local63) + this.lb.boxXOffset, this.method9079(local88) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local58.drawImage(this.bodyRight, this.method9069(local68) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9079(local83) + this.lb.boxYOffset, (ImageObserver) null);
			local142 = this.left.getWidth((ImageObserver) null);
			@Pc(218) int local218 = this.left.getHeight((ImageObserver) null);
			@Pc(223) int local223 = this.right.getWidth((ImageObserver) null);
			@Pc(228) int local228 = this.right.getHeight((ImageObserver) null);
			@Pc(233) int local233 = this.bottom.getHeight((ImageObserver) null);
			@Pc(238) int local238 = this.top.getWidth((ImageObserver) null);
			@Pc(243) int local243 = this.top.getHeight((ImageObserver) null);
			@Pc(248) int local248 = this.bottom.getWidth((ImageObserver) null);
			@Pc(253) int local253 = this.bar.getWidth((ImageObserver) null);
			@Pc(258) int local258 = this.background.getWidth((ImageObserver) null);
			@Pc(270) int local270 = this.method9069(this.lb.width) + this.lb.xOffset;
			@Pc(281) int local281 = this.method9079(this.lb.height) + this.lb.yOffset;
			local58.drawImage(this.left, local270, (this.lb.height - local218) / 2 + local281, (ImageObserver) null);
			local58.drawImage(this.right, this.lb.width + local270 - local223, (this.lb.height - local228) / 2 + local281, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local142 - local223, this.lb.height);
			}
			@Pc(344) Graphics local344 = this.barBuf.getGraphics();
			@Pc(346) int local346;
			for (local346 = 0; local346 < this.lb.width - local142 - local223; local346 += local238) {
				local344.drawImage(this.top, local346, 0, (ImageObserver) null);
			}
			for (local346 = 0; local346 < this.lb.width - local142 - local223; local346 += local248) {
				local344.drawImage(this.bottom, local346, this.lb.height - local233, (ImageObserver) null);
			}
			local346 = arg1 * (this.lb.width - local223 - local142) / 100;
			if (local346 > 0) {
				@Pc(442) Image local442 = this.createImage(local346, this.lb.height - local233 - local243);
				@Pc(446) int local446 = local442.getWidth((ImageObserver) null);
				@Pc(449) Graphics local449 = local442.getGraphics();
				for (@Pc(454) int local454 = arg2 - local253; local454 < local446; local454 += local253) {
					local449.drawImage(this.bar, local454, 0, (ImageObserver) null);
				}
				local344.drawImage(local442, 0, local243, (ImageObserver) null);
			}
			@Pc(480) int local480 = local346;
			local346 = this.lb.width - local142 - local223 - local346;
			if (local346 > 0) {
				@Pc(508) Image local508 = this.createImage(local346, this.lb.height - local233 - local243);
				@Pc(512) int local512 = local508.getWidth((ImageObserver) null);
				@Pc(515) Graphics local515 = local508.getGraphics();
				for (@Pc(517) int local517 = 0; local517 < local512; local517 += local258) {
					local515.drawImage(this.background, local517, 0, (ImageObserver) null);
				}
				local344.drawImage(local508, local480, local243, (ImageObserver) null);
			}
			local58.drawImage(this.barBuf, local142 + local270, local281, (ImageObserver) null);
			local58.setFont(this.bf);
			local58.setColor(this.colourtext);
			@Pc(572) String local572 = arg0 + " - " + arg1 + "%";
			local58.drawString(local572, (this.lb.width - this.bfm.stringWidth(local572)) / 2 + local270, this.lb.textYOffset + local281 + this.lb.height / 2 - -4);
			local40.drawImage(this.anImage15, 0, 0, (ImageObserver) null);
		} catch (@Pc(610) Exception local610) {
			this.method9075();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method9067(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	private boolean method9068(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class402.anIntArray702[anInt10553]);
			this.aColor2 = new Color(Class402.anIntArray701[anInt10553]);
			this.colourtext = new Color(Class402.anIntArray703[anInt10553]);
		}
		@Pc(48) Graphics local48 = this.getGraphics();
		if (local48 == null) {
			this.repaint();
			return false;
		}
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(165) String local165;
		try {
			if (this.anImage15 == null) {
				this.anImage15 = this.createImage(this.anInt10554, this.anInt10551);
			}
			@Pc(70) Graphics local70 = this.anImage15.getGraphics();
			local70.setColor(Color.black);
			local70.fillRect(0, 0, this.anInt10554, this.anInt10551);
			local70.setColor(this.aColor3);
			local92 = this.anInt10554 / 2 - 152;
			local99 = this.anInt10551 / 2 - 18;
			local70.drawRect(local92, local99, 303, 33);
			local70.setColor(this.aColor2);
			local70.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local70.setColor(Color.black);
			local70.drawRect(local92 + 1, local99 + 1, 301, 31);
			local70.fillRect(arg0 * 3 + local92 + 2, local99 - -2, 300 - arg0 * 3, 30);
			local165 = arg1 + " - " + arg0 + "%";
			local70.setFont(this.bf);
			local70.setColor(this.colourtext);
			local70.drawString(local165, (this.anInt10554 - this.bfm.stringWidth(local165)) / 2, this.anInt10551 / 2 + 4);
			local48.drawImage(this.anImage15, 0, 0, (ImageObserver) null);
		} catch (@Pc(201) Exception local201) {
			local48.setColor(Color.black);
			local48.fillRect(0, 0, this.anInt10554, this.anInt10551);
			local48.setColor(this.aColor3);
			local92 = this.anInt10554 / 2 - 152;
			local99 = this.anInt10551 / 2 - 18;
			local48.drawRect(local92, local99, 303, 33);
			local48.setColor(this.aColor2);
			local48.fillRect(local92 + 2, local99 - -2, arg0 * 3, 30);
			local48.setColor(Color.black);
			local48.drawRect(local92 + 1, local99 + 1, 301, 31);
			local48.fillRect(local92 + arg0 * 3 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local48.setFont(this.bf);
			local165 = arg1 + " - " + arg0 + "%";
			local48.setColor(this.colourtext);
			local48.drawString(local165, (this.anInt10554 - this.bfm.stringWidth(local165)) / 2, this.anInt10551 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9069(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10554 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean788 = this.aBoolean787 = false;
		this.aBoolean789 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9070() {
		this.aColor3 = null;
		this.aColor2 = null;
		this.barBuf = null;
		this.anImage15 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)Ljava/awt/Image;")
	private Image method9071(@OriginalArg(1) String arg0) throws IOException {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!b;)[B")
	private byte[] method9072(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class400 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10545];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(62) InputStream local62;
			if (arg0) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg1.aString130 + "\n\n").getBytes());
				local62 = local33.getInputStream();
			} else {
				local62 = (new URL(this.getCodeBase(), arg1.aString130)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local5.length > local84) {
					@Pc(95) int local95 = local5.length - local84;
					if (local95 > 1000) {
						local95 = 1000;
					}
					@Pc(107) int local107 = local62.read(local5, local84, local95);
					if (local107 >= 0) {
						local84 += local107;
						@Pc(128) int local128 = local84 * 100 / local5.length;
						@Pc(130) int local130 = 0;
						if (this.lb != null && this.bar != null) {
							local130 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local128 != local75 || local86 != local130) {
							try {
								if (this.method9073(arg1.aStringArray49[this.anInt10552], local128, local130)) {
									local75 = local128;
									local86 = local130;
								}
							} catch (@Pc(179) Exception local179) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local62.close();
				if (arg1.anInt10546 != arg1.anInt10545) {
					@Pc(193) byte[] local193 = new byte[arg1.anInt10546];
					@Pc(198) Inflater local198 = new Inflater(true);
					local198.setInput(local5);
					local5 = local193;
					local198.inflate(local193);
				}
				break;
			}
		} catch (@Pc(209) Exception local209) {
			return null;
		}
		return this.method9078(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean787 = false;
		this.aBoolean788 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9073(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Class402.aClass401Array1[anInt10553] == null || this.aBoolean785 ? this.method9068(arg1, arg0) : this.method9066(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method9074(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method9076("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9075() {
		this.aBoolean785 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean789 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9076(@OriginalArg(1) String arg0) {
		if (this.aBoolean786) {
			return;
		}
		this.aBoolean786 = true;
		try {
			if (aString146 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString146 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;I)[B")
	private byte[] method9077(@OriginalArg(0) Class400 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class403.method9057(arg0.aString131);
		} catch (@Pc(6) Exception local6) {
			this.method9076("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method9067(local4);
		if (!this.method9078(arg0, local25)) {
			local25 = this.method9072(false, arg0);
			if (local25 == null) {
				local25 = this.method9072(true, arg0);
			}
			if (local25 == null) {
				this.method9076("download");
				return null;
			}
			if (!this.method9074(local4, local25)) {
				return null;
			}
			local25 = this.method9067(local4);
			if (!this.method9078(arg0, local25)) {
				this.method9076("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;Z[B)Z")
	private boolean method9078(@OriginalArg(0) Class400 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (arg0.anIntArray700[local26] != local17[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method9076("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9079(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10551 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean788 = false;
		this.aBoolean787 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
