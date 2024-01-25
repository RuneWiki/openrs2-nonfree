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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString153;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString154;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt10846 = 0;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10847;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean799;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt10848;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!a;")
	private Class395 lb;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean800 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean801 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean798 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt10849 = 0;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean802 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;B)[B")
	private byte[] method9344(@OriginalArg(0) Class396 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class398.method9358(arg0.aString150);
		} catch (@Pc(6) Exception local6) {
			this.method9350("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method9345(local4);
		if (!this.method9354(local25, arg0)) {
			local25 = this.method9348(false, arg0);
			if (local25 == null) {
				local25 = this.method9348(true, arg0);
			}
			if (local25 == null) {
				this.method9350("download");
				return null;
			}
			if (!this.method9347(local4, local25)) {
				return null;
			}
			local25 = this.method9345(local4);
			if (!this.method9354(local25, arg0)) {
				this.method9350("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean801 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method9345(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(33) byte[] local33 = new byte[local9];
			local30.readFully(local33, 0, local9);
			local30.close();
			return local33;
		} catch (@Pc(43) IOException local43) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString154 = this.getParameter("unsignedurl");
			if (aString154 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean798 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString154), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString153 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class397.aStringArray76.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10846 = Integer.parseInt(local64);
				if (anInt10846 < 0 || anInt10846 >= Class397.anIntArray627.length) {
					anInt10846 = 0;
				}
			}
			this.lb = Class397.aClass395Array1[anInt10846];
			this.anInt10848 = this.getSize().width;
			this.anInt10847 = this.getSize().height;
			@Pc(95) int local95 = 32;
			try {
				@Pc(100) int local100 = Integer.parseInt(this.getParameter("modewhat"));
				local95 += local100;
			} catch (@Pc(106) Exception local106) {
			}
			try {
				@Pc(110) String local110 = this.getParameter("lang");
				if (local110 != null) {
					this.anInt10849 = Integer.parseInt(local110);
				}
			} catch (@Pc(119) Exception local119) {
			}
			Class398.method9360(local95, Class397.aStringArray76[local39]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString149, 0, this.lb.anInt10842);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10841);
					this.bar = this.method9349(this.lb.aString147);
					this.background = this.method9349(this.lb.aString142);
					this.left = this.method9349(this.lb.aString146);
					this.right = this.method9349(this.lb.aString144);
					this.top = this.method9349(this.lb.aString143);
					this.bottom = this.method9349(this.lb.aString140);
					this.bodyLeft = this.method9349(this.lb.aString141);
					this.bodyRight = this.method9349(this.lb.aString148);
					this.bodyFill = this.method9349(this.lb.aString145);
					@Pc(275) Image[] local275 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(280) MediaTracker local280 = new MediaTracker(this);
					for (@Pc(282) int local282 = 0; local282 < local275.length; local282++) {
						local280.addImage(local275[local282], local282);
					}
					while (true) {
						try {
							local280.waitForAll();
							break;
						} catch (@Pc(299) InterruptedException local299) {
						}
					}
				} catch (@Pc(303) Throwable local303) {
					this.method9352();
				}
			}
			@Pc(308) unpack local308 = null;
			@Pc(316) byte[] local316;
			try {
				Class.forName("java.util.jar.Pack200");
				local316 = this.method9344(Class397.aClass396_2);
				if (local316 == null) {
					return;
				}
				local308 = new unpack_Sub1(local316);
			} catch (@Pc(327) Throwable local327) {
			}
			if (local308 == null) {
				local316 = this.method9344(Class397.aClass396_1);
				if (local316 == null) {
					return;
				}
				@Pc(343) unpack local343 = new unpack(local316);
				@Pc(348) ClassLoader_Sub1 local348 = new ClassLoader_Sub1(local343);
				@Pc(351) Class local351 = Class.forName("unpack");
				local348.method9335(local351.getName(), local351);
				@Pc(361) Class local361 = local348.loadClass("unpackclass");
				@Pc(366) byte[] local366 = this.method9344(Class397.aClass396_3);
				if (local366 == null) {
					return;
				}
				local308 = (unpack) local361.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local366, Boolean.TRUE);
			}
			@Pc(402) ClassLoader_Sub1 local402 = new ClassLoader_Sub1(local308);
			@Pc(405) Class local405 = Class.forName("Class398");
			local402.method9335(local405.getName(), local405);
			@Pc(415) Class local415 = local402.loadClass("client");
			synchronized (this) {
				if (this.aBoolean801) {
					return;
				}
				this.anApplet3 = (Applet) local415.getDeclaredConstructor().newInstance();
				local415.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean802) {
					this.anApplet3.start();
				}
				if (this.aBoolean800) {
					this.anApplet3.stop();
				}
			}
			this.method9353();
		} catch (@Pc(485) Exception local485) {
			RuntimeException_Sub2.anInt10845 = -2142646123;
			if (local485 instanceof InvocationTargetException) {
				@Pc(501) Throwable local501 = ((InvocationTargetException) local485).getTargetException();
				if (local501 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9341(local485.toString(), local501, this);
			} else {
				RuntimeException_Sub2.method9341((String) null, local485, this);
			}
			this.method9350("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	private boolean method9346(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class397.anIntArray627[anInt10846]);
			this.aColor3 = new Color(Class397.anIntArray628[anInt10846]);
			this.colourtext = new Color(Class397.anIntArray626[anInt10846]);
		}
		@Pc(56) Graphics local56 = this.getGraphics();
		if (local56 == null) {
			this.repaint();
			return false;
		}
		@Pc(101) int local101;
		@Pc(108) int local108;
		@Pc(176) String local176;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10848, this.anInt10847);
			}
			@Pc(79) Graphics local79 = this.anImage14.getGraphics();
			local79.setColor(Color.black);
			local79.fillRect(0, 0, this.anInt10848, this.anInt10847);
			local79.setColor(this.aColor2);
			local101 = this.anInt10848 / 2 - 152;
			local108 = this.anInt10847 / 2 - 18;
			local79.drawRect(local101, local108, 303, 33);
			local79.setColor(this.aColor3);
			local79.fillRect(local101 + 2, local108 + 2, arg1 * 3, 30);
			local79.setColor(Color.black);
			local79.drawRect(local101 + 1, local108 - -1, 301, 31);
			local79.fillRect(local101 + arg1 * 3 + 2, local108 + 2, 300 - arg1 * 3, 30);
			local176 = arg0 + " - " + arg1 + "%";
			local79.setFont(this.bf);
			local79.setColor(this.colourtext);
			local79.drawString(local176, (this.anInt10848 - this.bfm.stringWidth(local176)) / 2, this.anInt10847 / 2 + 4);
			local56.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(213) Exception local213) {
			local56.setColor(Color.black);
			local56.fillRect(0, 0, this.anInt10848, this.anInt10847);
			local56.setColor(this.aColor2);
			local101 = this.anInt10848 / 2 - 152;
			local108 = this.anInt10847 / 2 - 18;
			local56.drawRect(local101, local108, 303, 33);
			local56.setColor(this.aColor3);
			local56.fillRect(local101 + 2, local108 + 2, arg1 * 3, 30);
			local56.setColor(Color.black);
			local56.drawRect(local101 + 1, local108 - -1, 301, 31);
			local56.fillRect(local101 + arg1 * 3 + 2, local108 + 2, 300 - arg1 * 3, 30);
			local56.setFont(this.bf);
			local176 = arg0 + " - " + arg1 + "%";
			local56.setColor(this.colourtext);
			local56.drawString(local176, (this.anInt10848 - this.bfm.stringWidth(local176)) / 2, this.anInt10847 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean802 = true;
		this.aBoolean800 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method9347(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method9350("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!e;)[B")
	private byte[] method9348(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class396 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10844];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString151 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1.aString151)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(84) int local84 = 0;
			while (true) {
				if (local76 < local5.length) {
					@Pc(94) int local94 = local5.length - local76;
					if (local94 > 1000) {
						local94 = 1000;
					}
					@Pc(108) int local108 = local30.read(local5, local76, local94);
					if (local108 >= 0) {
						local76 += local108;
						@Pc(126) int local126 = local76 * 100 / local5.length;
						@Pc(128) int local128 = 0;
						if (this.lb != null && this.bar != null) {
							local128 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local126 != local74 || local128 != local84) {
							try {
								if (this.method9356(local126, arg1.aStringArray75[this.anInt10849], local128)) {
									local74 = local126;
									local84 = local128;
								}
							} catch (@Pc(172) Exception local172) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local30.close();
				if (arg1.anInt10843 != arg1.anInt10844) {
					@Pc(190) byte[] local190 = new byte[arg1.anInt10843];
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
		return this.method9354(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)Ljava/awt/Image;")
	private Image method9349(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(20) byte[] local20 = new byte[3000];
			@Pc(22) int local22 = 0;
			@Pc(26) int local26;
			while ((local26 = local6.read()) != -1) {
				local20[local22++] = (byte) local26;
			}
			return Toolkit.getDefaultToolkit().createImage(local20);
		} catch (@Pc(44) Exception local44) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(BLjava/lang/String;)V")
	private void method9350(@OriginalArg(1) String arg0) {
		if (this.aBoolean798) {
			return;
		}
		this.aBoolean798 = true;
		try {
			if (aString153 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString153 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method9351(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10847 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9352() {
		this.bf = null;
		this.aBoolean799 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9353() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor2 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILloader!e;)Z")
	private boolean method9354(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class396 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg1.anIntArray625[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method9350("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean800 = true;
		this.aBoolean802 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9355(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10848 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;I)Z")
	private boolean method9356(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class397.aClass395Array1[anInt10846] == null || this.aBoolean799 ? this.method9346(arg1, arg0) : this.method9357(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9357(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10848, this.anInt10847);
			this.canvas.setVisible(true);
		}
		@Pc(41) Graphics local41 = this.canvas.getGraphics();
		if (local41 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10848, this.anInt10847);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			@Pc(70) int local70 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(75) int local75 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(80) int local80 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(85) int local85 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(90) int local90 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(95) int local95 = this.bodyFill.getHeight((ImageObserver) null);
			local65.drawImage(this.bodyLeft, this.method9355(local70) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9351(local85) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(137) int local137 = this.lb.boxXOffset + local70 - this.lb.boxWidth / 2;
			@Pc(148) int local148 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(150) int local150;
			for (local150 = local137; local150 <= local148; local150 += local80) {
				local65.drawImage(this.bodyFill, this.method9355(local70) + this.lb.boxXOffset + local150, this.method9351(local95) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local65.drawImage(this.bodyRight, this.method9355(local75) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9351(local90) + this.lb.boxYOffset, (ImageObserver) null);
			local150 = this.left.getWidth((ImageObserver) null);
			@Pc(225) int local225 = this.left.getHeight((ImageObserver) null);
			@Pc(230) int local230 = this.right.getWidth((ImageObserver) null);
			@Pc(235) int local235 = this.right.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.bottom.getHeight((ImageObserver) null);
			@Pc(245) int local245 = this.top.getWidth((ImageObserver) null);
			@Pc(250) int local250 = this.top.getHeight((ImageObserver) null);
			@Pc(255) int local255 = this.bottom.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.bar.getWidth((ImageObserver) null);
			@Pc(265) int local265 = this.background.getWidth((ImageObserver) null);
			@Pc(277) int local277 = this.method9355(this.lb.width) + this.lb.xOffset;
			@Pc(288) int local288 = this.method9351(this.lb.height) + this.lb.yOffset;
			local65.drawImage(this.left, local277, (this.lb.height - local225) / 2 + local288, (ImageObserver) null);
			local65.drawImage(this.right, this.lb.width + local277 - local230, (-local235 + this.lb.height) / 2 + local288, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local230 - local150, this.lb.height);
			}
			@Pc(351) Graphics local351 = this.barBuf.getGraphics();
			@Pc(353) int local353;
			for (local353 = 0; local353 < this.lb.width - local230 - local150; local353 += local245) {
				local351.drawImage(this.top, local353, 0, (ImageObserver) null);
			}
			for (local353 = 0; local353 < this.lb.width - local150 - local230; local353 += local255) {
				local351.drawImage(this.bottom, local353, this.lb.height - local240, (ImageObserver) null);
			}
			local353 = (this.lb.width - local230 - local150) * arg2 / 100;
			if (local353 > 0) {
				@Pc(444) Image local444 = this.createImage(local353, this.lb.height - local240 - local250);
				@Pc(448) int local448 = local444.getWidth((ImageObserver) null);
				@Pc(451) Graphics local451 = local444.getGraphics();
				for (@Pc(456) int local456 = arg1 - local260; local456 < local448; local456 += local260) {
					local451.drawImage(this.bar, local456, 0, (ImageObserver) null);
				}
				local351.drawImage(local444, 0, local250, (ImageObserver) null);
			}
			@Pc(482) int local482 = local353;
			local353 = this.lb.width - local353 - local230 - local150;
			if (local353 > 0) {
				@Pc(509) Image local509 = this.createImage(local353, this.lb.height - local250 - local240);
				@Pc(513) int local513 = local509.getWidth((ImageObserver) null);
				@Pc(516) Graphics local516 = local509.getGraphics();
				for (@Pc(518) int local518 = 0; local518 < local513; local518 += local265) {
					local516.drawImage(this.background, local518, 0, (ImageObserver) null);
				}
				local351.drawImage(local509, local482, local250, (ImageObserver) null);
			}
			local65.drawImage(this.barBuf, local277 + local150, local288, (ImageObserver) null);
			local65.setFont(this.bf);
			local65.setColor(this.colourtext);
			@Pc(573) String local573 = arg0 + " - " + arg2 + "%";
			local65.drawString(local573, local277 + (this.lb.width - this.bfm.stringWidth(local573)) / 2, local288 - -(this.lb.height / 2) + 4 - -this.lb.textYOffset);
			local41.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(613) Exception local613) {
			this.method9352();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean801 = true;
		this.aBoolean802 = this.aBoolean800 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
