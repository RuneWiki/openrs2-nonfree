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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString117;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private static int anInt9675 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!e;")
	private Class369 lb;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt9672;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt9673;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean761;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean760 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean762 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt9674 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean759 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean763 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;ZB)[B")
	private byte[] method7893(@OriginalArg(0) Class370 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt9669];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(68) InputStream local68;
			if (arg1) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg0.aString113 + "\n\n").getBytes());
				local68 = local39.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg0.aString113)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local5.length <= local83) {
					local68.close();
					if (arg0.anInt9669 != arg0.anInt9668) {
						@Pc(195) byte[] local195 = new byte[arg0.anInt9668];
						@Pc(200) Inflater local200 = new Inflater(true);
						local200.setInput(local5);
						local5 = local195;
						local200.inflate(local195);
					}
					break;
				}
				@Pc(98) int local98 = local5.length - local83;
				if (local98 > 1000) {
					local98 = 1000;
				}
				@Pc(110) int local110 = local68.read(local5, local83, local98);
				if (local110 < 0) {
					throw new EOFException();
				}
				local83 += local110;
				@Pc(127) int local127 = local83 * 100 / local5.length;
				@Pc(129) int local129 = 0;
				if (this.lb != null && this.bar != null) {
					local129 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local127 != local81 || local85 != local129) {
					try {
						if (this.method7898(arg0.aStringArray46[this.anInt9674], local129, local127)) {
							local81 = local127;
							local85 = local129;
						}
					} catch (@Pc(178) Exception local178) {
					}
				}
			}
		} catch (@Pc(211) Exception local211) {
			return null;
		}
		return this.method7894(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!g;[B)Z")
	private boolean method7894(@OriginalArg(1) Class370 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(22) byte[] local22 = local8.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local22[local24] != arg0.anIntArray743[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method7903("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method7895(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method7903("savefile");
			return false;
		}
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
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method7896() {
		this.bfm = null;
		this.aBoolean761 = true;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString118 = this.getParameter("unsignedurl");
			if (aString118 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean762 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString118), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString117 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class368.aStringArray45.length) {
					local38 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt9675 = Integer.parseInt(local68);
				if (anInt9675 < 0 || Class368.anIntArray741.length <= anInt9675) {
					anInt9675 = 0;
				}
			}
			this.lb = Class368.aClass369Array1[anInt9675];
			this.anInt9673 = this.getSize().width;
			this.anInt9672 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt9674 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class371.method7887(local99, Class368.aStringArray45[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString106, 0, this.lb.anInt9666);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9667);
					this.bar = this.method7904(this.lb.aString107);
					this.background = this.method7904(this.lb.aString110);
					this.left = this.method7904(this.lb.aString103);
					this.right = this.method7904(this.lb.aString108);
					this.top = this.method7904(this.lb.aString109);
					this.bottom = this.method7904(this.lb.aString104);
					this.bodyLeft = this.method7904(this.lb.aString102);
					this.bodyRight = this.method7904(this.lb.aString105);
					this.bodyFill = this.method7904(this.lb.aString111);
					@Pc(278) Image[] local278 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(283) MediaTracker local283 = new MediaTracker(this);
					for (@Pc(285) int local285 = 0; local285 < local278.length; local285++) {
						local283.addImage(local278[local285], local285);
					}
					while (true) {
						try {
							local283.waitForAll();
							break;
						} catch (@Pc(302) InterruptedException local302) {
						}
					}
				} catch (@Pc(306) Throwable local306) {
					this.method7896();
				}
			}
			@Pc(311) unpack local311 = null;
			@Pc(319) byte[] local319;
			try {
				Class.forName("java.util.jar.Pack200");
				local319 = this.method7902(Class368.aClass370_2);
				if (local319 == null) {
					return;
				}
				local311 = new unpack_Sub1(local319);
			} catch (@Pc(330) Throwable local330) {
			}
			if (local311 == null) {
				local319 = this.method7902(Class368.aClass370_1);
				if (local319 == null) {
					return;
				}
				@Pc(346) unpack local346 = new unpack(local319);
				@Pc(351) ClassLoader_Sub1 local351 = new ClassLoader_Sub1(local346);
				@Pc(354) Class local354 = Class.forName("unpack");
				local351.method7881(local354, local354.getName());
				@Pc(364) Class local364 = local351.loadClass("unpackclass");
				@Pc(369) byte[] local369 = this.method7902(Class368.aClass370_3);
				if (local369 == null) {
					return;
				}
				local311 = (unpack) local364.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local369, Boolean.TRUE);
			}
			@Pc(404) ClassLoader_Sub1 local404 = new ClassLoader_Sub1(local311);
			@Pc(407) Class local407 = Class.forName("Class371");
			local404.method7881(local407, local407.getName());
			@Pc(417) Class local417 = local404.loadClass("client");
			synchronized (this) {
				if (this.aBoolean763) {
					return;
				}
				this.anApplet3 = (Applet) local417.getDeclaredConstructor().newInstance();
				local417.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean760) {
					this.anApplet3.start();
				}
				if (this.aBoolean759) {
					this.anApplet3.stop();
				}
			}
			this.method7900();
		} catch (@Pc(485) Exception local485) {
			RuntimeException_Sub2.anInt9671 = 764584533;
			if (local485 instanceof InvocationTargetException) {
				@Pc(494) Throwable local494 = ((InvocationTargetException) local485).getTargetException();
				if (local494 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7892(local485.toString(), this, local494);
			} else {
				RuntimeException_Sub2.method7892(null, this, local485);
			}
			this.method7903("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7897(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean760 = false;
		this.aBoolean759 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IBI)Z")
	private boolean method7898(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Class368.aClass369Array1[anInt9675] == null || this.aBoolean761 ? this.method7901(arg2, arg0) : this.method7899(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method7899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9673, this.anInt9672);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9673, this.anInt9672);
			}
			@Pc(56) Graphics local56 = this.anImage14.getGraphics();
			@Pc(61) int local61 = this.bodyLeft.getWidth(null);
			@Pc(66) int local66 = this.bodyRight.getWidth(null);
			@Pc(71) int local71 = this.bodyFill.getWidth(null);
			@Pc(76) int local76 = this.bodyLeft.getHeight(null);
			@Pc(81) int local81 = this.bodyRight.getHeight(null);
			@Pc(86) int local86 = this.bodyFill.getHeight(null);
			local56.drawImage(this.bodyLeft, this.lb.boxXOffset + (this.anInt9673 - local61) / 2 - this.lb.boxWidth / 2, (this.anInt9672 + -local76) / 2 + this.lb.boxYOffset, null);
			@Pc(133) int local133 = this.lb.boxXOffset + local61 - this.lb.boxWidth / 2;
			@Pc(146) int local146 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local66;
			@Pc(148) int local148;
			for (local148 = local133; local148 <= local146; local148 += local71) {
				local56.drawImage(this.bodyFill, local148 + (this.anInt9673 - local61) / 2 + this.lb.boxXOffset, this.lb.boxYOffset + (-local86 + this.anInt9672) / 2, null);
			}
			local56.drawImage(this.bodyRight, this.lb.boxXOffset + (this.anInt9673 - local66) / 2 + this.lb.boxWidth / 2, this.lb.boxYOffset + (-local81 + this.anInt9672) / 2, null);
			local148 = this.left.getWidth(null);
			@Pc(236) int local236 = this.left.getHeight(null);
			@Pc(241) int local241 = this.right.getWidth(null);
			@Pc(246) int local246 = this.right.getHeight(null);
			@Pc(251) int local251 = this.bottom.getHeight(null);
			@Pc(256) int local256 = this.top.getWidth(null);
			@Pc(261) int local261 = this.top.getHeight(null);
			@Pc(266) int local266 = this.bottom.getWidth(null);
			@Pc(271) int local271 = this.bar.getWidth(null);
			@Pc(276) int local276 = this.background.getWidth(null);
			@Pc(290) int local290 = this.lb.xOffset + (this.anInt9673 - this.lb.width) / 2;
			@Pc(304) int local304 = this.lb.yOffset + (this.anInt9672 - this.lb.height) / 2;
			local56.drawImage(this.left, local290, (this.lb.height - local236) / 2 + local304, null);
			local56.drawImage(this.right, this.lb.width + local290 - local241, local304 - -((this.lb.height + -local246) / 2), null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local148 - local241, this.lb.height);
			}
			@Pc(370) Graphics local370 = this.barBuf.getGraphics();
			@Pc(372) int local372;
			for (local372 = 0; local372 < this.lb.width - local148 - local241; local372 += local256) {
				local370.drawImage(this.top, local372, 0, null);
			}
			for (local372 = 0; local372 < this.lb.width - local148 - local241; local372 += local266) {
				local370.drawImage(this.bottom, local372, this.lb.height - local251, null);
			}
			local372 = (this.lb.width - local148 - local241) * arg1 / 100;
			if (local372 > 0) {
				@Pc(458) Image local458 = this.createImage(local372, this.lb.height - local251 - local261);
				@Pc(462) int local462 = local458.getWidth(null);
				@Pc(465) Graphics local465 = local458.getGraphics();
				for (@Pc(469) int local469 = arg0 - local271; local469 < local462; local469 += local271) {
					local465.drawImage(this.bar, local469, 0, null);
				}
				local370.drawImage(local458, 0, local261, null);
			}
			@Pc(495) int local495 = local372;
			local372 = this.lb.width - local241 - local148 - local372;
			if (local372 > 0) {
				@Pc(526) Image local526 = this.createImage(local372, this.lb.height - local251 - local261);
				@Pc(530) int local530 = local526.getWidth(null);
				@Pc(533) Graphics local533 = local526.getGraphics();
				for (@Pc(535) int local535 = 0; local535 < local530; local535 += local276) {
					local533.drawImage(this.background, local535, 0, null);
				}
				local370.drawImage(local526, local495, local261, null);
			}
			local56.drawImage(this.barBuf, local290 + local148, local304, null);
			local56.setFont(this.bf);
			local56.setColor(this.colourtext);
			@Pc(591) String local591 = arg2 + " - " + arg1 + "%";
			local56.drawString(local591, local290 + (this.lb.width - this.bfm.stringWidth(local591)) / 2, this.lb.textYOffset + 4 + this.lb.height / 2 + local304);
			local33.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(631) Exception local631) {
			this.method7896();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method7900() {
		this.anImage14 = null;
		this.aColor3 = null;
		this.barBuf = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BILjava/lang/String;)Z")
	private boolean method7901(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class368.anIntArray741[anInt9675]);
			this.aColor2 = new Color(Class368.anIntArray740[anInt9675]);
			this.colourtext = new Color(Class368.anIntArray742[anInt9675]);
		}
		@Pc(53) Graphics local53 = this.getGraphics();
		if (local53 == null) {
			this.repaint();
			return false;
		}
		@Pc(98) int local98;
		@Pc(105) int local105;
		@Pc(172) String local172;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9673, this.anInt9672);
			}
			@Pc(76) Graphics local76 = this.anImage14.getGraphics();
			local76.setColor(Color.black);
			local76.fillRect(0, 0, this.anInt9673, this.anInt9672);
			local76.setColor(this.aColor3);
			local98 = this.anInt9673 / 2 - 152;
			local105 = this.anInt9672 / 2 - 18;
			local76.drawRect(local98, local105, 303, 33);
			local76.setColor(this.aColor2);
			local76.fillRect(local98 + 2, local105 + 2, arg0 * 3, 30);
			local76.setColor(Color.black);
			local76.drawRect(local98 + 1, local105 - -1, 301, 31);
			local76.fillRect(arg0 * 3 + local98 + 2, local105 + 2, 300 - arg0 * 3, 30);
			local172 = arg1 + " - " + arg0 + "%";
			local76.setFont(this.bf);
			local76.setColor(this.colourtext);
			local76.drawString(local172, (this.anInt9673 - this.bfm.stringWidth(local172)) / 2, this.anInt9672 / 2 + 4);
			local53.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(208) Exception local208) {
			local53.setColor(Color.black);
			local53.fillRect(0, 0, this.anInt9673, this.anInt9672);
			local53.setColor(this.aColor3);
			local98 = this.anInt9673 / 2 - 152;
			local105 = this.anInt9672 / 2 - 18;
			local53.drawRect(local98, local105, 303, 33);
			local53.setColor(this.aColor2);
			local53.fillRect(local98 + 2, local105 + 2, arg0 * 3, 30);
			local53.setColor(Color.black);
			local53.drawRect(local98 + 1, local105 - -1, 301, 31);
			local53.fillRect(local98 + arg0 * 3 + 2, local105 + 2, 300 - arg0 * 3, 30);
			local172 = arg1 + " - " + arg0 + "%";
			local53.setFont(this.bf);
			local53.setColor(this.colourtext);
			local53.drawString(local172, (this.anInt9673 - this.bfm.stringWidth(local172)) / 2, this.anInt9672 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean760 = true;
		this.aBoolean759 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean760 = this.aBoolean759 = false;
		this.aBoolean763 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!g;)[B")
	private byte[] method7902(@OriginalArg(1) Class370 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class371.method7885(arg0.aString112);
		} catch (@Pc(6) Exception local6) {
			this.method7903("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method7897(local4);
		if (!this.method7894(arg0, local17)) {
			local17 = this.method7893(arg0, false);
			if (local17 == null) {
				local17 = this.method7893(arg0, true);
			}
			if (local17 == null) {
				this.method7903("download");
				return null;
			}
			if (!this.method7895(local17, local4)) {
				return null;
			}
			local17 = this.method7897(local4);
			if (!this.method7894(arg0, local17)) {
				this.method7903("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7903(@OriginalArg(1) String arg0) {
		if (this.aBoolean762) {
			return;
		}
		this.aBoolean762 = true;
		try {
			if (aString117 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString117 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method7904(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(13) InputStream local13 = this.getClass().getResourceAsStream(arg0);
			@Pc(16) byte[] local16 = new byte[1000];
			@Pc(18) int local18 = 0;
			@Pc(23) int local23;
			while ((local23 = local13.read()) != -1) {
				local16[local18++] = (byte) local23;
			}
			return Toolkit.getDefaultToolkit().createImage(local16);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}
}
