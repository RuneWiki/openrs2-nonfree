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
	private static String aString282;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString283;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private static int anInt10354 = 0;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt10351;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10352;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class370 lb;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean733;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean730 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean731 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean732 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10353 = 0;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method8196(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10352 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString282 = this.getParameter("unsignedurl");
			if (aString282 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean732 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString282), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString283 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class369.aStringArray54.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt10354 = Integer.parseInt(local62);
				if (anInt10354 < 0 || Class369.anIntArray605.length <= anInt10354) {
					anInt10354 = 0;
				}
			}
			this.lb = Class369.aClass370Array1[anInt10354];
			this.anInt10351 = this.getSize().width;
			this.anInt10352 = this.getSize().height;
			@Pc(94) int local94 = 32;
			try {
				@Pc(99) int local99 = Integer.parseInt(this.getParameter("modewhat"));
				local94 += local99;
			} catch (@Pc(105) Exception local105) {
			}
			try {
				@Pc(109) String local109 = this.getParameter("lang");
				if (local109 != null) {
					this.anInt10353 = Integer.parseInt(local109);
				}
			} catch (@Pc(118) Exception local118) {
			}
			Class371.method8212(local94, Class369.aStringArray54[local36]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString274, 0, this.lb.anInt10350);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10349);
					this.bar = this.method8206(this.lb.aString279);
					this.background = this.method8206(this.lb.aString280);
					this.left = this.method8206(this.lb.aString275);
					this.right = this.method8206(this.lb.aString273);
					this.top = this.method8206(this.lb.aString278);
					this.bottom = this.method8206(this.lb.aString272);
					this.bodyLeft = this.method8206(this.lb.aString277);
					this.bodyRight = this.method8206(this.lb.aString281);
					this.bodyFill = this.method8206(this.lb.aString276);
					@Pc(274) Image[] local274 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(279) MediaTracker local279 = new MediaTracker(this);
					for (@Pc(281) int local281 = 0; local281 < local274.length; local281++) {
						local279.addImage(local274[local281], local281);
					}
					while (true) {
						try {
							local279.waitForAll();
							break;
						} catch (@Pc(302) InterruptedException local302) {
						}
					}
				} catch (@Pc(306) Throwable local306) {
					this.method8198();
				}
			}
			@Pc(311) unpack local311 = null;
			@Pc(319) byte[] local319;
			try {
				Class.forName("java.util.jar.Pack200");
				local319 = this.method8208(Class369.aClass368_2);
				if (local319 == null) {
					return;
				}
				local311 = new unpack_Sub1(local319);
			} catch (@Pc(330) Throwable local330) {
			}
			if (local311 == null) {
				local319 = this.method8208(Class369.aClass368_1);
				if (local319 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local319);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method8192(local355.getName(), local355);
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method8208(Class369.aClass368_3);
				if (local370 == null) {
					return;
				}
				local311 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(405) ClassLoader_Sub1 local405 = new ClassLoader_Sub1(local311);
			@Pc(408) Class local408 = Class.forName("Class371");
			local405.method8192(local408.getName(), local408);
			@Pc(418) Class local418 = local405.loadClass("client");
			synchronized (this) {
				if (this.aBoolean729) {
					return;
				}
				this.anApplet3 = (Applet) local418.getDeclaredConstructor().newInstance();
				local418.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean730) {
					this.anApplet3.start();
				}
				if (this.aBoolean731) {
					this.anApplet3.stop();
				}
			}
			this.method8207();
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt10346 = -190459240;
			if (local488 instanceof InvocationTargetException) {
				@Pc(497) Throwable local497 = ((InvocationTargetException) local488).getTargetException();
				if (local497 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8189(this, local497, local488.toString());
			} else {
				RuntimeException_Sub2.method8189(this, local488, null);
			}
			this.method8209("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method8197(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(33) byte[] local33 = new byte[local8];
			local30.readFully(local33, 0, local8);
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8198() {
		this.bf = null;
		this.aBoolean733 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method8199(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class369.anIntArray605[anInt10354]);
			this.aColor3 = new Color(Class369.anIntArray603[anInt10354]);
			this.colourtext = new Color(Class369.anIntArray604[anInt10354]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(85) int local85;
		@Pc(92) int local92;
		@Pc(163) String local163;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10351, this.anInt10352);
			}
			@Pc(63) Graphics local63 = this.anImage14.getGraphics();
			local63.setColor(Color.black);
			local63.fillRect(0, 0, this.anInt10351, this.anInt10352);
			local63.setColor(this.aColor2);
			local85 = this.anInt10351 / 2 - 152;
			local92 = this.anInt10352 / 2 - 18;
			local63.drawRect(local85, local92, 303, 33);
			local63.setColor(this.aColor3);
			local63.fillRect(local85 + 2, local92 - -2, arg0 * 3, 30);
			local63.setColor(Color.black);
			local63.drawRect(local85 + 1, local92 - -1, 301, 31);
			local63.fillRect(arg0 * 3 + local85 + 2, local92 + 2, 300 - arg0 * 3, 30);
			local63.setFont(this.bf);
			local163 = arg1 + " - " + arg0 + "%";
			local63.setColor(this.colourtext);
			local63.drawString(local163, (this.anInt10351 - this.bfm.stringWidth(local163)) / 2, this.anInt10352 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(196) Exception local196) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10351, this.anInt10352);
			local43.setColor(this.aColor2);
			local85 = this.anInt10351 / 2 - 152;
			local92 = this.anInt10352 / 2 - 18;
			local43.drawRect(local85, local92, 303, 33);
			local43.setColor(this.aColor3);
			local43.fillRect(local85 + 2, local92 + 2, arg0 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local85 + 1, local92 + 1, 301, 31);
			local43.fillRect(arg0 * 3 + local85 + 2, local92 + 2, 300 - arg0 * 3, 30);
			local163 = arg1 + " - " + arg0 + "%";
			local43.setFont(this.bf);
			local43.setColor(this.colourtext);
			local43.drawString(local163, (this.anInt10351 - this.bfm.stringWidth(local163)) / 2, this.anInt10352 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method8200(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method8209("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!b;I)Z")
	private boolean method8201(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class368 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg0);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray602[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method8209("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method8202(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10351 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method8203(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10351, this.anInt10352);
			this.canvas.setVisible(true);
		}
		@Pc(42) Graphics local42 = this.canvas.getGraphics();
		if (local42 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10351, this.anInt10352);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			@Pc(70) int local70 = this.bodyLeft.getWidth(null);
			@Pc(75) int local75 = this.bodyRight.getWidth(null);
			@Pc(80) int local80 = this.bodyFill.getWidth(null);
			@Pc(85) int local85 = this.bodyLeft.getHeight(null);
			@Pc(90) int local90 = this.bodyRight.getHeight(null);
			@Pc(95) int local95 = this.bodyFill.getHeight(null);
			local65.drawImage(this.bodyLeft, this.method8202(local70) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8196(local85) + this.lb.boxYOffset, null);
			@Pc(137) int local137 = local70 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(151) int local151 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local75;
			@Pc(153) int local153;
			for (local153 = local137; local153 <= local151; local153 += local80) {
				local65.drawImage(this.bodyFill, local153 + this.method8202(local70) + this.lb.boxXOffset, this.method8196(local95) - -this.lb.boxYOffset, null);
			}
			local65.drawImage(this.bodyRight, this.method8202(local75) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8196(local90) - -this.lb.boxYOffset, null);
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
			@Pc(279) int local279 = this.method8202(this.lb.width) + this.lb.xOffset;
			@Pc(290) int local290 = this.method8196(this.lb.height) + this.lb.yOffset;
			local65.drawImage(this.left, local279, (this.lb.height - local227) / 2 + local290, null);
			local65.drawImage(this.right, local279 + this.lb.width - local232, local290 + (this.lb.height + -local237) / 2, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local153 - local232, this.lb.height);
			}
			@Pc(355) Graphics local355 = this.barBuf.getGraphics();
			@Pc(357) int local357;
			for (local357 = 0; local357 < this.lb.width - local232 - local153; local357 += local247) {
				local355.drawImage(this.top, local357, 0, null);
			}
			for (local357 = 0; local357 < this.lb.width - local232 - local153; local357 += local257) {
				local355.drawImage(this.bottom, local357, this.lb.height - local242, null);
			}
			local357 = arg2 * (this.lb.width - local232 - local153) / 100;
			if (local357 > 0) {
				@Pc(448) Image local448 = this.createImage(local357, this.lb.height - local252 - local242);
				@Pc(452) int local452 = local448.getWidth(null);
				@Pc(455) Graphics local455 = local448.getGraphics();
				for (@Pc(460) int local460 = arg1 - local262; local460 < local452; local460 += local262) {
					local455.drawImage(this.bar, local460, 0, null);
				}
				local355.drawImage(local448, 0, local252, null);
			}
			@Pc(490) int local490 = local357;
			local357 = this.lb.width - local153 - local232 - local357;
			if (local357 > 0) {
				@Pc(517) Image local517 = this.createImage(local357, this.lb.height - local242 - local252);
				@Pc(521) int local521 = local517.getWidth(null);
				@Pc(524) Graphics local524 = local517.getGraphics();
				for (@Pc(526) int local526 = 0; local526 < local521; local526 += local267) {
					local524.drawImage(this.background, local526, 0, null);
				}
				local355.drawImage(local517, local490, local252, null);
			}
			local65.drawImage(this.barBuf, local153 + local279, local290, null);
			local65.setFont(this.bf);
			local65.setColor(this.colourtext);
			@Pc(585) String local585 = arg0 + " - " + arg2 + "%";
			local65.drawString(local585, local279 + (this.lb.width - this.bfm.stringWidth(local585)) / 2, this.lb.textYOffset + local290 + (this.lb.height / 2 - -4));
			local42.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(623) Exception local623) {
			this.method8198();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;ZZ)[B")
	private byte[] method8204(@OriginalArg(0) Class368 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10347];
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
				local45.write(("JAGGRAB " + local31.getFile() + arg0.aString270 + "\n\n").getBytes());
				local68 = local39.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg0.aString270)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local83 >= local5.length) {
					local68.close();
					if (arg0.anInt10347 != arg0.anInt10348) {
						@Pc(195) byte[] local195 = new byte[arg0.anInt10348];
						@Pc(200) Inflater local200 = new Inflater(true);
						local200.setInput(local5);
						local200.inflate(local195);
						local5 = local195;
					}
					break;
				}
				@Pc(99) int local99 = local5.length - local83;
				if (local99 > 1000) {
					local99 = 1000;
				}
				@Pc(112) int local112 = local68.read(local5, local83, local99);
				if (local112 < 0) {
					throw new EOFException();
				}
				local83 += local112;
				@Pc(132) int local132 = local83 * 100 / local5.length;
				@Pc(134) int local134 = 0;
				if (this.lb != null && this.bar != null) {
					local134 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local132 != local81 || local85 != local134) {
					try {
						if (this.method8205(local134, arg0.aStringArray53[this.anInt10353], local132)) {
							local85 = local134;
							local81 = local132;
						}
					} catch (@Pc(182) Exception local182) {
					}
				}
			}
		} catch (@Pc(211) Exception local211) {
			return null;
		}
		return this.method8201(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean729 = true;
		this.aBoolean730 = this.aBoolean731 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BILjava/lang/String;I)Z")
	private boolean method8205(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class369.aClass370Array1[anInt10354] == null || this.aBoolean733 ? this.method8199(arg2, arg1) : this.method8203(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean730 = false;
		this.aBoolean731 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8206(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(19) int local19 = 0;
			@Pc(24) int local24;
			while ((local24 = local6.read()) != -1) {
				local9[local19++] = (byte) local24;
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
		this.aBoolean729 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8207() {
		this.aColor3 = null;
		this.aColor2 = null;
		this.anImage14 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean731 = false;
		this.aBoolean730 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;I)[B")
	private byte[] method8208(@OriginalArg(0) Class368 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class371.method8210(arg0.aString271);
		} catch (@Pc(6) Exception local6) {
			this.method8209("nocache");
			return null;
		}
		@Pc(19) byte[] local19 = this.method8197(local4);
		if (!this.method8201(local19, arg0)) {
			local19 = this.method8204(arg0, false);
			if (local19 == null) {
				local19 = this.method8204(arg0, true);
			}
			if (local19 == null) {
				this.method8209("download");
				return null;
			}
			if (!this.method8200(local4, local19)) {
				return null;
			}
			local19 = this.method8197(local4);
			if (!this.method8201(local19, arg0)) {
				this.method8209("mismatch");
				return null;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method8209(@OriginalArg(1) String arg0) {
		if (this.aBoolean732) {
			return;
		}
		this.aBoolean732 = true;
		try {
			if (aString283 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString283 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}
}
