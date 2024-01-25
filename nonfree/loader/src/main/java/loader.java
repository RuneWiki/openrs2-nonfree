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
	private static String aString133;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString134;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private static int anInt11233 = 0;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/awt/Image;")
	private Image anImage15;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt11230;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt11232;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!f;")
	private Class398 lb;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean771;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean767 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt11231 = 0;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean768 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean769 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Z")
	private boolean aBoolean770 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!e;)[B")
	private byte[] method9336(@OriginalArg(1) Class397 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class399.method9352(arg0.aString121);
		} catch (@Pc(14) Exception local14) {
			this.method9344("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method9349(local4);
		if (!this.method9340(arg0, local25)) {
			local25 = this.method9347(arg0, false);
			if (local25 == null) {
				local25 = this.method9347(arg0, true);
			}
			if (local25 == null) {
				this.method9344("download");
				return null;
			}
			if (!this.method9341(local25, local4)) {
				return null;
			}
			local25 = this.method9349(local4);
			if (!this.method9340(arg0, local25)) {
				this.method9344("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9337() {
		this.aBoolean771 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IB)Z")
	private boolean method9338(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class396.anIntArray830[anInt11233]);
			this.aColor2 = new Color(Class396.anIntArray831[anInt11233]);
			this.colourtext = new Color(Class396.anIntArray832[anInt11233]);
		}
		@Pc(53) Graphics local53 = this.getGraphics();
		if (local53 == null) {
			this.repaint();
			return false;
		}
		@Pc(97) int local97;
		@Pc(104) int local104;
		@Pc(175) String local175;
		try {
			if (this.anImage15 == null) {
				this.anImage15 = this.createImage(this.anInt11232, this.anInt11230);
			}
			@Pc(75) Graphics local75 = this.anImage15.getGraphics();
			local75.setColor(Color.black);
			local75.fillRect(0, 0, this.anInt11232, this.anInt11230);
			local75.setColor(this.aColor3);
			local97 = this.anInt11232 / 2 - 152;
			local104 = this.anInt11230 / 2 - 18;
			local75.drawRect(local97, local104, 303, 33);
			local75.setColor(this.aColor2);
			local75.fillRect(local97 + 2, local104 + 2, arg1 * 3, 30);
			local75.setColor(Color.black);
			local75.drawRect(local97 + 1, local104 - -1, 301, 31);
			local75.fillRect(local97 + arg1 * 3 + 2, local104 + 2, 300 - arg1 * 3, 30);
			local75.setFont(this.bf);
			local175 = arg0 + " - " + arg1 + "%";
			local75.setColor(this.colourtext);
			local75.drawString(local175, (this.anInt11232 - this.bfm.stringWidth(local175)) / 2, this.anInt11230 / 2 + 4);
			local53.drawImage(this.anImage15, 0, 0, (ImageObserver) null);
		} catch (@Pc(208) Exception local208) {
			local53.setColor(Color.black);
			local53.fillRect(0, 0, this.anInt11232, this.anInt11230);
			local53.setColor(this.aColor3);
			local97 = this.anInt11232 / 2 - 152;
			local104 = this.anInt11230 / 2 - 18;
			local53.drawRect(local97, local104, 303, 33);
			local53.setColor(this.aColor2);
			local53.fillRect(local97 + 2, local104 - -2, arg1 * 3, 30);
			local53.setColor(Color.black);
			local53.drawRect(local97 + 1, local104 - -1, 301, 31);
			local53.fillRect(local97 + arg1 * 3 + 2, local104 - -2, 300 - arg1 * 3, 30);
			local53.setFont(this.bf);
			local175 = arg0 + " - " + arg1 + "%";
			local53.setColor(this.colourtext);
			local53.drawString(local175, (this.anInt11232 - this.bfm.stringWidth(local175)) / 2, this.anInt11230 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)Ljava/awt/Image;")
	private Image method9339(@OriginalArg(1) String arg0) throws IOException {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;[B)Z")
	private boolean method9340(@OriginalArg(1) Class397 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg0.anIntArray833[local24] != local17[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method9344("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method9341(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method9344("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(B)V")
	private void method9342() {
		this.anImage15 = null;
		this.barBuf = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString134 = this.getParameter("unsignedurl");
			if (aString134 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean767 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString134), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString133 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class396.aStringArray48.length) {
					local37 = 0;
				}
			}
			@Pc(65) String local65 = this.getParameter("colourid");
			if (local65 != null) {
				anInt11233 = Integer.parseInt(local65);
				if (anInt11233 < 0 || anInt11233 >= Class396.anIntArray830.length) {
					anInt11233 = 0;
				}
			}
			this.lb = Class396.aClass398Array1[anInt11233];
			this.anInt11232 = this.getSize().width;
			this.anInt11230 = this.getSize().height;
			@Pc(102) int local102 = 32;
			try {
				@Pc(107) int local107 = Integer.parseInt(this.getParameter("modewhat"));
				local102 += local107;
			} catch (@Pc(113) Exception local113) {
			}
			try {
				@Pc(117) String local117 = this.getParameter("lang");
				if (local117 != null) {
					this.anInt11231 = Integer.parseInt(local117);
				}
			} catch (@Pc(126) Exception local126) {
			}
			Class399.method9351(Class396.aStringArray48[local37], local102);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString130, 0, this.lb.anInt11229);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt11228);
					this.bar = this.method9339(this.lb.aString129);
					this.background = this.method9339(this.lb.aString125);
					this.left = this.method9339(this.lb.aString131);
					this.right = this.method9339(this.lb.aString126);
					this.top = this.method9339(this.lb.aString123);
					this.bottom = this.method9339(this.lb.aString124);
					this.bodyLeft = this.method9339(this.lb.aString127);
					this.bodyRight = this.method9339(this.lb.aString132);
					this.bodyFill = this.method9339(this.lb.aString128);
					@Pc(282) Image[] local282 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(287) MediaTracker local287 = new MediaTracker(this);
					for (@Pc(289) int local289 = 0; local289 < local282.length; local289++) {
						local287.addImage(local282[local289], local289);
					}
					while (true) {
						try {
							local287.waitForAll();
							break;
						} catch (@Pc(310) InterruptedException local310) {
						}
					}
				} catch (@Pc(314) Throwable local314) {
					this.method9337();
				}
			}
			@Pc(319) unpack local319 = null;
			@Pc(327) byte[] local327;
			try {
				Class.forName("java.util.jar.Pack200");
				local327 = this.method9336(Class396.aClass397_2);
				if (local327 == null) {
					return;
				}
				local319 = new unpack_Sub1(local327);
			} catch (@Pc(339) Throwable local339) {
			}
			if (local319 == null) {
				local327 = this.method9336(Class396.aClass397_1);
				if (local327 == null) {
					return;
				}
				@Pc(355) unpack local355 = new unpack(local327);
				@Pc(360) ClassLoader_Sub1 local360 = new ClassLoader_Sub1(local355);
				@Pc(363) Class local363 = Class.forName("unpack");
				local360.method9335(local363, local363.getName());
				@Pc(373) Class local373 = local360.loadClass("unpackclass");
				@Pc(378) byte[] local378 = this.method9336(Class396.aClass397_3);
				if (local378 == null) {
					return;
				}
				local319 = (unpack) local373.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local378, Boolean.TRUE);
			}
			@Pc(413) ClassLoader_Sub1 local413 = new ClassLoader_Sub1(local319);
			@Pc(416) Class local416 = Class.forName("Class399");
			local413.method9335(local416, local416.getName());
			@Pc(426) Class local426 = local413.loadClass("client");
			synchronized (this) {
				if (this.aBoolean770) {
					return;
				}
				this.anApplet3 = (Applet) local426.getDeclaredConstructor().newInstance();
				local426.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean769) {
					this.anApplet3.start();
				}
				if (this.aBoolean768) {
					this.anApplet3.stop();
				}
			}
			this.method9342();
		} catch (@Pc(496) Exception local496) {
			RuntimeException_Sub2.anInt11225 = 1675963622;
			if (local496 instanceof InvocationTargetException) {
				@Pc(512) Throwable local512 = ((InvocationTargetException) local496).getTargetException();
				if (local512 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9329(local496.toString(), this, local512);
			} else {
				RuntimeException_Sub2.method9329((String) null, this, local496);
			}
			this.method9344("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method9343(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return Class396.aClass398Array1[anInt11233] == null || this.aBoolean771 ? this.method9338(arg1, arg2) : this.method9345(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean770 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean768 = false;
		this.aBoolean769 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method9344(@OriginalArg(1) String arg0) {
		if (this.aBoolean767) {
			return;
		}
		this.aBoolean767 = true;
		try {
			if (aString133 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString133 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIBLjava/lang/String;)Z")
	private boolean method9345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt11232, this.anInt11230);
			this.canvas.setVisible(true);
		}
		@Pc(38) Graphics local38 = this.canvas.getGraphics();
		if (local38 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage15 == null) {
				this.anImage15 = this.createImage(this.anInt11232, this.anInt11230);
			}
			@Pc(57) Graphics local57 = this.anImage15.getGraphics();
			@Pc(62) int local62 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(67) int local67 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(72) int local72 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(77) int local77 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(82) int local82 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(87) int local87 = this.bodyFill.getHeight((ImageObserver) null);
			local57.drawImage(this.bodyLeft, this.method9348(local62) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9346(local77) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(131) int local131 = this.lb.boxXOffset + local62 - this.lb.boxWidth / 2;
			@Pc(141) int local141 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(143) int local143;
			for (local143 = local131; local143 <= local141; local143 += local72) {
				local57.drawImage(this.bodyFill, this.method9348(local62) + this.lb.boxXOffset + local143, this.method9346(local87) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local57.drawImage(this.bodyRight, this.method9348(local67) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9346(local82) - -this.lb.boxYOffset, (ImageObserver) null);
			local143 = this.left.getWidth((ImageObserver) null);
			@Pc(226) int local226 = this.left.getHeight((ImageObserver) null);
			@Pc(231) int local231 = this.right.getWidth((ImageObserver) null);
			@Pc(236) int local236 = this.right.getHeight((ImageObserver) null);
			@Pc(241) int local241 = this.bottom.getHeight((ImageObserver) null);
			@Pc(246) int local246 = this.top.getWidth((ImageObserver) null);
			@Pc(251) int local251 = this.top.getHeight((ImageObserver) null);
			@Pc(256) int local256 = this.bottom.getWidth((ImageObserver) null);
			@Pc(261) int local261 = this.bar.getWidth((ImageObserver) null);
			@Pc(266) int local266 = this.background.getWidth((ImageObserver) null);
			@Pc(280) int local280 = this.method9348(this.lb.width) + this.lb.xOffset;
			@Pc(291) int local291 = this.method9346(this.lb.height) + this.lb.yOffset;
			local57.drawImage(this.left, local280, local291 + (this.lb.height - local226) / 2, (ImageObserver) null);
			local57.drawImage(this.right, local280 + this.lb.width - local231, (this.lb.height + -local236) / 2 + local291, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local143 - local231, this.lb.height);
			}
			@Pc(356) Graphics local356 = this.barBuf.getGraphics();
			@Pc(358) int local358;
			for (local358 = 0; local358 < this.lb.width - local231 - local143; local358 += local246) {
				local356.drawImage(this.top, local358, 0, (ImageObserver) null);
			}
			for (local358 = 0; local358 < this.lb.width - local143 - local231; local358 += local256) {
				local356.drawImage(this.bottom, local358, this.lb.height - local241, (ImageObserver) null);
			}
			local358 = arg0 * (this.lb.width - local231 - local143) / 100;
			if (local358 > 0) {
				@Pc(446) Image local446 = this.createImage(local358, this.lb.height - local251 - local241);
				@Pc(450) int local450 = local446.getWidth((ImageObserver) null);
				@Pc(453) Graphics local453 = local446.getGraphics();
				for (@Pc(458) int local458 = arg1 - local261; local458 < local450; local458 += local261) {
					local453.drawImage(this.bar, local458, 0, (ImageObserver) null);
				}
				local356.drawImage(local446, 0, local251, (ImageObserver) null);
			}
			@Pc(488) int local488 = local358;
			local358 = this.lb.width - local358 - local231 - local143;
			if (local358 > 0) {
				@Pc(519) Image local519 = this.createImage(local358, this.lb.height - local241 - local251);
				@Pc(523) int local523 = local519.getWidth((ImageObserver) null);
				@Pc(526) Graphics local526 = local519.getGraphics();
				for (@Pc(528) int local528 = 0; local528 < local523; local528 += local266) {
					local526.drawImage(this.background, local528, 0, (ImageObserver) null);
				}
				local356.drawImage(local519, local488, local251, (ImageObserver) null);
			}
			local57.drawImage(this.barBuf, local143 + local280, local291, (ImageObserver) null);
			local57.setFont(this.bf);
			local57.setColor(this.colourtext);
			@Pc(587) String local587 = arg2 + " - " + arg0 + "%";
			local57.drawString(local587, local280 + (this.lb.width - this.bfm.stringWidth(local587)) / 2, this.lb.textYOffset + local291 + this.lb.height / 2 + 4);
			local38.drawImage(this.anImage15, 0, 0, (ImageObserver) null);
		} catch (@Pc(626) Exception local626) {
			this.method9337();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean769 = false;
		this.aBoolean768 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9346(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt11230 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!e;Z)[B")
	private byte[] method9347(@OriginalArg(1) Class397 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt11226];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(39) InputStream local39;
			if (arg1) {
				@Pc(44) URL local44 = this.getCodeBase();
				@Pc(52) Socket local52 = new Socket(InetAddress.getByName(local44.getHost()), 443);
				local52.setSoTimeout(10000);
				@Pc(58) OutputStream local58 = local52.getOutputStream();
				local58.write(17);
				local58.write(("JAGGRAB " + local44.getFile() + arg0.aString122 + "\n\n").getBytes());
				local39 = local52.getInputStream();
			} else {
				local39 = (new URL(this.getCodeBase(), arg0.aString122)).openStream();
			}
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = 0;
			@Pc(87) int local87 = 0;
			while (true) {
				if (local5.length <= local85) {
					local39.close();
					if (arg0.anInt11226 != arg0.anInt11227) {
						@Pc(187) byte[] local187 = new byte[arg0.anInt11227];
						@Pc(192) Inflater local192 = new Inflater(true);
						local192.setInput(local5);
						local192.inflate(local187);
						local5 = local187;
					}
					break;
				}
				@Pc(97) int local97 = local5.length - local85;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(110) int local110 = local39.read(local5, local85, local97);
				if (local110 < 0) {
					throw new EOFException();
				}
				local85 += local110;
				@Pc(130) int local130 = local85 * 100 / local5.length;
				@Pc(132) int local132 = 0;
				if (this.lb != null && this.bar != null) {
					local132 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local83 != local130 || local87 != local132) {
					try {
						if (this.method9343(local132, arg0.aStringArray49[this.anInt11231], local130)) {
							local83 = local130;
							local87 = local132;
						}
					} catch (@Pc(174) Exception local174) {
					}
				}
			}
		} catch (@Pc(203) Exception local203) {
			return null;
		}
		return this.method9340(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean770 = true;
		this.aBoolean769 = this.aBoolean768 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method9348(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt11232 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method9349(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local9];
			local20.readFully(local30, 0, local9);
			local20.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
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
}
