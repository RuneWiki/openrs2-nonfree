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
	private static String aString115;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private static int anInt9785 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt9782;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean771;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class369 lb;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt9783;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean773 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean772 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9784 = 0;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean774 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!b;)[B")
	private byte[] method7966(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class368 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9777];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(62) InputStream local62;
			if (arg0) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg1.aString103 + "\n\n").getBytes());
				local62 = local33.getInputStream();
			} else {
				local62 = (new URL(this.getCodeBase(), arg1.aString103)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			while (true) {
				if (local77 < local5.length) {
					@Pc(89) int local89 = local5.length - local77;
					if (local89 > 1000) {
						local89 = 1000;
					}
					@Pc(101) int local101 = local62.read(local5, local77, local89);
					if (local101 >= 0) {
						local77 += local101;
						@Pc(120) int local120 = local77 * 100 / local5.length;
						@Pc(122) int local122 = 0;
						if (this.lb != null && this.bar != null) {
							local122 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
						}
						if (local120 != local75 || local79 != local122) {
							try {
								if (this.method7975(local120, local122, arg1.aStringArray41[this.anInt9784])) {
									local75 = local120;
									local79 = local122;
								}
							} catch (@Pc(170) Exception local170) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local62.close();
				if (arg1.anInt9777 != arg1.anInt9778) {
					@Pc(195) byte[] local195 = new byte[arg1.anInt9778];
					@Pc(200) Inflater local200 = new Inflater(true);
					local200.setInput(local5);
					local5 = local195;
					local200.inflate(local195);
				}
				break;
			}
		} catch (@Pc(211) Exception local211) {
			return null;
		}
		return this.method7978(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method7967(@OriginalArg(1) String arg0) {
		if (this.aBoolean773) {
			return;
		}
		this.aBoolean773 = true;
		try {
			if (aString116 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString116 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method7968() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(BLjava/lang/String;)Ljava/awt/Image;")
	private Image method7969(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(13) InputStream local13 = this.getClass().getResourceAsStream(arg0);
			@Pc(16) byte[] local16 = new byte[1000];
			@Pc(18) int local18 = 0;
			@Pc(22) int local22;
			while ((local22 = local13.read()) != -1) {
				local16[local18++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local16);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method7970(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class370.anIntArray648[anInt9785]);
			this.aColor2 = new Color(Class370.anIntArray647[anInt9785]);
			this.colourtext = new Color(Class370.anIntArray646[anInt9785]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(88) int local88;
		@Pc(95) int local95;
		@Pc(162) String local162;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9783, this.anInt9782);
			}
			@Pc(66) Graphics local66 = this.anImage14.getGraphics();
			local66.setColor(Color.black);
			local66.fillRect(0, 0, this.anInt9783, this.anInt9782);
			local66.setColor(this.aColor3);
			local88 = this.anInt9783 / 2 - 152;
			local95 = this.anInt9782 / 2 - 18;
			local66.drawRect(local88, local95, 303, 33);
			local66.setColor(this.aColor2);
			local66.fillRect(local88 + 2, local95 + 2, arg0 * 3, 30);
			local66.setColor(Color.black);
			local66.drawRect(local88 + 1, local95 + 1, 301, 31);
			local66.fillRect(arg0 * 3 + local88 + 2, local95 + 2, 300 - arg0 * 3, 30);
			local162 = arg1 + " - " + arg0 + "%";
			local66.setFont(this.bf);
			local66.setColor(this.colourtext);
			local66.drawString(local162, (this.anInt9783 - this.bfm.stringWidth(local162)) / 2, this.anInt9782 / 2 + 4);
			local44.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(199) Exception local199) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt9783, this.anInt9782);
			local44.setColor(this.aColor3);
			local88 = this.anInt9783 / 2 - 152;
			local95 = this.anInt9782 / 2 - 18;
			local44.drawRect(local88, local95, 303, 33);
			local44.setColor(this.aColor2);
			local44.fillRect(local88 + 2, local95 - -2, arg0 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local88 + 1, local95 + 1, 301, 31);
			local44.fillRect(local88 + arg0 * 3 + 2, local95 - -2, 300 - arg0 * 3, 30);
			local162 = arg1 + " - " + arg0 + "%";
			local44.setFont(this.bf);
			local44.setColor(this.colourtext);
			local44.drawString(local162, (this.anInt9783 - this.bfm.stringWidth(local162)) / 2, this.anInt9782 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method7971(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt9782 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method7972() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean771 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method7973(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method7967("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString115 = this.getParameter("unsignedurl");
			if (aString115 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean773 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString115), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString116 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class370.aStringArray42.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt9785 = Integer.parseInt(local68);
				if (anInt9785 < 0 || Class370.anIntArray648.length <= anInt9785) {
					anInt9785 = 0;
				}
			}
			this.lb = Class370.aClass369Array1[anInt9785];
			this.anInt9783 = this.getSize().width;
			this.anInt9782 = this.getSize().height;
			@Pc(104) int local104 = 32;
			try {
				@Pc(109) int local109 = Integer.parseInt(this.getParameter("modewhat"));
				local104 += local109;
			} catch (@Pc(115) Exception local115) {
			}
			try {
				@Pc(119) String local119 = this.getParameter("lang");
				if (local119 != null) {
					this.anInt9784 = Integer.parseInt(local119);
				}
			} catch (@Pc(128) Exception local128) {
			}
			Class371.method7982(local104, Class370.aStringArray42[local37]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString108, 0, this.lb.anInt9781);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9780);
					this.bar = this.method7969(this.lb.aString113);
					this.background = this.method7969(this.lb.aString111);
					this.left = this.method7969(this.lb.aString114);
					this.right = this.method7969(this.lb.aString112);
					this.top = this.method7969(this.lb.aString105);
					this.bottom = this.method7969(this.lb.aString109);
					this.bodyLeft = this.method7969(this.lb.aString107);
					this.bodyRight = this.method7969(this.lb.aString110);
					this.bodyFill = this.method7969(this.lb.aString106);
					@Pc(283) Image[] local283 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(288) MediaTracker local288 = new MediaTracker(this);
					for (@Pc(290) int local290 = 0; local290 < local283.length; local290++) {
						local288.addImage(local283[local290], local290);
					}
					while (true) {
						try {
							local288.waitForAll();
							break;
						} catch (@Pc(311) InterruptedException local311) {
						}
					}
				} catch (@Pc(315) Throwable local315) {
					this.method7972();
				}
			}
			@Pc(320) unpack local320 = null;
			@Pc(328) byte[] local328;
			try {
				Class.forName("java.util.jar.Pack200");
				local328 = this.method7977(Class370.aClass368_2);
				if (local328 == null) {
					return;
				}
				local320 = new unpack_Sub1(local328);
			} catch (@Pc(339) Throwable local339) {
			}
			if (local320 == null) {
				local328 = this.method7977(Class370.aClass368_1);
				if (local328 == null) {
					return;
				}
				@Pc(355) unpack local355 = new unpack(local328);
				@Pc(360) ClassLoader_Sub1 local360 = new ClassLoader_Sub1(local355);
				@Pc(363) Class local363 = Class.forName("unpack");
				local360.method7965(local363, local363.getName());
				@Pc(373) Class local373 = local360.loadClass("unpackclass");
				@Pc(378) byte[] local378 = this.method7977(Class370.aClass368_3);
				if (local378 == null) {
					return;
				}
				local320 = (unpack) local373.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local378, Boolean.TRUE);
			}
			@Pc(414) ClassLoader_Sub1 local414 = new ClassLoader_Sub1(local320);
			@Pc(417) Class local417 = Class.forName("Class371");
			local414.method7965(local417, local417.getName());
			@Pc(427) Class local427 = local414.loadClass("client");
			synchronized (this) {
				if (this.aBoolean772) {
					return;
				}
				this.anApplet3 = (Applet) local427.getDeclaredConstructor().newInstance();
				local427.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean770) {
					this.anApplet3.start();
				}
				if (this.aBoolean774) {
					this.anApplet3.stop();
				}
			}
			this.method7968();
		} catch (@Pc(497) Exception local497) {
			RuntimeException_Sub2.anInt9779 = -464335972;
			if (local497 instanceof InvocationTargetException) {
				@Pc(513) Throwable local513 = ((InvocationTargetException) local497).getTargetException();
				if (local513 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7962(local497.toString(), local513, this);
			} else {
				RuntimeException_Sub2.method7962(null, local497, this);
			}
			this.method7967("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7974(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local15];
			local26.readFully(local29, 0, local15);
			local26.close();
			return local29;
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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean774 = false;
		this.aBoolean770 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method7975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class370.aClass369Array1[anInt9785] == null || this.aBoolean771 ? this.method7970(arg0, arg2) : this.method7979(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method7976(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt9783 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;I)[B")
	private byte[] method7977(@OriginalArg(0) Class368 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class371.method7980(arg0.aString102);
		} catch (@Pc(6) Exception local6) {
			this.method7967("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method7974(local4);
		if (!this.method7978(local17, arg0)) {
			local17 = this.method7966(false, arg0);
			if (local17 == null) {
				local17 = this.method7966(true, arg0);
			}
			if (local17 == null) {
				this.method7967("download");
				return null;
			}
			if (!this.method7973(local17, local4)) {
				return null;
			}
			local17 = this.method7974(local4);
			if (!this.method7978(local17, arg0)) {
				this.method7967("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!b;B)Z")
	private boolean method7978(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class368 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(23) byte[] local23 = local9.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray645[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method7967("sha");
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
		this.aBoolean772 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method7979(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9783, this.anInt9782);
			this.canvas.setVisible(true);
		}
		@Pc(42) Graphics local42 = this.canvas.getGraphics();
		if (local42 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9783, this.anInt9782);
			}
			@Pc(59) Graphics local59 = this.anImage14.getGraphics();
			@Pc(64) int local64 = this.bodyLeft.getWidth(null);
			@Pc(69) int local69 = this.bodyRight.getWidth(null);
			@Pc(74) int local74 = this.bodyFill.getWidth(null);
			@Pc(79) int local79 = this.bodyLeft.getHeight(null);
			@Pc(84) int local84 = this.bodyRight.getHeight(null);
			@Pc(89) int local89 = this.bodyFill.getHeight(null);
			local59.drawImage(this.bodyLeft, this.method7976(local64) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method7971(local79) - -this.lb.boxYOffset, null);
			@Pc(132) int local132 = this.lb.boxXOffset + local64 - this.lb.boxWidth / 2;
			@Pc(145) int local145 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local69;
			@Pc(147) int local147;
			for (local147 = local132; local147 <= local145; local147 += local74) {
				local59.drawImage(this.bodyFill, local147 + this.method7976(local64) + this.lb.boxXOffset, this.method7971(local89) - -this.lb.boxYOffset, null);
			}
			local59.drawImage(this.bodyRight, this.method7976(local69) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method7971(local84) + this.lb.boxYOffset, null);
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
			@Pc(277) int local277 = this.method7976(this.lb.width) + this.lb.xOffset;
			@Pc(288) int local288 = this.method7971(this.lb.height) + this.lb.yOffset;
			local59.drawImage(this.left, local277, (this.lb.height - local226) / 2 + local288, null);
			local59.drawImage(this.right, local277 + this.lb.width - local231, local288 + (-local236 + this.lb.height) / 2, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local231 - local147, this.lb.height);
			}
			@Pc(355) Graphics local355 = this.barBuf.getGraphics();
			@Pc(357) int local357;
			for (local357 = 0; local357 < this.lb.width - local147 - local231; local357 += local246) {
				local355.drawImage(this.top, local357, 0, null);
			}
			for (local357 = 0; local357 < this.lb.width - local147 - local231; local357 += local256) {
				local355.drawImage(this.bottom, local357, this.lb.height - local241, null);
			}
			local357 = arg0 * (this.lb.width - local147 - local231) / 100;
			if (local357 > 0) {
				@Pc(449) Image local449 = this.createImage(local357, this.lb.height - local241 - local251);
				@Pc(453) int local453 = local449.getWidth(null);
				@Pc(456) Graphics local456 = local449.getGraphics();
				for (@Pc(460) int local460 = arg2 - local261; local460 < local453; local460 += local261) {
					local456.drawImage(this.bar, local460, 0, null);
				}
				local355.drawImage(local449, 0, local251, null);
			}
			@Pc(490) int local490 = local357;
			local357 = this.lb.width - local357 - local231 - local147;
			if (local357 > 0) {
				@Pc(522) Image local522 = this.createImage(local357, this.lb.height - local241 - local251);
				@Pc(526) int local526 = local522.getWidth(null);
				@Pc(529) Graphics local529 = local522.getGraphics();
				for (@Pc(531) int local531 = 0; local531 < local526; local531 += local266) {
					local529.drawImage(this.background, local531, 0, null);
				}
				local355.drawImage(local522, local490, local251, null);
			}
			local59.drawImage(this.barBuf, local147 + local277, local288, null);
			local59.setFont(this.bf);
			local59.setColor(this.colourtext);
			@Pc(586) String local586 = arg1 + " - " + arg0 + "%";
			local59.drawString(local586, (this.lb.width - this.bfm.stringWidth(local586)) / 2 + local277, this.lb.textYOffset + 4 + this.lb.height / 2 + local288);
			local42.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(625) Exception local625) {
			this.method7972();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean770 = this.aBoolean774 = false;
		this.aBoolean772 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean770 = false;
		this.aBoolean774 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
