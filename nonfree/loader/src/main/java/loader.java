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
	private static String aString115;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt9696 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt9697;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class368 lb;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt9699;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean721 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean720 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean722 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt9698 = 0;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean723 = true;
		this.aBoolean720 = this.aBoolean722 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean722 = true;
		this.aBoolean720 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method7957(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method7962("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method7958(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt9697 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString115 = this.getParameter("unsignedurl");
			if (aString115 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean721 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString115), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			aString116 = this.getParameter("crashurl");
			@Pc(40) int local40 = 0;
			@Pc(44) String local44 = this.getParameter("cachesubdirid");
			if (local44 != null) {
				local40 = Integer.parseInt(local44);
				if (local40 < 0 || local40 >= Class369.aStringArray44.length) {
					local40 = 0;
				}
			}
			@Pc(71) String local71 = this.getParameter("colourid");
			if (local71 != null) {
				anInt9696 = Integer.parseInt(local71);
				if (anInt9696 < 0 || Class369.anIntArray646.length <= anInt9696) {
					anInt9696 = 0;
				}
			}
			this.lb = Class369.aClass368Array1[anInt9696];
			this.anInt9697 = this.getSize().width;
			this.anInt9699 = this.getSize().height;
			@Pc(105) int local105 = 32;
			try {
				@Pc(110) int local110 = Integer.parseInt(this.getParameter("modewhat"));
				local105 += local110;
			} catch (@Pc(116) Exception local116) {
			}
			try {
				@Pc(120) String local120 = this.getParameter("lang");
				if (local120 != null) {
					this.anInt9698 = Integer.parseInt(local120);
				}
			} catch (@Pc(128) Exception local128) {
			}
			Class367.method7945(Class369.aStringArray44[local40], local105);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString111, 0, this.lb.anInt9695);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9694);
					this.bar = this.method7960(this.lb.aString112);
					this.background = this.method7960(this.lb.aString106);
					this.left = this.method7960(this.lb.aString113);
					this.right = this.method7960(this.lb.aString108);
					this.top = this.method7960(this.lb.aString109);
					this.bottom = this.method7960(this.lb.aString114);
					this.bodyLeft = this.method7960(this.lb.aString107);
					this.bodyRight = this.method7960(this.lb.aString110);
					this.bodyFill = this.method7960(this.lb.aString105);
					@Pc(283) Image[] local283 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(288) MediaTracker local288 = new MediaTracker(this);
					for (@Pc(290) int local290 = 0; local290 < local283.length; local290++) {
						local288.addImage(local283[local290], local290);
					}
					while (true) {
						try {
							local288.waitForAll();
							break;
						} catch (@Pc(307) InterruptedException local307) {
						}
					}
				} catch (@Pc(311) Throwable local311) {
					this.method7964();
				}
			}
			@Pc(316) unpack local316 = null;
			@Pc(324) byte[] local324;
			try {
				Class.forName("java.util.jar.Pack200");
				local324 = this.method7965(Class369.aClass366_2);
				if (local324 == null) {
					return;
				}
				local316 = new unpack_Sub1(local324);
			} catch (@Pc(335) Throwable local335) {
			}
			if (local316 == null) {
				local324 = this.method7965(Class369.aClass366_1);
				if (local324 == null) {
					return;
				}
				@Pc(353) unpack local353 = new unpack(local324);
				@Pc(358) ClassLoader_Sub1 local358 = new ClassLoader_Sub1(local353);
				@Pc(361) Class local361 = Class.forName("unpack");
				local358.method7948(local361.getName(), local361);
				@Pc(371) Class local371 = local358.loadClass("unpackclass");
				@Pc(376) byte[] local376 = this.method7965(Class369.aClass366_3);
				if (local376 == null) {
					return;
				}
				local316 = (unpack) local371.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local376, Boolean.TRUE);
			}
			@Pc(411) ClassLoader_Sub1 local411 = new ClassLoader_Sub1(local316);
			@Pc(414) Class local414 = Class.forName("Class367");
			local411.method7948(local414.getName(), local414);
			@Pc(424) Class local424 = local411.loadClass("client");
			synchronized (this) {
				if (this.aBoolean723) {
					return;
				}
				this.anApplet3 = (Applet) local424.getDeclaredConstructor().newInstance();
				local424.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean720) {
					this.anApplet3.start();
				}
				if (this.aBoolean722) {
					this.anApplet3.stop();
				}
			}
			this.method7968();
		} catch (@Pc(493) Exception local493) {
			RuntimeException_Sub2.anInt9693 = 2029486871;
			if (local493 instanceof InvocationTargetException) {
				@Pc(502) Throwable local502 = ((InvocationTargetException) local493).getTargetException();
				if (local502 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7953(local493.toString(), this, local502);
			} else {
				RuntimeException_Sub2.method7953(null, this, local493);
			}
			this.method7962("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLloader!a;)Z")
	private boolean method7959(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class366 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg1.anIntArray643[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(52) Exception local52) {
			this.method7962("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/awt/Image;")
	private Image method7960(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(37) Exception local37) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean720 = true;
		this.aBoolean722 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method7961(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt9699 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7962(@OriginalArg(1) String arg0) {
		if (this.aBoolean721) {
			return;
		}
		this.aBoolean721 = true;
		try {
			if (aString116 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString116 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method7963(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method7964() {
		this.bf = null;
		this.bfm = null;
		this.aBoolean724 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;B)[B")
	private byte[] method7965(@OriginalArg(0) Class366 arg0) {
		@Pc(9) File local9;
		try {
			local9 = Class367.method7944(arg0.aString101);
		} catch (@Pc(11) Exception local11) {
			this.method7962("nocache");
			return null;
		}
		@Pc(22) byte[] local22 = this.method7963(local9);
		if (!this.method7959(local22, arg0)) {
			local22 = this.method7969(false, arg0);
			if (local22 == null) {
				local22 = this.method7969(true, arg0);
			}
			if (local22 == null) {
				this.method7962("download");
				return null;
			}
			if (!this.method7957(local22, local9)) {
				return null;
			}
			local22 = this.method7963(local9);
			if (!this.method7959(local22, arg0)) {
				this.method7962("mismatch");
				return null;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;B)Z")
	private boolean method7966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return Class369.aClass368Array1[anInt9696] == null || this.aBoolean724 ? this.method7967(arg2, arg1) : this.method7970(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method7967(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class369.anIntArray646[anInt9696]);
			this.aColor2 = new Color(Class369.anIntArray644[anInt9696]);
			this.colourtext = new Color(Class369.anIntArray645[anInt9696]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(95) int local95;
		@Pc(102) int local102;
		@Pc(173) String local173;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9697, this.anInt9699);
			}
			@Pc(73) Graphics local73 = this.anImage14.getGraphics();
			local73.setColor(Color.black);
			local73.fillRect(0, 0, this.anInt9697, this.anInt9699);
			local73.setColor(this.aColor3);
			local95 = this.anInt9697 / 2 - 152;
			local102 = this.anInt9699 / 2 - 18;
			local73.drawRect(local95, local102, 303, 33);
			local73.setColor(this.aColor2);
			local73.fillRect(local95 + 2, local102 + 2, arg1 * 3, 30);
			local73.setColor(Color.black);
			local73.drawRect(local95 + 1, local102 - -1, 301, 31);
			local73.fillRect(arg1 * 3 + local95 + 2, local102 + 2, 300 - arg1 * 3, 30);
			local73.setFont(this.bf);
			local173 = arg0 + " - " + arg1 + "%";
			local73.setColor(this.colourtext);
			local73.drawString(local173, (this.anInt9697 - this.bfm.stringWidth(local173)) / 2, this.anInt9699 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(205) Exception local205) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt9697, this.anInt9699);
			local43.setColor(this.aColor3);
			local95 = this.anInt9697 / 2 - 152;
			local102 = this.anInt9699 / 2 - 18;
			local43.drawRect(local95, local102, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local95 + 2, local102 + 2, arg1 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local95 + 1, local102 + 1, 301, 31);
			local43.fillRect(local95 + arg1 * 3 + 2, local102 + 2, 300 - arg1 * 3, 30);
			local43.setFont(this.bf);
			local173 = arg0 + " - " + arg1 + "%";
			local43.setColor(this.colourtext);
			local43.drawString(local173, (this.anInt9697 - this.bfm.stringWidth(local173)) / 2, this.anInt9699 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method7968() {
		this.anImage14 = null;
		this.aColor3 = null;
		this.barBuf = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(4) Container local4 = this.getParent();
		if (local4 != null) {
			local4.setBackground(Color.black);
		}
		this.aBoolean723 = false;
		this.setBackground(Color.black);
		@Pc(22) Thread local22 = new Thread(this);
		local22.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!a;)[B")
	private byte[] method7969(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class366 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9691];
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
				local37.write(("JAGGRAB " + local23.getFile() + arg1.aString100 + "\n\n").getBytes());
				local60 = local31.getInputStream();
			} else {
				local60 = (new URL(this.getCodeBase(), arg1.aString100)).openStream();
			}
			@Pc(73) int local73 = -1;
			@Pc(75) int local75 = 0;
			@Pc(87) int local87 = 0;
			while (true) {
				if (local5.length > local75) {
					@Pc(97) int local97 = local5.length - local75;
					if (local97 > 1000) {
						local97 = 1000;
					}
					@Pc(109) int local109 = local60.read(local5, local75, local97);
					if (local109 >= 0) {
						local75 += local109;
						@Pc(128) int local128 = local75 * 100 / local5.length;
						@Pc(130) int local130 = 0;
						if (this.lb != null && this.bar != null) {
							local130 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
						}
						if (local73 != local128 || local87 != local130) {
							try {
								if (this.method7966(local130, local128, arg1.aStringArray43[this.anInt9698])) {
									local87 = local130;
									local73 = local128;
								}
							} catch (@Pc(173) Exception local173) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local60.close();
				if (arg1.anInt9691 != arg1.anInt9690) {
					@Pc(186) byte[] local186 = new byte[arg1.anInt9690];
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
		return this.method7959(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method7970(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9697, this.anInt9699);
			this.canvas.setVisible(true);
		}
		@Pc(34) Graphics local34 = this.canvas.getGraphics();
		if (local34 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9697, this.anInt9699);
			}
			@Pc(57) Graphics local57 = this.anImage14.getGraphics();
			@Pc(62) int local62 = this.bodyLeft.getWidth(null);
			@Pc(67) int local67 = this.bodyRight.getWidth(null);
			@Pc(72) int local72 = this.bodyFill.getWidth(null);
			@Pc(77) int local77 = this.bodyLeft.getHeight(null);
			@Pc(82) int local82 = this.bodyRight.getHeight(null);
			@Pc(87) int local87 = this.bodyFill.getHeight(null);
			local57.drawImage(this.bodyLeft, this.method7958(local62) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method7961(local77) - -this.lb.boxYOffset, null);
			@Pc(135) int local135 = local62 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(148) int local148 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local67;
			@Pc(150) int local150;
			for (local150 = local135; local150 <= local148; local150 += local72) {
				local57.drawImage(this.bodyFill, this.method7958(local62) + this.lb.boxXOffset + local150, this.method7961(local87) + this.lb.boxYOffset, null);
			}
			local57.drawImage(this.bodyRight, this.method7958(local67) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method7961(local82) - -this.lb.boxYOffset, null);
			local150 = this.left.getWidth(null);
			@Pc(228) int local228 = this.left.getHeight(null);
			@Pc(233) int local233 = this.right.getWidth(null);
			@Pc(238) int local238 = this.right.getHeight(null);
			@Pc(243) int local243 = this.bottom.getHeight(null);
			@Pc(248) int local248 = this.top.getWidth(null);
			@Pc(253) int local253 = this.top.getHeight(null);
			@Pc(258) int local258 = this.bottom.getWidth(null);
			@Pc(263) int local263 = this.bar.getWidth(null);
			@Pc(268) int local268 = this.background.getWidth(null);
			@Pc(280) int local280 = this.method7958(this.lb.width) + this.lb.xOffset;
			@Pc(291) int local291 = this.method7961(this.lb.height) + this.lb.yOffset;
			local57.drawImage(this.left, local280, (this.lb.height - local228) / 2 + local291, null);
			local57.drawImage(this.right, this.lb.width + local280 - local233, (this.lb.height - local238) / 2 + local291, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local150 - local233, this.lb.height);
			}
			@Pc(354) Graphics local354 = this.barBuf.getGraphics();
			@Pc(356) int local356;
			for (local356 = 0; local356 < this.lb.width - local150 - local233; local356 += local248) {
				local354.drawImage(this.top, local356, 0, null);
			}
			for (local356 = 0; local356 < this.lb.width - local150 - local233; local356 += local258) {
				local354.drawImage(this.bottom, local356, this.lb.height - local243, null);
			}
			local356 = arg0 * (this.lb.width - local150 - local233) / 100;
			if (local356 > 0) {
				@Pc(446) Image local446 = this.createImage(local356, this.lb.height - local243 - local253);
				@Pc(450) int local450 = local446.getWidth(null);
				@Pc(453) Graphics local453 = local446.getGraphics();
				for (@Pc(457) int local457 = arg1 - local263; local457 < local450; local457 += local263) {
					local453.drawImage(this.bar, local457, 0, null);
				}
				local354.drawImage(local446, 0, local253, null);
			}
			@Pc(483) int local483 = local356;
			local356 = this.lb.width - local150 - local233 - local356;
			if (local356 > 0) {
				@Pc(511) Image local511 = this.createImage(local356, this.lb.height - local253 - local243);
				@Pc(515) int local515 = local511.getWidth(null);
				@Pc(518) Graphics local518 = local511.getGraphics();
				for (@Pc(520) int local520 = 0; local520 < local515; local520 += local268) {
					local518.drawImage(this.background, local520, 0, null);
				}
				local354.drawImage(local511, local483, local253, null);
			}
			local57.drawImage(this.barBuf, local150 + local280, local291, null);
			local57.setFont(this.bf);
			local57.setColor(this.colourtext);
			@Pc(575) String local575 = arg2 + " - " + arg0 + "%";
			local57.drawString(local575, (this.lb.width - this.bfm.stringWidth(local575)) / 2 + local280, this.lb.height / 2 + 4 + (local291 - -this.lb.textYOffset));
			local34.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(614) Exception local614) {
			this.method7964();
		}
		return true;
	}
}
