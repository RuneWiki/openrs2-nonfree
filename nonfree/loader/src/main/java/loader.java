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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString148;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString149;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt11463 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean812;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt11462;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!h;")
	private Class397 lb;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt11464;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean813 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean814 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt11465 = 0;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean815 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean816 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILloader!b;)Z")
	private boolean method9839(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class395 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg1.anIntArray604[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method9840("sha");
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean813 = false;
		this.aBoolean815 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method9840(@OriginalArg(0) String arg0) {
		if (this.aBoolean814) {
			return;
		}
		this.aBoolean814 = true;
		try {
			if (aString149 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString149 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean816 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString148 = this.getParameter("unsignedurl");
			if (aString148 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean814 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString148), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString149 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class396.aStringArray84.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt11463 = Integer.parseInt(local68);
				if (anInt11463 < 0 || Class396.anIntArray607.length <= anInt11463) {
					anInt11463 = 0;
				}
			}
			this.lb = Class396.aClass397Array1[anInt11463];
			this.anInt11462 = this.getSize().width;
			this.anInt11464 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt11465 = Integer.parseInt(local115);
				}
			} catch (@Pc(124) Exception local124) {
			}
			Class398.method9854(Class396.aStringArray84[local39], local100);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString144, 0, this.lb.anInt11461);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt11460);
					this.bar = this.method9841(this.lb.aString146);
					this.background = this.method9841(this.lb.aString145);
					this.left = this.method9841(this.lb.aString147);
					this.right = this.method9841(this.lb.aString143);
					this.top = this.method9841(this.lb.aString138);
					this.bottom = this.method9841(this.lb.aString139);
					this.bodyLeft = this.method9841(this.lb.aString141);
					this.bodyRight = this.method9841(this.lb.aString142);
					this.bodyFill = this.method9841(this.lb.aString140);
					@Pc(281) Image[] local281 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(286) MediaTracker local286 = new MediaTracker(this);
					for (@Pc(288) int local288 = 0; local288 < local281.length; local288++) {
						local286.addImage(local281[local288], local288);
					}
					while (true) {
						try {
							local286.waitForAll();
							break;
						} catch (@Pc(305) InterruptedException local305) {
						}
					}
				} catch (@Pc(309) Throwable local309) {
					this.method9849();
				}
			}
			@Pc(314) unpack local314 = null;
			@Pc(322) byte[] local322;
			try {
				Class.forName("java.util.jar.Pack200");
				local322 = this.method9846(Class396.aClass395_2);
				if (local322 == null) {
					return;
				}
				local314 = new unpack_Sub1(local322);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local314 == null) {
				local322 = this.method9846(Class396.aClass395_1);
				if (local322 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local322);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method9833(local358, local358.getName());
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method9846(Class396.aClass395_3);
				if (local373 == null) {
					return;
				}
				local314 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local314);
			@Pc(412) Class local412 = Class.forName("Class398");
			local409.method9833(local412, local412.getName());
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean816) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean813) {
					this.anApplet3.start();
				}
				if (this.aBoolean815) {
					this.anApplet3.stop();
				}
			}
			this.method9850();
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt11459 = 232432897;
			if (local491 instanceof InvocationTargetException) {
				@Pc(500) Throwable local500 = ((InvocationTargetException) local491).getTargetException();
				if (local500 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9834(local500, this, local491.toString());
			} else {
				RuntimeException_Sub2.method9834(local491, this, (String) null);
			}
			this.method9840("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9841(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(19) int local19 = 0;
			@Pc(23) int local23;
			while ((local23 = local6.read()) != -1) {
				local9[local19++] = (byte) local23;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method9842(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;ZI)[B")
	private byte[] method9843(@OriginalArg(0) Class395 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(13) byte[] local13 = new byte[arg0.anInt11458];
		@Pc(15) int local15 = 0;
		if (this.lb != null && this.bar != null) {
			local15 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(38) InputStream local38;
			if (arg1) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg0.aString136 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg0.aString136)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local13.length > local84) {
					@Pc(100) int local100 = local13.length - local84;
					if (local100 > 1000) {
						local100 = 1000;
					}
					@Pc(112) int local112 = local38.read(local13, local84, local100);
					if (local112 >= 0) {
						local84 += local112;
						@Pc(131) int local131 = local84 * 100 / local13.length;
						@Pc(133) int local133 = 0;
						if (this.lb != null && this.bar != null) {
							local133 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local15;
						}
						if (local82 != local131 || local133 != local86) {
							try {
								if (this.method9848(arg0.aStringArray83[this.anInt11465], local133, local131)) {
									local86 = local133;
									local82 = local131;
								}
							} catch (@Pc(175) Exception local175) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local38.close();
				if (arg0.anInt11457 != arg0.anInt11458) {
					@Pc(188) byte[] local188 = new byte[arg0.anInt11457];
					@Pc(193) Inflater local193 = new Inflater(true);
					local193.setInput(local13);
					local13 = local188;
					local193.inflate(local188);
				}
				break;
			}
		} catch (@Pc(204) Exception local204) {
			return null;
		}
		return this.method9839(local13, arg0) ? local13 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method9844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt11462, this.anInt11464);
			this.canvas.setVisible(true);
		}
		@Pc(32) Graphics local32 = this.canvas.getGraphics();
		if (local32 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11462, this.anInt11464);
			}
			@Pc(51) Graphics local51 = this.anImage14.getGraphics();
			@Pc(56) int local56 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(61) int local61 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(66) int local66 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(71) int local71 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(76) int local76 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(81) int local81 = this.bodyFill.getHeight((ImageObserver) null);
			local51.drawImage(this.bodyLeft, this.method9847(local56) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9852(local71) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(125) int local125 = this.lb.boxXOffset + local56 - this.lb.boxWidth / 2;
			@Pc(135) int local135 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(137) int local137;
			for (local137 = local125; local137 <= local135; local137 += local66) {
				local51.drawImage(this.bodyFill, local137 + this.method9847(local56) + this.lb.boxXOffset, this.method9852(local81) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local51.drawImage(this.bodyRight, this.method9847(local61) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9852(local76) - -this.lb.boxYOffset, (ImageObserver) null);
			local137 = this.left.getWidth((ImageObserver) null);
			@Pc(215) int local215 = this.left.getHeight((ImageObserver) null);
			@Pc(220) int local220 = this.right.getWidth((ImageObserver) null);
			@Pc(225) int local225 = this.right.getHeight((ImageObserver) null);
			@Pc(230) int local230 = this.bottom.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.top.getWidth((ImageObserver) null);
			@Pc(240) int local240 = this.top.getHeight((ImageObserver) null);
			@Pc(245) int local245 = this.bottom.getWidth((ImageObserver) null);
			@Pc(250) int local250 = this.bar.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.background.getWidth((ImageObserver) null);
			@Pc(266) int local266 = this.method9847(this.lb.width) + this.lb.xOffset;
			@Pc(278) int local278 = this.method9852(this.lb.height) + this.lb.yOffset;
			local51.drawImage(this.left, local266, (this.lb.height - local215) / 2 + local278, (ImageObserver) null);
			local51.drawImage(this.right, this.lb.width + local266 - local220, (-local225 + this.lb.height) / 2 + local278, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local137 - local220, this.lb.height);
			}
			@Pc(339) Graphics local339 = this.barBuf.getGraphics();
			@Pc(341) int local341;
			for (local341 = 0; local341 < this.lb.width - local220 - local137; local341 += local235) {
				local339.drawImage(this.top, local341, 0, (ImageObserver) null);
			}
			for (local341 = 0; local341 < this.lb.width - local137 - local220; local341 += local245) {
				local339.drawImage(this.bottom, local341, this.lb.height - local230, (ImageObserver) null);
			}
			local341 = (this.lb.width - local220 - local137) * arg1 / 100;
			if (local341 > 0) {
				@Pc(435) Image local435 = this.createImage(local341, this.lb.height - local230 - local240);
				@Pc(439) int local439 = local435.getWidth((ImageObserver) null);
				@Pc(442) Graphics local442 = local435.getGraphics();
				for (@Pc(447) int local447 = arg0 - local250; local447 < local439; local447 += local250) {
					local442.drawImage(this.bar, local447, 0, (ImageObserver) null);
				}
				local339.drawImage(local435, 0, local240, (ImageObserver) null);
			}
			@Pc(477) int local477 = local341;
			local341 = this.lb.width - local220 - local137 - local341;
			if (local341 > 0) {
				@Pc(505) Image local505 = this.createImage(local341, this.lb.height - local230 - local240);
				@Pc(509) int local509 = local505.getWidth((ImageObserver) null);
				@Pc(512) Graphics local512 = local505.getGraphics();
				for (@Pc(514) int local514 = 0; local514 < local509; local514 += local255) {
					local512.drawImage(this.background, local514, 0, (ImageObserver) null);
				}
				local339.drawImage(local505, local477, local240, (ImageObserver) null);
			}
			local51.drawImage(this.barBuf, local137 + local266, local278, (ImageObserver) null);
			local51.setFont(this.bf);
			local51.setColor(this.colourtext);
			@Pc(569) String local569 = arg2 + " - " + arg1 + "%";
			local51.drawString(local569, local266 + (this.lb.width - this.bfm.stringWidth(local569)) / 2, this.lb.height / 2 + 4 + (local278 - -this.lb.textYOffset));
			local32.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(609) Exception local609) {
			this.method9849();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean815 = false;
		this.aBoolean813 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method9845(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg0);
			local12.write(arg1, 0, arg1.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method9840("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!b;)[B")
	private byte[] method9846(@OriginalArg(1) Class395 arg0) {
		@Pc(10) File local10;
		try {
			local10 = Class398.method9855(arg0.aString135);
		} catch (@Pc(12) Exception local12) {
			this.method9840("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method9842(local10);
		if (!this.method9839(local23, arg0)) {
			local23 = this.method9843(arg0, false);
			if (local23 == null) {
				local23 = this.method9843(arg0, true);
			}
			if (local23 == null) {
				this.method9840("download");
				return null;
			}
			if (!this.method9845(local10, local23)) {
				return null;
			}
			local23 = this.method9842(local10);
			if (!this.method9839(local23, arg0)) {
				this.method9840("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9847(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt11462 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean816 = true;
		this.aBoolean813 = this.aBoolean815 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9848(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class396.aClass397Array1[anInt11463] == null || this.aBoolean812 ? this.method9851(arg2, arg0) : this.method9844(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method9849() {
		this.aBoolean812 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Z)V")
	private void method9850() {
		this.aColor2 = null;
		this.barBuf = null;
		this.aColor3 = null;
		this.anImage14 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	private boolean method9851(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class396.anIntArray607[anInt11463]);
			this.aColor2 = new Color(Class396.anIntArray605[anInt11463]);
			this.colourtext = new Color(Class396.anIntArray606[anInt11463]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(88) int local88;
		@Pc(95) int local95;
		@Pc(162) String local162;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11462, this.anInt11464);
			}
			@Pc(66) Graphics local66 = this.anImage14.getGraphics();
			local66.setColor(Color.black);
			local66.fillRect(0, 0, this.anInt11462, this.anInt11464);
			local66.setColor(this.aColor3);
			local88 = this.anInt11462 / 2 - 152;
			local95 = this.anInt11464 / 2 - 18;
			local66.drawRect(local88, local95, 303, 33);
			local66.setColor(this.aColor2);
			local66.fillRect(local88 + 2, local95 - -2, arg0 * 3, 30);
			local66.setColor(Color.black);
			local66.drawRect(local88 + 1, local95 + 1, 301, 31);
			local66.fillRect(local88 + arg0 * 3 + 2, local95 + 2, 300 - arg0 * 3, 30);
			local162 = arg1 + " - " + arg0 + "%";
			local66.setFont(this.bf);
			local66.setColor(this.colourtext);
			local66.drawString(local162, (this.anInt11462 - this.bfm.stringWidth(local162)) / 2, this.anInt11464 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(198) Exception local198) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt11462, this.anInt11464);
			local43.setColor(this.aColor3);
			local88 = this.anInt11462 / 2 - 152;
			local95 = this.anInt11464 / 2 - 18;
			local43.drawRect(local88, local95, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local88 + 2, local95 + 2, arg0 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local88 + 1, local95 + 1, 301, 31);
			local43.fillRect(arg0 * 3 + local88 + 2, local95 - -2, 300 - arg0 * 3, 30);
			local43.setFont(this.bf);
			local162 = arg1 + " - " + arg0 + "%";
			local43.setColor(this.colourtext);
			local43.drawString(local162, (this.anInt11462 - this.bfm.stringWidth(local162)) / 2, this.anInt11464 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9852(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt11464 - arg0) / 2 : 0;
	}
}
