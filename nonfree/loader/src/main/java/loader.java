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
	private static String aString123;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString124;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt10239 = 0;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt10237;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt10238;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!e;")
	private Class381 lb;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Image;")
	private Image anImage18;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean738;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean735 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean737 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt10240 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method8785(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method8797("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method8786(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class380.aClass381Array1[anInt10239] == null || this.aBoolean738 ? this.method8789(arg0, arg2) : this.method8798(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;ZB)[B")
	private byte[] method8787(@OriginalArg(0) Class382 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10235];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(61) InputStream local61;
			if (arg1) {
				@Pc(24) URL local24 = this.getCodeBase();
				@Pc(32) Socket local32 = new Socket(InetAddress.getByName(local24.getHost()), 443);
				local32.setSoTimeout(10000);
				@Pc(38) OutputStream local38 = local32.getOutputStream();
				local38.write(17);
				local38.write(("JAGGRAB " + local24.getFile() + arg0.aString122 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0.aString122)).openStream();
			}
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = 0;
			@Pc(84) int local84 = 0;
			while (true) {
				if (local82 >= local5.length) {
					local61.close();
					if (arg0.anInt10235 != arg0.anInt10236) {
						@Pc(198) byte[] local198 = new byte[arg0.anInt10236];
						@Pc(203) Inflater local203 = new Inflater(true);
						local203.setInput(local5);
						local203.inflate(local198);
						local5 = local198;
					}
					break;
				}
				@Pc(98) int local98 = local5.length - local82;
				if (local98 > 1000) {
					local98 = 1000;
				}
				@Pc(112) int local112 = local61.read(local5, local82, local98);
				if (local112 < 0) {
					throw new EOFException();
				}
				local82 += local112;
				@Pc(130) int local130 = local82 * 100 / local5.length;
				@Pc(132) int local132 = 0;
				if (this.lb != null && this.bar != null) {
					local132 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local130 != local80 || local132 != local84) {
					try {
						if (this.method8786(local130, local132, arg0.aStringArray40[this.anInt10240])) {
							local80 = local130;
							local84 = local132;
						}
					} catch (@Pc(180) Exception local180) {
					}
				}
			}
		} catch (@Pc(214) Exception local214) {
			return null;
		}
		return this.method8793(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8788(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10237 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method8789(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class380.anIntArray667[anInt10239]);
			this.aColor2 = new Color(Class380.anIntArray668[anInt10239]);
			this.colourtext = new Color(Class380.anIntArray669[anInt10239]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(166) String local166;
		try {
			if (this.anImage18 == null) {
				this.anImage18 = this.createImage(this.anInt10238, this.anInt10237);
			}
			@Pc(70) Graphics local70 = this.anImage18.getGraphics();
			local70.setColor(Color.black);
			local70.fillRect(0, 0, this.anInt10238, this.anInt10237);
			local70.setColor(this.aColor3);
			local92 = this.anInt10238 / 2 - 152;
			local99 = this.anInt10237 / 2 - 18;
			local70.drawRect(local92, local99, 303, 33);
			local70.setColor(this.aColor2);
			local70.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local70.setColor(Color.black);
			local70.drawRect(local92 + 1, local99 - -1, 301, 31);
			local70.fillRect(local92 + arg0 * 3 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local166 = arg1 + " - " + arg0 + "%";
			local70.setFont(this.bf);
			local70.setColor(this.colourtext);
			local70.drawString(local166, (this.anInt10238 - this.bfm.stringWidth(local166)) / 2, this.anInt10237 / 2 + 4);
			local44.drawImage(this.anImage18, 0, 0, null);
		} catch (@Pc(202) Exception local202) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt10238, this.anInt10237);
			local44.setColor(this.aColor3);
			local92 = this.anInt10238 / 2 - 152;
			local99 = this.anInt10237 / 2 - 18;
			local44.drawRect(local92, local99, 303, 33);
			local44.setColor(this.aColor2);
			local44.fillRect(local92 + 2, local99 - -2, arg0 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local92 + 1, local99 + 1, 301, 31);
			local44.fillRect(local92 + arg0 * 3 + 2, local99 - -2, 300 - arg0 * 3, 30);
			local166 = arg1 + " - " + arg0 + "%";
			local44.setFont(this.bf);
			local44.setColor(this.colourtext);
			local44.drawString(local166, (this.anInt10238 - this.bfm.stringWidth(local166)) / 2, this.anInt10237 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString124 = this.getParameter("unsignedurl");
			if (aString124 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean737 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString124), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString123 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class380.aStringArray39.length) {
					local39 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10239 = Integer.parseInt(local64);
				if (anInt10239 < 0 || anInt10239 >= Class380.anIntArray667.length) {
					anInt10239 = 0;
				}
			}
			this.lb = Class380.aClass381Array1[anInt10239];
			this.anInt10238 = this.getSize().width;
			this.anInt10237 = this.getSize().height;
			@Pc(94) int local94 = 32;
			try {
				@Pc(99) int local99 = Integer.parseInt(this.getParameter("modewhat"));
				local94 += local99;
			} catch (@Pc(105) Exception local105) {
			}
			try {
				@Pc(109) String local109 = this.getParameter("lang");
				if (local109 != null) {
					this.anInt10240 = Integer.parseInt(local109);
				}
			} catch (@Pc(118) Exception local118) {
			}
			Class383.method8801(local94, Class380.aStringArray39[local39]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString114, 0, this.lb.anInt10233);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10232);
					this.bar = this.method8796(this.lb.aString119);
					this.background = this.method8796(this.lb.aString110);
					this.left = this.method8796(this.lb.aString118);
					this.right = this.method8796(this.lb.aString115);
					this.top = this.method8796(this.lb.aString116);
					this.bottom = this.method8796(this.lb.aString117);
					this.bodyLeft = this.method8796(this.lb.aString112);
					this.bodyRight = this.method8796(this.lb.aString111);
					this.bodyFill = this.method8796(this.lb.aString113);
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
					this.method8795();
				}
			}
			@Pc(308) unpack local308 = null;
			@Pc(316) byte[] local316;
			try {
				Class.forName("java.util.jar.Pack200");
				local316 = this.method8792(Class380.aClass382_2);
				if (local316 == null) {
					return;
				}
				local308 = new unpack_Sub1(local316);
			} catch (@Pc(328) Throwable local328) {
			}
			if (local308 == null) {
				local316 = this.method8792(Class380.aClass382_1);
				if (local316 == null) {
					return;
				}
				@Pc(345) unpack local345 = new unpack(local316);
				@Pc(350) ClassLoader_Sub1 local350 = new ClassLoader_Sub1(local345);
				@Pc(353) Class local353 = Class.forName("unpack");
				local350.method8776(local353.getName(), local353);
				@Pc(363) Class local363 = local350.loadClass("unpackclass");
				@Pc(368) byte[] local368 = this.method8792(Class380.aClass382_3);
				if (local368 == null) {
					return;
				}
				local308 = (unpack) local363.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local368, Boolean.TRUE);
			}
			@Pc(403) ClassLoader_Sub1 local403 = new ClassLoader_Sub1(local308);
			@Pc(406) Class local406 = Class.forName("Class383");
			local403.method8776(local406.getName(), local406);
			@Pc(416) Class local416 = local403.loadClass("client");
			synchronized (this) {
				if (this.aBoolean735) {
					return;
				}
				this.anApplet3 = (Applet) local416.getDeclaredConstructor().newInstance();
				local416.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean736) {
					this.anApplet3.start();
				}
				if (this.aBoolean739) {
					this.anApplet3.stop();
				}
			}
			this.method8791();
		} catch (@Pc(486) Exception local486) {
			RuntimeException_Sub2.anInt10234 = -1965311186;
			if (local486 instanceof InvocationTargetException) {
				@Pc(495) Throwable local495 = ((InvocationTargetException) local486).getTargetException();
				if (local495 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8784(local486.toString(), local495, this);
			} else {
				RuntimeException_Sub2.method8784(null, local486, this);
			}
			this.method8797("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method8790(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10238 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8791() {
		this.barBuf = null;
		this.aColor2 = null;
		this.aColor3 = null;
		this.anImage18 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;)[B")
	private byte[] method8792(@OriginalArg(1) Class382 arg0) {
		@Pc(13) File local13;
		try {
			local13 = Class383.method8800(arg0.aString121);
		} catch (@Pc(15) Exception local15) {
			this.method8797("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method8794(local13);
		if (!this.method8793(local26, arg0)) {
			local26 = this.method8787(arg0, false);
			if (local26 == null) {
				local26 = this.method8787(arg0, true);
			}
			if (local26 == null) {
				this.method8797("download");
				return null;
			}
			if (!this.method8785(local26, local13)) {
				return null;
			}
			local26 = this.method8794(local13);
			if (!this.method8793(local26, arg0)) {
				this.method8797("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!g;I)Z")
	private boolean method8793(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class382 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(25) byte[] local25 = local9.digest();
			for (@Pc(27) int local27 = 0; local27 < 20; local27++) {
				if (local25[local27] != arg1.anIntArray670[local27]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(52) Exception local52) {
			this.method8797("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8794(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8795() {
		this.aBoolean738 = true;
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
		this.aBoolean735 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean735 = true;
		this.aBoolean736 = this.aBoolean739 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method8796(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(26) int local26;
			while ((local26 = local6.read()) != -1) {
				local9[local11++] = (byte) local26;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(44) Exception local44) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method8797(@OriginalArg(0) String arg0) {
		if (this.aBoolean737) {
			return;
		}
		this.aBoolean737 = true;
		try {
			if (aString123 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString123 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean739 = false;
		this.aBoolean736 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIBLjava/lang/String;)Z")
	private boolean method8798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10238, this.anInt10237);
			this.canvas.setVisible(true);
		}
		@Pc(41) Graphics local41 = this.canvas.getGraphics();
		if (local41 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage18 == null) {
				this.anImage18 = this.createImage(this.anInt10238, this.anInt10237);
			}
			@Pc(63) Graphics local63 = this.anImage18.getGraphics();
			@Pc(68) int local68 = this.bodyLeft.getWidth(null);
			@Pc(73) int local73 = this.bodyRight.getWidth(null);
			@Pc(78) int local78 = this.bodyFill.getWidth(null);
			@Pc(83) int local83 = this.bodyLeft.getHeight(null);
			@Pc(88) int local88 = this.bodyRight.getHeight(null);
			@Pc(93) int local93 = this.bodyFill.getHeight(null);
			local63.drawImage(this.bodyLeft, this.method8790(local68) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8788(local83) - -this.lb.boxYOffset, null);
			@Pc(135) int local135 = local68 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(145) int local145 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(147) int local147;
			for (local147 = local135; local147 <= local145; local147 += local78) {
				local63.drawImage(this.bodyFill, local147 + this.method8790(local68) + this.lb.boxXOffset, this.method8788(local93) - -this.lb.boxYOffset, null);
			}
			local63.drawImage(this.bodyRight, this.method8790(local73) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8788(local88) - -this.lb.boxYOffset, null);
			local147 = this.left.getWidth(null);
			@Pc(226) int local226 = this.left.getHeight(null);
			@Pc(231) int local231 = this.right.getWidth(null);
			@Pc(236) int local236 = this.right.getHeight(null);
			@Pc(241) int local241 = this.bottom.getHeight(null);
			@Pc(246) int local246 = this.top.getWidth(null);
			@Pc(251) int local251 = this.top.getHeight(null);
			@Pc(256) int local256 = this.bottom.getWidth(null);
			@Pc(261) int local261 = this.bar.getWidth(null);
			@Pc(266) int local266 = this.background.getWidth(null);
			@Pc(277) int local277 = this.method8790(this.lb.width) + this.lb.xOffset;
			@Pc(289) int local289 = this.method8788(this.lb.height) + this.lb.yOffset;
			local63.drawImage(this.left, local277, (this.lb.height - local226) / 2 + local289, null);
			local63.drawImage(this.right, local277 + this.lb.width - local231, (this.lb.height - local236) / 2 + local289, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local231 - local147, this.lb.height);
			}
			@Pc(352) Graphics local352 = this.barBuf.getGraphics();
			@Pc(354) int local354;
			for (local354 = 0; local354 < this.lb.width - local231 - local147; local354 += local246) {
				local352.drawImage(this.top, local354, 0, null);
			}
			for (local354 = 0; local354 < this.lb.width - local231 - local147; local354 += local256) {
				local352.drawImage(this.bottom, local354, this.lb.height - local241, null);
			}
			local354 = arg1 * (this.lb.width - local231 - local147) / 100;
			if (local354 > 0) {
				@Pc(446) Image local446 = this.createImage(local354, this.lb.height - local251 - local241);
				@Pc(450) int local450 = local446.getWidth(null);
				@Pc(453) Graphics local453 = local446.getGraphics();
				for (@Pc(458) int local458 = arg0 - local261; local458 < local450; local458 += local261) {
					local453.drawImage(this.bar, local458, 0, null);
				}
				local352.drawImage(local446, 0, local251, null);
			}
			@Pc(484) int local484 = local354;
			local354 = this.lb.width - local354 - local231 - local147;
			if (local354 > 0) {
				@Pc(516) Image local516 = this.createImage(local354, this.lb.height - local251 - local241);
				@Pc(520) int local520 = local516.getWidth(null);
				@Pc(523) Graphics local523 = local516.getGraphics();
				for (@Pc(525) int local525 = 0; local525 < local520; local525 += local266) {
					local523.drawImage(this.background, local525, 0, null);
				}
				local352.drawImage(local516, local484, local251, null);
			}
			local63.drawImage(this.barBuf, local147 + local277, local289, null);
			local63.setFont(this.bf);
			local63.setColor(this.colourtext);
			@Pc(580) String local580 = arg2 + " - " + arg1 + "%";
			local63.drawString(local580, (this.lb.width - this.bfm.stringWidth(local580)) / 2 + local277, this.lb.textYOffset + 4 + this.lb.height / 2 + local289);
			local41.drawImage(this.anImage18, 0, 0, null);
		} catch (@Pc(618) Exception local618) {
			this.method8795();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean736 = false;
		this.aBoolean739 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
