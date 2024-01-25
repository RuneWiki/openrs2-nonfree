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
	private static String aString132;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString133;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt10966 = 0;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!b;")
	private Class395 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean761;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10967;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt10969;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean762 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean763 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt10968 = 0;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean764 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean765 = false;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;)[B")
	private byte[] method9050(@OriginalArg(1) Class396 arg0) {
		@Pc(10) File local10;
		try {
			local10 = Class398.method9066(arg0.aString131);
		} catch (@Pc(12) Exception local12) {
			this.method9055("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method9061(local10);
		if (!this.method9054(local23, arg0)) {
			local23 = this.method9060(arg0, false);
			if (local23 == null) {
				local23 = this.method9060(arg0, true);
			}
			if (local23 == null) {
				this.method9055("download");
				return null;
			}
			if (!this.method9056(local23, local10)) {
				return null;
			}
			local23 = this.method9061(local10);
			if (!this.method9054(local23, arg0)) {
				this.method9055("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZILjava/lang/String;)Z")
	private boolean method9051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class397.aClass395Array1[anInt10966] == null || this.aBoolean761 ? this.method9053(arg0, arg2) : this.method9062(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9052(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10969 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	private boolean method9053(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class397.anIntArray635[anInt10966]);
			this.aColor3 = new Color(Class397.anIntArray636[anInt10966]);
			this.colourtext = new Color(Class397.anIntArray634[anInt10966]);
		}
		@Pc(48) Graphics local48 = this.getGraphics();
		if (local48 == null) {
			this.repaint();
			return false;
		}
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(169) String local169;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10969, this.anInt10967);
			}
			@Pc(70) Graphics local70 = this.anImage14.getGraphics();
			local70.setColor(Color.black);
			local70.fillRect(0, 0, this.anInt10969, this.anInt10967);
			local70.setColor(this.aColor2);
			local92 = this.anInt10969 / 2 - 152;
			local99 = this.anInt10967 / 2 - 18;
			local70.drawRect(local92, local99, 303, 33);
			local70.setColor(this.aColor3);
			local70.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local70.setColor(Color.black);
			local70.drawRect(local92 + 1, local99 - -1, 301, 31);
			local70.fillRect(arg0 * 3 + local92 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local70.setFont(this.bf);
			local169 = arg1 + " - " + arg0 + "%";
			local70.setColor(this.colourtext);
			local70.drawString(local169, (this.anInt10969 - this.bfm.stringWidth(local169)) / 2, this.anInt10967 / 2 + 4);
			local48.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(201) Exception local201) {
			local48.setColor(Color.black);
			local48.fillRect(0, 0, this.anInt10969, this.anInt10967);
			local48.setColor(this.aColor2);
			local92 = this.anInt10969 / 2 - 152;
			local99 = this.anInt10967 / 2 - 18;
			local48.drawRect(local92, local99, 303, 33);
			local48.setColor(this.aColor3);
			local48.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local48.setColor(Color.black);
			local48.drawRect(local92 + 1, local99 + 1, 301, 31);
			local48.fillRect(local92 + arg0 * 3 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local169 = arg1 + " - " + arg0 + "%";
			local48.setFont(this.bf);
			local48.setColor(this.colourtext);
			local48.drawString(local169, (this.anInt10969 - this.bfm.stringWidth(local169)) / 2, this.anInt10967 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean765 = this.aBoolean762 = false;
		this.aBoolean763 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean762 = true;
		this.aBoolean765 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLloader!d;)Z")
	private boolean method9054(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class396 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(18) MessageDigest local18 = MessageDigest.getInstance("SHA");
			local18.reset();
			local18.update(arg0);
			@Pc(26) byte[] local26 = local18.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (local26[local28] != arg1.anIntArray633[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(51) Exception local51) {
			this.method9055("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method9055(@OriginalArg(1) String arg0) {
		if (this.aBoolean764) {
			return;
		}
		this.aBoolean764 = true;
		try {
			if (aString133 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString133 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method9056(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method9055("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean765 = true;
		this.aBoolean762 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
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
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZI)I")
	private int method9057(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10967 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9058() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor2 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method9059() {
		this.bf = null;
		this.aBoolean761 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString132 = this.getParameter("unsignedurl");
			if (aString132 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean764 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString132), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString133 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class397.aStringArray72.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt10966 = Integer.parseInt(local63);
				if (anInt10966 < 0 || anInt10966 >= Class397.anIntArray635.length) {
					anInt10966 = 0;
				}
			}
			this.lb = Class397.aClass395Array1[anInt10966];
			this.anInt10969 = this.getSize().width;
			this.anInt10967 = this.getSize().height;
			@Pc(94) int local94 = 32;
			try {
				@Pc(99) int local99 = Integer.parseInt(this.getParameter("modewhat"));
				local94 += local99;
			} catch (@Pc(105) Exception local105) {
			}
			try {
				@Pc(109) String local109 = this.getParameter("lang");
				if (local109 != null) {
					this.anInt10968 = Integer.parseInt(local109);
				}
			} catch (@Pc(119) Exception local119) {
			}
			Class398.method9065(Class397.aStringArray72[local36], local94);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString120, 0, this.lb.anInt10961);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10962);
					this.bar = this.method9063(this.lb.aString122);
					this.background = this.method9063(this.lb.aString127);
					this.left = this.method9063(this.lb.aString124);
					this.right = this.method9063(this.lb.aString119);
					this.top = this.method9063(this.lb.aString121);
					this.bottom = this.method9063(this.lb.aString123);
					this.bodyLeft = this.method9063(this.lb.aString128);
					this.bodyRight = this.method9063(this.lb.aString125);
					this.bodyFill = this.method9063(this.lb.aString126);
					@Pc(274) Image[] local274 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(279) MediaTracker local279 = new MediaTracker(this);
					for (@Pc(281) int local281 = 0; local281 < local274.length; local281++) {
						local279.addImage(local274[local281], local281);
					}
					while (true) {
						try {
							local279.waitForAll();
							break;
						} catch (@Pc(298) InterruptedException local298) {
						}
					}
				} catch (@Pc(302) Throwable local302) {
					this.method9059();
				}
			}
			@Pc(307) unpack local307 = null;
			@Pc(315) byte[] local315;
			try {
				Class.forName("java.util.jar.Pack200");
				local315 = this.method9050(Class397.aClass396_2);
				if (local315 == null) {
					return;
				}
				local307 = new unpack_Sub1(local315);
			} catch (@Pc(326) Throwable local326) {
			}
			if (local307 == null) {
				local315 = this.method9050(Class397.aClass396_1);
				if (local315 == null) {
					return;
				}
				@Pc(341) unpack local341 = new unpack(local315);
				@Pc(346) ClassLoader_Sub1 local346 = new ClassLoader_Sub1(local341);
				@Pc(349) Class local349 = Class.forName("unpack");
				local346.method9046(local349, local349.getName());
				@Pc(359) Class local359 = local346.loadClass("unpackclass");
				@Pc(364) byte[] local364 = this.method9050(Class397.aClass396_3);
				if (local364 == null) {
					return;
				}
				local307 = (unpack) local359.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local364, Boolean.TRUE);
			}
			@Pc(398) ClassLoader_Sub1 local398 = new ClassLoader_Sub1(local307);
			@Pc(401) Class local401 = Class.forName("Class398");
			local398.method9046(local401, local401.getName());
			@Pc(411) Class local411 = local398.loadClass("client");
			synchronized (this) {
				if (this.aBoolean763) {
					return;
				}
				this.anApplet3 = (Applet) local411.getDeclaredConstructor().newInstance();
				local411.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean765) {
					this.anApplet3.start();
				}
				if (this.aBoolean762) {
					this.anApplet3.stop();
				}
			}
			this.method9058();
		} catch (@Pc(481) Exception local481) {
			RuntimeException_Sub2.anInt10963 = -13522774;
			if (local481 instanceof InvocationTargetException) {
				@Pc(490) Throwable local490 = ((InvocationTargetException) local481).getTargetException();
				if (local490 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9044(local490, this, local481.toString());
			} else {
				RuntimeException_Sub2.method9044(local481, this, (String) null);
			}
			this.method9055("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;ZB)[B")
	private byte[] method9060(@OriginalArg(0) Class396 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) byte[] local11 = new byte[arg0.anInt10964];
		@Pc(13) int local13 = 0;
		if (this.lb != null && this.bar != null) {
			local13 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(68) InputStream local68;
			if (arg1) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg0.aString130 + "\n\n").getBytes());
				local68 = local39.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg0.aString130)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local83 < local11.length) {
					@Pc(99) int local99 = local11.length - local83;
					if (local99 > 1000) {
						local99 = 1000;
					}
					@Pc(112) int local112 = local68.read(local11, local83, local99);
					if (local112 >= 0) {
						local83 += local112;
						@Pc(133) int local133 = local83 * 100 / local11.length;
						@Pc(135) int local135 = 0;
						if (this.lb != null && this.bar != null) {
							local135 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local13;
						}
						if (local81 != local133 || local85 != local135) {
							try {
								if (this.method9051(local133, local135, arg0.aStringArray71[this.anInt10968])) {
									local81 = local133;
									local85 = local135;
								}
							} catch (@Pc(187) Exception local187) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local68.close();
				if (arg0.anInt10965 != arg0.anInt10964) {
					@Pc(200) byte[] local200 = new byte[arg0.anInt10965];
					@Pc(205) Inflater local205 = new Inflater(true);
					local205.setInput(local11);
					local11 = local200;
					local205.inflate(local200);
				}
				break;
			}
		} catch (@Pc(216) Exception local216) {
			return null;
		}
		return this.method9054(local11, arg0) ? local11 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method9061(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(19) int local19 = (int) arg0.length();
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(33) byte[] local33 = new byte[local19];
			local30.readFully(local33, 0, local19);
			local30.close();
			return local33;
		} catch (@Pc(43) IOException local43) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;II)Z")
	private boolean method9062(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10969, this.anInt10967);
			this.canvas.setVisible(true);
		}
		@Pc(38) Graphics local38 = this.canvas.getGraphics();
		if (local38 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10969, this.anInt10967);
			}
			@Pc(56) Graphics local56 = this.anImage14.getGraphics();
			@Pc(61) int local61 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(66) int local66 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(71) int local71 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(76) int local76 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(81) int local81 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(86) int local86 = this.bodyFill.getHeight((ImageObserver) null);
			local56.drawImage(this.bodyLeft, this.method9052(local61) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9057(local76) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(127) int local127 = this.lb.boxXOffset + local61 - this.lb.boxWidth / 2;
			@Pc(137) int local137 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(139) int local139;
			for (local139 = local127; local139 <= local137; local139 += local71) {
				local56.drawImage(this.bodyFill, local139 + this.method9052(local61) + this.lb.boxXOffset, this.method9057(local86) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local56.drawImage(this.bodyRight, this.method9052(local66) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9057(local81) - -this.lb.boxYOffset, (ImageObserver) null);
			local139 = this.left.getWidth((ImageObserver) null);
			@Pc(217) int local217 = this.left.getHeight((ImageObserver) null);
			@Pc(222) int local222 = this.right.getWidth((ImageObserver) null);
			@Pc(227) int local227 = this.right.getHeight((ImageObserver) null);
			@Pc(232) int local232 = this.bottom.getHeight((ImageObserver) null);
			@Pc(237) int local237 = this.top.getWidth((ImageObserver) null);
			@Pc(242) int local242 = this.top.getHeight((ImageObserver) null);
			@Pc(247) int local247 = this.bottom.getWidth((ImageObserver) null);
			@Pc(252) int local252 = this.bar.getWidth((ImageObserver) null);
			@Pc(257) int local257 = this.background.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.method9052(this.lb.width) + this.lb.xOffset;
			@Pc(281) int local281 = this.method9057(this.lb.height) + this.lb.yOffset;
			local56.drawImage(this.left, local269, (this.lb.height - local217) / 2 + local281, (ImageObserver) null);
			local56.drawImage(this.right, local269 + this.lb.width - local222, local281 + (-local227 + this.lb.height) / 2, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local139 - local222, this.lb.height);
			}
			@Pc(346) Graphics local346 = this.barBuf.getGraphics();
			@Pc(348) int local348;
			for (local348 = 0; local348 < this.lb.width - local222 - local139; local348 += local237) {
				local346.drawImage(this.top, local348, 0, (ImageObserver) null);
			}
			for (local348 = 0; local348 < this.lb.width - local222 - local139; local348 += local247) {
				local346.drawImage(this.bottom, local348, this.lb.height - local232, (ImageObserver) null);
			}
			local348 = arg1 * (this.lb.width - local222 - local139) / 100;
			if (local348 > 0) {
				@Pc(441) Image local441 = this.createImage(local348, this.lb.height - local232 - local242);
				@Pc(445) int local445 = local441.getWidth((ImageObserver) null);
				@Pc(448) Graphics local448 = local441.getGraphics();
				for (@Pc(453) int local453 = arg2 - local252; local453 < local445; local453 += local252) {
					local448.drawImage(this.bar, local453, 0, (ImageObserver) null);
				}
				local346.drawImage(local441, 0, local242, (ImageObserver) null);
			}
			@Pc(479) int local479 = local348;
			local348 = this.lb.width - local348 - local139 - local222;
			if (local348 > 0) {
				@Pc(509) Image local509 = this.createImage(local348, this.lb.height - local232 - local242);
				@Pc(513) int local513 = local509.getWidth((ImageObserver) null);
				@Pc(516) Graphics local516 = local509.getGraphics();
				for (@Pc(518) int local518 = 0; local518 < local513; local518 += local257) {
					local516.drawImage(this.background, local518, 0, (ImageObserver) null);
				}
				local346.drawImage(local509, local479, local242, (ImageObserver) null);
			}
			local56.drawImage(this.barBuf, local269 + local139, local281, (ImageObserver) null);
			local56.setFont(this.bf);
			local56.setColor(this.colourtext);
			@Pc(574) String local574 = arg0 + " - " + arg1 + "%";
			local56.drawString(local574, local269 + (this.lb.width - this.bfm.stringWidth(local574)) / 2, local281 + 4 - (-(this.lb.height / 2) - this.lb.textYOffset));
			local38.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(613) Exception local613) {
			this.method9059();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/awt/Image;")
	private Image method9063(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(41) Exception local41) {
			throw new IOException();
		}
	}
}
