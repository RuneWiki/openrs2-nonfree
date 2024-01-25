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
	private static String aString159;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString160;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private static int anInt9661 = 0;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean811;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet5;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt9658;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!g;")
	private Class369 lb;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt9659;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt9660 = 0;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean814 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean813 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean812 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean810 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean813 = true;
		this.aBoolean812 = this.aBoolean810 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.destroy();
		}
		this.anApplet5 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZI)I")
	private int method7758(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt9659 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method7759(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
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
		if (this.anApplet5 != null) {
			this.anApplet5.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean813 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;B)[B")
	private byte[] method7760(@OriginalArg(0) Class370 arg0) {
		@Pc(12) File local12;
		try {
			local12 = Class371.method7772(arg0.aString158);
		} catch (@Pc(14) Exception local14) {
			this.method7761("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method7766(local12);
		if (!this.method7765(local25, arg0)) {
			local25 = this.method7770(false, arg0);
			if (local25 == null) {
				local25 = this.method7770(true, arg0);
			}
			if (local25 == null) {
				this.method7761("download");
				return null;
			}
			if (!this.method7769(local12, local25)) {
				return null;
			}
			local25 = this.method7766(local12);
			if (!this.method7765(local25, arg0)) {
				this.method7761("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method7761(@OriginalArg(0) String arg0) {
		if (this.aBoolean814) {
			return;
		}
		this.aBoolean814 = true;
		try {
			if (aString160 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString160 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	private boolean method7762(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class368.aClass369Array1[anInt9661] == null || this.aBoolean811 ? this.method7763(arg1, arg2) : this.method7771(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BI)Z")
	private boolean method7763(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class368.anIntArray620[anInt9661]);
			this.aColor2 = new Color(Class368.anIntArray621[anInt9661]);
			this.colourtext = new Color(Class368.anIntArray622[anInt9661]);
		}
		@Pc(52) Graphics local52 = this.getGraphics();
		if (local52 == null) {
			this.repaint();
			return false;
		}
		@Pc(98) int local98;
		@Pc(105) int local105;
		@Pc(172) String local172;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9659, this.anInt9658);
			}
			@Pc(76) Graphics local76 = this.anImage14.getGraphics();
			local76.setColor(Color.black);
			local76.fillRect(0, 0, this.anInt9659, this.anInt9658);
			local76.setColor(this.aColor3);
			local98 = this.anInt9659 / 2 - 152;
			local105 = this.anInt9658 / 2 - 18;
			local76.drawRect(local98, local105, 303, 33);
			local76.setColor(this.aColor2);
			local76.fillRect(local98 + 2, local105 - -2, arg1 * 3, 30);
			local76.setColor(Color.black);
			local76.drawRect(local98 + 1, local105 + 1, 301, 31);
			local76.fillRect(local98 + arg1 * 3 + 2, local105 - -2, 300 - arg1 * 3, 30);
			local172 = arg0 + " - " + arg1 + "%";
			local76.setFont(this.bf);
			local76.setColor(this.colourtext);
			local76.drawString(local172, (this.anInt9659 - this.bfm.stringWidth(local172)) / 2, this.anInt9658 / 2 + 4);
			local52.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(208) Exception local208) {
			local52.setColor(Color.black);
			local52.fillRect(0, 0, this.anInt9659, this.anInt9658);
			local52.setColor(this.aColor3);
			local98 = this.anInt9659 / 2 - 152;
			local105 = this.anInt9658 / 2 - 18;
			local52.drawRect(local98, local105, 303, 33);
			local52.setColor(this.aColor2);
			local52.fillRect(local98 + 2, local105 + 2, arg1 * 3, 30);
			local52.setColor(Color.black);
			local52.drawRect(local98 + 1, local105 + 1, 301, 31);
			local52.fillRect(arg1 * 3 + local98 + 2, local105 + 2, 300 - arg1 * 3, 30);
			local172 = arg0 + " - " + arg1 + "%";
			local52.setFont(this.bf);
			local52.setColor(this.colourtext);
			local52.drawString(local172, (this.anInt9659 - this.bfm.stringWidth(local172)) / 2, this.anInt9658 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method7764() {
		this.aColor3 = null;
		this.anImage14 = null;
		this.aColor2 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString159 = this.getParameter("unsignedurl");
			if (aString159 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean814 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString159), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString160 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class368.aStringArray46.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt9661 = Integer.parseInt(local62);
				if (anInt9661 < 0 || Class368.anIntArray620.length <= anInt9661) {
					anInt9661 = 0;
				}
			}
			this.lb = Class368.aClass369Array1[anInt9661];
			this.anInt9659 = this.getSize().width;
			this.anInt9658 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt9660 = Integer.parseInt(local113);
				}
			} catch (@Pc(122) Exception local122) {
			}
			Class371.method7773(Class368.aStringArray46[local37], local98);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString152, 0, this.lb.anInt9655);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9654);
					this.bar = this.method7759(this.lb.aString149);
					this.background = this.method7759(this.lb.aString156);
					this.left = this.method7759(this.lb.aString153);
					this.right = this.method7759(this.lb.aString147);
					this.top = this.method7759(this.lb.aString150);
					this.bottom = this.method7759(this.lb.aString151);
					this.bodyLeft = this.method7759(this.lb.aString155);
					this.bodyRight = this.method7759(this.lb.aString154);
					this.bodyFill = this.method7759(this.lb.aString148);
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
					this.method7768();
				}
			}
			@Pc(315) unpack local315 = null;
			@Pc(323) byte[] local323;
			try {
				Class.forName("java.util.jar.Pack200");
				local323 = this.method7760(Class368.aClass370_2);
				if (local323 == null) {
					return;
				}
				local315 = new unpack_Sub1(local323);
			} catch (@Pc(334) Throwable local334) {
			}
			if (local315 == null) {
				local323 = this.method7760(Class368.aClass370_1);
				if (local323 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local323);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method7752(local358, local358.getName());
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method7760(Class368.aClass370_3);
				if (local373 == null) {
					return;
				}
				local315 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local315);
			@Pc(412) Class local412 = Class.forName("Class371");
			local409.method7752(local412, local412.getName());
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean813) {
					return;
				}
				this.anApplet5 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet5.init();
				if (this.aBoolean812) {
					this.anApplet5.start();
				}
				if (this.aBoolean810) {
					this.anApplet5.stop();
				}
			}
			this.method7764();
		} catch (@Pc(492) Exception local492) {
			RuntimeException_Sub2.anInt9653 = 1456176420;
			if (local492 instanceof InvocationTargetException) {
				@Pc(508) Throwable local508 = ((InvocationTargetException) local492).getTargetException();
				if (local508 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7756(local508, this, local492.toString());
			} else {
				RuntimeException_Sub2.method7756(local492, this, null);
			}
			this.method7761("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILloader!h;)Z")
	private boolean method7765(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class370 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(23) byte[] local23 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray623[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(50) Exception local50) {
			this.method7761("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean812 = true;
		this.aBoolean810 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean812 = false;
		this.aBoolean810 = true;
		if (this.anApplet5 != null) {
			this.anApplet5.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method7766(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method7767(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt9658 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method7768() {
		this.bf = null;
		this.bfm = null;
		this.aBoolean811 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BZ)Z")
	private boolean method7769(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(19) IOException local19) {
			this.method7761("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!h;)[B")
	private byte[] method7770(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class370 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9656];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(60) InputStream local60;
			if (arg0) {
				@Pc(23) URL local23 = this.getCodeBase();
				@Pc(31) Socket local31 = new Socket(InetAddress.getByName(local23.getHost()), 443);
				local31.setSoTimeout(10000);
				@Pc(37) OutputStream local37 = local31.getOutputStream();
				local37.write(17);
				local37.write(("JAGGRAB " + local23.getFile() + arg1.aString157 + "\n\n").getBytes());
				local60 = local31.getInputStream();
			} else {
				local60 = (new URL(this.getCodeBase(), arg1.aString157)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local5.length <= local83) {
					local60.close();
					if (arg1.anInt9656 != arg1.anInt9657) {
						@Pc(188) byte[] local188 = new byte[arg1.anInt9657];
						@Pc(193) Inflater local193 = new Inflater(true);
						local193.setInput(local5);
						local193.inflate(local188);
						local5 = local188;
					}
					break;
				}
				@Pc(95) int local95 = local5.length - local83;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(107) int local107 = local60.read(local5, local83, local95);
				if (local107 < 0) {
					throw new EOFException();
				}
				local83 += local107;
				@Pc(125) int local125 = local83 * 100 / local5.length;
				@Pc(127) int local127 = 0;
				if (this.lb != null && this.bar != null) {
					local127 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local125 != local73 || local85 != local127) {
					try {
						if (this.method7762(local127, arg1.aStringArray47[this.anInt9660], local125)) {
							local73 = local125;
							local85 = local127;
						}
					} catch (@Pc(175) Exception local175) {
					}
				}
			}
		} catch (@Pc(204) Exception local204) {
			return null;
		}
		return this.method7765(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method7771(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9659, this.anInt9658);
			this.canvas.setVisible(true);
		}
		@Pc(41) Graphics local41 = this.canvas.getGraphics();
		if (local41 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9659, this.anInt9658);
			}
			@Pc(61) Graphics local61 = this.anImage14.getGraphics();
			@Pc(66) int local66 = this.bodyLeft.getWidth(null);
			@Pc(71) int local71 = this.bodyRight.getWidth(null);
			@Pc(76) int local76 = this.bodyFill.getWidth(null);
			@Pc(81) int local81 = this.bodyLeft.getHeight(null);
			@Pc(86) int local86 = this.bodyRight.getHeight(null);
			@Pc(91) int local91 = this.bodyFill.getHeight(null);
			local61.drawImage(this.bodyLeft, this.method7758(local66) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method7767(local81) - -this.lb.boxYOffset, null);
			@Pc(137) int local137 = local66 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(151) int local151 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local71;
			@Pc(153) int local153;
			for (local153 = local137; local153 <= local151; local153 += local76) {
				local61.drawImage(this.bodyFill, local153 + this.method7758(local66) + this.lb.boxXOffset, this.method7767(local91) - -this.lb.boxYOffset, null);
			}
			local61.drawImage(this.bodyRight, this.method7758(local71) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method7767(local86) + this.lb.boxYOffset, null);
			local153 = this.left.getWidth(null);
			@Pc(227) int local227 = this.left.getHeight(null);
			@Pc(232) int local232 = this.right.getWidth(null);
			@Pc(237) int local237 = this.right.getHeight(null);
			@Pc(242) int local242 = this.bottom.getHeight(null);
			@Pc(247) int local247 = this.top.getWidth(null);
			@Pc(252) int local252 = this.top.getHeight(null);
			@Pc(257) int local257 = this.bottom.getWidth(null);
			@Pc(262) int local262 = this.bar.getWidth(null);
			@Pc(267) int local267 = this.background.getWidth(null);
			@Pc(278) int local278 = this.method7758(this.lb.width) + this.lb.xOffset;
			@Pc(290) int local290 = this.method7767(this.lb.height) + this.lb.yOffset;
			local61.drawImage(this.left, local278, local290 + (this.lb.height - local227) / 2, null);
			local61.drawImage(this.right, local278 + this.lb.width - local232, (-local237 + this.lb.height) / 2 + local290, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local232 - local153, this.lb.height);
			}
			@Pc(355) Graphics local355 = this.barBuf.getGraphics();
			@Pc(357) int local357;
			for (local357 = 0; local357 < this.lb.width - local153 - local232; local357 += local247) {
				local355.drawImage(this.top, local357, 0, null);
			}
			for (local357 = 0; local357 < this.lb.width - local153 - local232; local357 += local257) {
				local355.drawImage(this.bottom, local357, this.lb.height - local242, null);
			}
			local357 = arg0 * (this.lb.width - local153 - local232) / 100;
			if (local357 > 0) {
				@Pc(450) Image local450 = this.createImage(local357, this.lb.height - local242 - local252);
				@Pc(454) int local454 = local450.getWidth(null);
				@Pc(457) Graphics local457 = local450.getGraphics();
				for (@Pc(461) int local461 = arg2 - local262; local461 < local454; local461 += local262) {
					local457.drawImage(this.bar, local461, 0, null);
				}
				local355.drawImage(local450, 0, local252, null);
			}
			@Pc(491) int local491 = local357;
			local357 = this.lb.width - local232 - local153 - local357;
			if (local357 > 0) {
				@Pc(519) Image local519 = this.createImage(local357, this.lb.height - local242 - local252);
				@Pc(523) int local523 = local519.getWidth(null);
				@Pc(526) Graphics local526 = local519.getGraphics();
				for (@Pc(528) int local528 = 0; local528 < local523; local528 += local267) {
					local526.drawImage(this.background, local528, 0, null);
				}
				local355.drawImage(local519, local491, local252, null);
			}
			local61.drawImage(this.barBuf, local153 + local278, local290, null);
			local61.setFont(this.bf);
			local61.setColor(this.colourtext);
			@Pc(587) String local587 = arg1 + " - " + arg0 + "%";
			local61.drawString(local587, (this.lb.width - this.bfm.stringWidth(local587)) / 2 + local278, local290 - -(this.lb.height / 2) - (-this.lb.textYOffset + -4));
			local41.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(628) Exception local628) {
			this.method7768();
		}
		return true;
	}
}
