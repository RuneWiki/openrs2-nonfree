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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString117;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private static int anInt9649 = 0;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt9647;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt9648;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean741;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!b;")
	private Class364 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean740 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean742 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt9650 = 0;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean743 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method7877(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9648, this.anInt9647);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9648, this.anInt9647);
			}
			@Pc(63) Graphics local63 = this.anImage14.getGraphics();
			@Pc(68) int local68 = this.bodyLeft.getWidth(null);
			@Pc(73) int local73 = this.bodyRight.getWidth(null);
			@Pc(78) int local78 = this.bodyFill.getWidth(null);
			@Pc(83) int local83 = this.bodyLeft.getHeight(null);
			@Pc(88) int local88 = this.bodyRight.getHeight(null);
			@Pc(93) int local93 = this.bodyFill.getHeight(null);
			local63.drawImage(this.bodyLeft, (this.anInt9648 - local68) / 2 - 161, (-local83 + this.anInt9647) / 2 + 214, null);
			@Pc(119) int local119;
			for (local119 = -144; local119 <= 144; local119 += 32) {
				local63.drawImage(this.bodyFill, (this.anInt9648 - local78) / 2 - local119, (-local93 + this.anInt9647) / 2 + 214, null);
			}
			local63.drawImage(this.bodyRight, (this.anInt9648 - local73) / 2 + 161, (-local88 + this.anInt9647) / 2 + 214, null);
			local119 = this.left.getWidth(null);
			@Pc(185) int local185 = this.left.getHeight(null);
			@Pc(190) int local190 = this.right.getWidth(null);
			@Pc(195) int local195 = this.right.getHeight(null);
			@Pc(200) int local200 = this.bottom.getHeight(null);
			@Pc(205) int local205 = this.top.getWidth(null);
			@Pc(210) int local210 = this.top.getHeight(null);
			@Pc(215) int local215 = this.bottom.getWidth(null);
			@Pc(220) int local220 = this.bar.getWidth(null);
			@Pc(225) int local225 = this.background.getWidth(null);
			@Pc(239) int local239 = this.lb.xOffset + (this.anInt9648 - this.lb.width) / 2;
			@Pc(254) int local254 = (this.anInt9647 - this.lb.height) / 2 + this.lb.yOffset;
			local63.drawImage(this.left, local239, (this.lb.height - local185) / 2 + local254, null);
			local63.drawImage(this.right, this.lb.width + local239 - local190, (-local195 + this.lb.height) / 2 + local254, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local190 - local119, this.lb.height);
			}
			@Pc(318) Graphics local318 = this.barBuf.getGraphics();
			@Pc(320) int local320;
			for (local320 = 0; local320 < this.lb.width - local190 - local119; local320 += local205) {
				local318.drawImage(this.top, local320, 0, null);
			}
			for (local320 = 0; local320 < this.lb.width - local190 - local119; local320 += local215) {
				local318.drawImage(this.bottom, local320, this.lb.height - local200, null);
			}
			local320 = arg2 * (this.lb.width - local190 - local119) / 100;
			if (local320 > 0) {
				@Pc(411) Image local411 = this.createImage(local320, this.lb.height - local200 - local210);
				@Pc(415) int local415 = local411.getWidth(null);
				@Pc(418) Graphics local418 = local411.getGraphics();
				for (@Pc(423) int local423 = arg1 - local220; local423 < local415; local423 += local220) {
					local418.drawImage(this.bar, local423, 0, null);
				}
				local318.drawImage(local411, 0, local210, null);
			}
			@Pc(453) int local453 = local320;
			local320 = this.lb.width - local320 - local190 - local119;
			if (local320 > 0) {
				@Pc(484) Image local484 = this.createImage(local320, this.lb.height - local210 - local200);
				@Pc(488) int local488 = local484.getWidth(null);
				@Pc(491) Graphics local491 = local484.getGraphics();
				for (@Pc(493) int local493 = 0; local493 < local488; local493 += local225) {
					local491.drawImage(this.background, local493, 0, null);
				}
				local318.drawImage(local484, local453, local210, null);
			}
			local63.drawImage(this.barBuf, local119 + local239, local254, null);
			local63.setFont(this.bf);
			local63.setColor(this.colourtext);
			@Pc(552) String local552 = arg0 + " - " + arg2 + "%";
			local63.drawString(local552, local239 + (this.lb.width - this.bfm.stringWidth(local552)) / 2, this.lb.textYOffset + 4 + local254 + this.lb.height / 2);
			local33.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(591) Exception local591) {
			this.method7883();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)Ljava/awt/Image;")
	private Image method7878(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(18) int local18 = 0;
			@Pc(22) int local22;
			while ((local22 = local6.read()) != -1) {
				local9[local18++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean740 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method7879(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		return Class366.aClass364Array1[anInt9649] == null || this.aBoolean741 ? this.method7886(arg1, arg2) : this.method7877(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!c;)[B")
	private byte[] method7880(@OriginalArg(1) Class365 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class367.method7891(arg0.aString115);
		} catch (@Pc(6) Exception local6) {
			this.method7885("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method7884(local4);
		if (!this.method7887(arg0, local17)) {
			local17 = this.method7882(false, arg0);
			if (local17 == null) {
				local17 = this.method7882(true, arg0);
			}
			if (local17 == null) {
				this.method7885("download");
				return null;
			}
			if (!this.method7881(local17, local4)) {
				return null;
			}
			local17 = this.method7884(local4);
			if (!this.method7887(arg0, local17)) {
				this.method7885("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method7881(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method7885("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!c;)[B")
	private byte[] method7882(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class365 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9645];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(30) InputStream local30;
			if (arg0) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg1.aString114 + "\n\n").getBytes());
				local30 = local43.getInputStream();
			} else {
				local30 = (new URL(this.getCodeBase(), arg1.aString114)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local76 >= local5.length) {
					local30.close();
					if (arg1.anInt9646 != arg1.anInt9645) {
						@Pc(185) byte[] local185 = new byte[arg1.anInt9646];
						@Pc(190) Inflater local190 = new Inflater(true);
						local190.setInput(local5);
						local5 = local185;
						local190.inflate(local185);
					}
					break;
				}
				@Pc(88) int local88 = local5.length - local76;
				if (local88 > 1000) {
					local88 = 1000;
				}
				@Pc(99) int local99 = local30.read(local5, local76, local88);
				if (local99 < 0) {
					throw new EOFException();
				}
				local76 += local99;
				@Pc(119) int local119 = local76 * 100 / local5.length;
				@Pc(121) int local121 = 0;
				if (this.lb != null && this.bar != null) {
					local121 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local119 != local74 || local121 != local78) {
					try {
						if (this.method7879(local121, local119, arg1.aStringArray41[this.anInt9650])) {
							local74 = local119;
							local78 = local121;
						}
					} catch (@Pc(172) Exception local172) {
					}
				}
			}
		} catch (@Pc(208) Exception local208) {
			return null;
		}
		return this.method7887(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method7883() {
		this.aBoolean741 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7884(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString116 = this.getParameter("unsignedurl");
			if (aString116 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean739 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString116), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			aString117 = this.getParameter("crashurl");
			@Pc(40) int local40 = 0;
			@Pc(44) String local44 = this.getParameter("cachesubdirid");
			if (local44 != null) {
				local40 = Integer.parseInt(local44);
				if (local40 < 0 || local40 >= Class366.aStringArray42.length) {
					local40 = 0;
				}
			}
			@Pc(69) String local69 = this.getParameter("colourid");
			if (local69 != null) {
				anInt9649 = Integer.parseInt(local69);
				if (anInt9649 < 0 || anInt9649 >= Class366.anIntArray725.length) {
					anInt9649 = 0;
				}
			}
			this.lb = Class366.aClass364Array1[anInt9649];
			this.anInt9648 = this.getSize().width;
			this.anInt9647 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt9650 = Integer.parseInt(local115);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class367.method7889(Class366.aStringArray42[local40], local100);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString110, 0, this.lb.anInt9643);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9644);
					this.bar = this.method7878(this.lb.aString105);
					this.background = this.method7878(this.lb.aString106);
					this.left = this.method7878(this.lb.aString109);
					this.right = this.method7878(this.lb.aString113);
					this.top = this.method7878(this.lb.aString111);
					this.bottom = this.method7878(this.lb.aString112);
					this.bodyLeft = this.method7878(this.lb.aString104);
					this.bodyRight = this.method7878(this.lb.aString108);
					this.bodyFill = this.method7878(this.lb.aString107);
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
					this.method7883();
				}
			}
			@Pc(315) unpack local315 = null;
			@Pc(323) byte[] local323;
			try {
				Class.forName("java.util.jar.Pack200");
				local323 = this.method7880(Class366.aClass365_2);
				if (local323 == null) {
					return;
				}
				local315 = new unpack_Sub1(local323);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local315 == null) {
				local323 = this.method7880(Class366.aClass365_1);
				if (local323 == null) {
					return;
				}
				@Pc(349) unpack local349 = new unpack(local323);
				@Pc(354) ClassLoader_Sub1 local354 = new ClassLoader_Sub1(local349);
				@Pc(357) Class local357 = Class.forName("unpack");
				local354.method7873(local357.getName(), local357);
				@Pc(367) Class local367 = local354.loadClass("unpackclass");
				@Pc(372) byte[] local372 = this.method7880(Class366.aClass365_3);
				if (local372 == null) {
					return;
				}
				local315 = (unpack) local367.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local372, Boolean.TRUE);
			}
			@Pc(406) ClassLoader_Sub1 local406 = new ClassLoader_Sub1(local315);
			@Pc(409) Class local409 = Class.forName("Class367");
			local406.method7873(local409.getName(), local409);
			@Pc(419) Class local419 = local406.loadClass("client");
			synchronized (this) {
				if (this.aBoolean740) {
					return;
				}
				this.anApplet3 = (Applet) local419.getDeclaredConstructor().newInstance();
				local419.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean743) {
					this.anApplet3.start();
				}
				if (this.aBoolean742) {
					this.anApplet3.stop();
				}
			}
			this.method7888();
		} catch (@Pc(489) Exception local489) {
			RuntimeException_Sub2.anInt9642 = 753637750;
			if (local489 instanceof InvocationTargetException) {
				@Pc(505) Throwable local505 = ((InvocationTargetException) local489).getTargetException();
				if (local505 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7871(this, local505, local489.toString());
			} else {
				RuntimeException_Sub2.method7871(this, local489, null);
			}
			this.method7885("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean743 = this.aBoolean742 = false;
		this.aBoolean740 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method7885(@OriginalArg(1) String arg0) {
		if (this.aBoolean739) {
			return;
		}
		this.aBoolean739 = true;
		try {
			if (aString117 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString117 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;)Z")
	private boolean method7886(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class366.anIntArray725[anInt9649]);
			this.aColor3 = new Color(Class366.anIntArray726[anInt9649]);
			this.colourtext = new Color(Class366.anIntArray724[anInt9649]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(169) String local169;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9648, this.anInt9647);
			}
			@Pc(70) Graphics local70 = this.anImage14.getGraphics();
			local70.setColor(Color.black);
			local70.fillRect(0, 0, this.anInt9648, this.anInt9647);
			local70.setColor(this.aColor2);
			local92 = this.anInt9648 / 2 - 152;
			local99 = this.anInt9647 / 2 - 18;
			local70.drawRect(local92, local99, 303, 33);
			local70.setColor(this.aColor3);
			local70.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local70.setColor(Color.black);
			local70.drawRect(local92 + 1, local99 + 1, 301, 31);
			local70.fillRect(local92 + arg0 * 3 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local70.setFont(this.bf);
			local169 = arg1 + " - " + arg0 + "%";
			local70.setColor(this.colourtext);
			local70.drawString(local169, (this.anInt9648 - this.bfm.stringWidth(local169)) / 2, this.anInt9647 / 2 + 4);
			local50.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(202) Exception local202) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt9648, this.anInt9647);
			local50.setColor(this.aColor2);
			local92 = this.anInt9648 / 2 - 152;
			local99 = this.anInt9647 / 2 - 18;
			local50.drawRect(local92, local99, 303, 33);
			local50.setColor(this.aColor3);
			local50.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local92 + 1, local99 - -1, 301, 31);
			local50.fillRect(arg0 * 3 + local92 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local169 = arg1 + " - " + arg0 + "%";
			local50.setFont(this.bf);
			local50.setColor(this.colourtext);
			local50.drawString(local169, (this.anInt9648 - this.bfm.stringWidth(local169)) / 2, this.anInt9647 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!c;[B)Z")
	private boolean method7887(@OriginalArg(1) Class365 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(26) byte[] local26 = local10.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (arg0.anIntArray723[local28] != local26[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method7885("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method7888() {
		this.barBuf = null;
		this.aColor3 = null;
		this.aColor2 = null;
		this.anImage14 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean743 = false;
		this.aBoolean742 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean742 = false;
		this.aBoolean743 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}
}
