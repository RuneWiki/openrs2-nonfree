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
	private static String aString130;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString131;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private static int anInt10571 = 0;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean893;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10569;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!f;")
	private Class386 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt10570;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean892 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt10568 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean895 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean894 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean896 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!b;)[B")
	private byte[] method8691(@OriginalArg(1) Class383 arg0) {
		@Pc(14) File local14;
		try {
			local14 = Class385.method8685(arg0.aString116);
		} catch (@Pc(16) Exception local16) {
			this.method8693("nocache");
			return null;
		}
		@Pc(27) byte[] local27 = this.method8697(local14);
		if (!this.method8704(arg0, local27)) {
			local27 = this.method8699(arg0, false);
			if (local27 == null) {
				local27 = this.method8699(arg0, true);
			}
			if (local27 == null) {
				this.method8693("download");
				return null;
			}
			if (!this.method8702(local27, local14)) {
				return null;
			}
			local27 = this.method8697(local14);
			if (!this.method8704(arg0, local27)) {
				this.method8693("mismatch");
				return null;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZI)I")
	private int method8692(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10570 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method8693(@OriginalArg(1) String arg0) {
		if (this.aBoolean892) {
			return;
		}
		this.aBoolean892 = true;
		try {
			if (aString130 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString130 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString131 = this.getParameter("unsignedurl");
			if (aString131 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean892 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString131), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString130 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class384.aStringArray44.length) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10571 = Integer.parseInt(local64);
				if (anInt10571 < 0 || anInt10571 >= Class384.anIntArray638.length) {
					anInt10571 = 0;
				}
			}
			this.lb = Class384.aClass386Array1[anInt10571];
			this.anInt10569 = this.getSize().width;
			this.anInt10570 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt10568 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class385.method8686(Class384.aStringArray44[local38], local99);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString127, 0, this.lb.anInt10567);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10566);
					this.bar = this.method8700(this.lb.aString129);
					this.background = this.method8700(this.lb.aString126);
					this.left = this.method8700(this.lb.aString123);
					this.right = this.method8700(this.lb.aString124);
					this.top = this.method8700(this.lb.aString122);
					this.bottom = this.method8700(this.lb.aString121);
					this.bodyLeft = this.method8700(this.lb.aString120);
					this.bodyRight = this.method8700(this.lb.aString125);
					this.bodyFill = this.method8700(this.lb.aString128);
					@Pc(279) Image[] local279 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(284) MediaTracker local284 = new MediaTracker(this);
					for (@Pc(286) int local286 = 0; local286 < local279.length; local286++) {
						local284.addImage(local279[local286], local286);
					}
					while (true) {
						try {
							local284.waitForAll();
							break;
						} catch (@Pc(307) InterruptedException local307) {
						}
					}
				} catch (@Pc(311) Throwable local311) {
					this.method8696();
				}
			}
			@Pc(316) unpack local316 = null;
			@Pc(324) byte[] local324;
			try {
				Class.forName("java.util.jar.Pack200");
				local324 = this.method8691(Class384.aClass383_2);
				if (local324 == null) {
					return;
				}
				local316 = new unpack_Sub1(local324);
			} catch (@Pc(335) Throwable local335) {
			}
			if (local316 == null) {
				local324 = this.method8691(Class384.aClass383_1);
				if (local324 == null) {
					return;
				}
				@Pc(351) unpack local351 = new unpack(local324);
				@Pc(356) ClassLoader_Sub1 local356 = new ClassLoader_Sub1(local351);
				@Pc(359) Class local359 = Class.forName("unpack");
				local356.method8679(local359.getName(), local359);
				@Pc(369) Class local369 = local356.loadClass("unpackclass");
				@Pc(374) byte[] local374 = this.method8691(Class384.aClass383_3);
				if (local374 == null) {
					return;
				}
				local316 = (unpack) local369.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local374, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local316);
			@Pc(412) Class local412 = Class.forName("Class385");
			local409.method8679(local412.getName(), local412);
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean894) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean895) {
					this.anApplet3.start();
				}
				if (this.aBoolean896) {
					this.anApplet3.stop();
				}
			}
			this.method8701();
		} catch (@Pc(492) Exception local492) {
			RuntimeException_Sub2.anInt10564 = 1742289422;
			if (local492 instanceof InvocationTargetException) {
				@Pc(501) Throwable local501 = ((InvocationTargetException) local492).getTargetException();
				if (local501 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8684(this, local501, local492.toString());
			} else {
				RuntimeException_Sub2.method8684(this, local492, null);
			}
			this.method8693("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8694(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10569, this.anInt10570);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10569, this.anInt10570);
			}
			@Pc(56) Graphics local56 = this.anImage14.getGraphics();
			@Pc(61) int local61 = this.bodyLeft.getWidth(null);
			@Pc(66) int local66 = this.bodyRight.getWidth(null);
			@Pc(71) int local71 = this.bodyFill.getWidth(null);
			@Pc(76) int local76 = this.bodyLeft.getHeight(null);
			@Pc(81) int local81 = this.bodyRight.getHeight(null);
			@Pc(86) int local86 = this.bodyFill.getHeight(null);
			local56.drawImage(this.bodyLeft, this.method8698(local61) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8692(local76) + this.lb.boxYOffset, null);
			@Pc(128) int local128 = this.lb.boxXOffset + local61 - this.lb.boxWidth / 2;
			@Pc(138) int local138 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(140) int local140;
			for (local140 = local128; local140 <= local138; local140 += local71) {
				local56.drawImage(this.bodyFill, this.method8698(local61) + this.lb.boxXOffset + local140, this.method8692(local86) + this.lb.boxYOffset, null);
			}
			local56.drawImage(this.bodyRight, this.method8698(local66) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8692(local81) - -this.lb.boxYOffset, null);
			local140 = this.left.getWidth(null);
			@Pc(219) int local219 = this.left.getHeight(null);
			@Pc(224) int local224 = this.right.getWidth(null);
			@Pc(229) int local229 = this.right.getHeight(null);
			@Pc(234) int local234 = this.bottom.getHeight(null);
			@Pc(239) int local239 = this.top.getWidth(null);
			@Pc(244) int local244 = this.top.getHeight(null);
			@Pc(249) int local249 = this.bottom.getWidth(null);
			@Pc(254) int local254 = this.bar.getWidth(null);
			@Pc(259) int local259 = this.background.getWidth(null);
			@Pc(271) int local271 = this.method8698(this.lb.width) + this.lb.xOffset;
			@Pc(282) int local282 = this.method8692(this.lb.height) + this.lb.yOffset;
			local56.drawImage(this.left, local271, local282 + (this.lb.height - local219) / 2, null);
			local56.drawImage(this.right, local271 + this.lb.width - local224, (-local229 + this.lb.height) / 2 + local282, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local140 - local224, this.lb.height);
			}
			@Pc(347) Graphics local347 = this.barBuf.getGraphics();
			@Pc(349) int local349;
			for (local349 = 0; local349 < this.lb.width - local224 - local140; local349 += local239) {
				local347.drawImage(this.top, local349, 0, null);
			}
			for (local349 = 0; local349 < this.lb.width - local224 - local140; local349 += local249) {
				local347.drawImage(this.bottom, local349, this.lb.height - local234, null);
			}
			local349 = (this.lb.width - local224 - local140) * arg2 / 100;
			if (local349 > 0) {
				@Pc(436) Image local436 = this.createImage(local349, this.lb.height - local244 - local234);
				@Pc(440) int local440 = local436.getWidth(null);
				@Pc(443) Graphics local443 = local436.getGraphics();
				for (@Pc(447) int local447 = arg0 - local254; local447 < local440; local447 += local254) {
					local443.drawImage(this.bar, local447, 0, null);
				}
				local347.drawImage(local436, 0, local244, null);
			}
			@Pc(473) int local473 = local349;
			local349 = this.lb.width - local349 - local140 - local224;
			if (local349 > 0) {
				@Pc(503) Image local503 = this.createImage(local349, this.lb.height - local244 - local234);
				@Pc(507) int local507 = local503.getWidth(null);
				@Pc(510) Graphics local510 = local503.getGraphics();
				for (@Pc(512) int local512 = 0; local512 < local507; local512 += local259) {
					local510.drawImage(this.background, local512, 0, null);
				}
				local347.drawImage(local503, local473, local244, null);
			}
			local56.drawImage(this.barBuf, local140 + local271, local282, null);
			local56.setFont(this.bf);
			local56.setColor(this.colourtext);
			@Pc(571) String local571 = arg1 + " - " + arg2 + "%";
			local56.drawString(local571, (this.lb.width - this.bfm.stringWidth(local571)) / 2 + local271, this.lb.height / 2 + local282 + (4 - -this.lb.textYOffset));
			local33.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(610) Exception local610) {
			this.method8696();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	private boolean method8695(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class384.anIntArray638[anInt10571]);
			this.aColor2 = new Color(Class384.anIntArray637[anInt10571]);
			this.colourtext = new Color(Class384.anIntArray636[anInt10571]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(87) int local87;
		@Pc(94) int local94;
		@Pc(166) String local166;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10569, this.anInt10570);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			local65.setColor(Color.black);
			local65.fillRect(0, 0, this.anInt10569, this.anInt10570);
			local65.setColor(this.aColor3);
			local87 = this.anInt10569 / 2 - 152;
			local94 = this.anInt10570 / 2 - 18;
			local65.drawRect(local87, local94, 303, 33);
			local65.setColor(this.aColor2);
			local65.fillRect(local87 + 2, local94 + 2, arg0 * 3, 30);
			local65.setColor(Color.black);
			local65.drawRect(local87 + 1, local94 + 1, 301, 31);
			local65.fillRect(local87 + arg0 * 3 + 2, local94 + 2, 300 - arg0 * 3, 30);
			local65.setFont(this.bf);
			local166 = arg1 + " - " + arg0 + "%";
			local65.setColor(this.colourtext);
			local65.drawString(local166, (this.anInt10569 - this.bfm.stringWidth(local166)) / 2, this.anInt10570 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(198) Exception local198) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10569, this.anInt10570);
			local43.setColor(this.aColor3);
			local87 = this.anInt10569 / 2 - 152;
			local94 = this.anInt10570 / 2 - 18;
			local43.drawRect(local87, local94, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local87 + 2, local94 + 2, arg0 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local87 + 1, local94 + 1, 301, 31);
			local43.fillRect(arg0 * 3 + local87 + 2, local94 + 2, 300 - arg0 * 3, 30);
			local166 = arg1 + " - " + arg0 + "%";
			local43.setFont(this.bf);
			local43.setColor(this.colourtext);
			local43.drawString(local166, (this.anInt10569 - this.bfm.stringWidth(local166)) / 2, this.anInt10570 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8696() {
		this.aBoolean893 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method8697(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8698(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10569 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;ZI)[B")
	private byte[] method8699(@OriginalArg(0) Class383 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10563];
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
				local38.write(("JAGGRAB " + local24.getFile() + arg0.aString115 + "\n\n").getBytes());
				local61 = local32.getInputStream();
			} else {
				local61 = (new URL(this.getCodeBase(), arg0.aString115)).openStream();
			}
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = 0;
			while (true) {
				if (local76 < local5.length) {
					@Pc(92) int local92 = local5.length - local76;
					if (local92 > 1000) {
						local92 = 1000;
					}
					@Pc(103) int local103 = local61.read(local5, local76, local92);
					if (local103 >= 0) {
						local76 += local103;
						@Pc(124) int local124 = local76 * 100 / local5.length;
						@Pc(126) int local126 = 0;
						if (this.lb != null && this.bar != null) {
							local126 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local124 != local74 || local126 != local78) {
							try {
								if (this.method8703(arg0.aStringArray43[this.anInt10568], local126, local124)) {
									local78 = local126;
									local74 = local124;
								}
							} catch (@Pc(174) Exception local174) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local61.close();
				if (arg0.anInt10563 != arg0.anInt10562) {
					@Pc(192) byte[] local192 = new byte[arg0.anInt10562];
					@Pc(197) Inflater local197 = new Inflater(true);
					local197.setInput(local5);
					local197.inflate(local192);
					local5 = local192;
				}
				break;
			}
		} catch (@Pc(208) Exception local208) {
			return null;
		}
		return this.method8704(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean894 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method8700(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean896 = true;
		this.aBoolean895 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean896 = false;
		this.aBoolean895 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean895 = this.aBoolean896 = false;
		this.aBoolean894 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method8701() {
		this.aColor2 = null;
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method8702(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(26) IOException local26) {
			this.method8693("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method8703(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class384.aClass386Array1[anInt10571] == null || this.aBoolean893 ? this.method8695(arg2, arg0) : this.method8694(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!b;[B)Z")
	private boolean method8704(@OriginalArg(1) Class383 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local16[local24] != arg0.anIntArray635[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method8693("sha");
			return false;
		}
	}
}
