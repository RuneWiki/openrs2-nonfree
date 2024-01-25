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

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString122;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString123;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt10305 = 0;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!a;")
	private Class367 lb;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean733;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10306;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt10308;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean734 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean732 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean730 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt10307 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean731 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method8417(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class370.anIntArray561[anInt10305]);
			this.aColor3 = new Color(Class370.anIntArray559[anInt10305]);
			this.colourtext = new Color(Class370.anIntArray560[anInt10305]);
		}
		@Pc(49) Graphics local49 = this.getGraphics();
		if (local49 == null) {
			this.repaint();
			return false;
		}
		@Pc(94) int local94;
		@Pc(101) int local101;
		@Pc(168) String local168;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10306, this.anInt10308);
			}
			@Pc(72) Graphics local72 = this.anImage14.getGraphics();
			local72.setColor(Color.black);
			local72.fillRect(0, 0, this.anInt10306, this.anInt10308);
			local72.setColor(this.aColor2);
			local94 = this.anInt10306 / 2 - 152;
			local101 = this.anInt10308 / 2 - 18;
			local72.drawRect(local94, local101, 303, 33);
			local72.setColor(this.aColor3);
			local72.fillRect(local94 + 2, local101 - -2, arg1 * 3, 30);
			local72.setColor(Color.black);
			local72.drawRect(local94 + 1, local101 - -1, 301, 31);
			local72.fillRect(arg1 * 3 + local94 + 2, local101 + 2, 300 - arg1 * 3, 30);
			local168 = arg0 + " - " + arg1 + "%";
			local72.setFont(this.bf);
			local72.setColor(this.colourtext);
			local72.drawString(local168, (this.anInt10306 - this.bfm.stringWidth(local168)) / 2, this.anInt10308 / 2 + 4);
			local49.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(204) Exception local204) {
			local49.setColor(Color.black);
			local49.fillRect(0, 0, this.anInt10306, this.anInt10308);
			local49.setColor(this.aColor2);
			local94 = this.anInt10306 / 2 - 152;
			local101 = this.anInt10308 / 2 - 18;
			local49.drawRect(local94, local101, 303, 33);
			local49.setColor(this.aColor3);
			local49.fillRect(local94 + 2, local101 + 2, arg1 * 3, 30);
			local49.setColor(Color.black);
			local49.drawRect(local94 + 1, local101 - -1, 301, 31);
			local49.fillRect(arg1 * 3 + local94 + 2, local101 - -2, 300 - arg1 * 3, 30);
			local49.setFont(this.bf);
			local168 = arg0 + " - " + arg1 + "%";
			local49.setColor(this.colourtext);
			local49.drawString(local168, (this.anInt10306 - this.bfm.stringWidth(local168)) / 2, this.anInt10308 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method8418(@OriginalArg(0) String arg0) {
		if (this.aBoolean731) {
			return;
		}
		this.aBoolean731 = true;
		try {
			if (aString122 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString122 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean734 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;B)Ljava/awt/Image;")
	private Image method8419(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean730 = false;
		this.aBoolean732 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean730 = true;
		this.aBoolean732 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;B[B)Z")
	private boolean method8420(@OriginalArg(0) Class369 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(18) MessageDigest local18 = MessageDigest.getInstance("SHA");
			local18.reset();
			local18.update(arg1);
			@Pc(26) byte[] local26 = local18.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (arg0.anIntArray558[local28] != local26[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(52) Exception local52) {
			this.method8418("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8421() {
		this.bf = null;
		this.bfm = null;
		this.aBoolean733 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString123 = this.getParameter("unsignedurl");
			if (aString123 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean731 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString123), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString122 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class370.aStringArray75.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(59) String local59 = this.getParameter("colourid");
			if (local59 != null) {
				anInt10305 = Integer.parseInt(local59);
				if (anInt10305 < 0 || Class370.anIntArray561.length <= anInt10305) {
					anInt10305 = 0;
				}
			}
			this.lb = Class370.aClass367Array1[anInt10305];
			this.anInt10306 = this.getSize().width;
			this.anInt10308 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt10307 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class368.method8415(local99, Class370.aStringArray75[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString109, 0, this.lb.anInt10300);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10299);
					this.bar = this.method8419(this.lb.aString110);
					this.background = this.method8419(this.lb.aString114);
					this.left = this.method8419(this.lb.aString113);
					this.right = this.method8419(this.lb.aString112);
					this.top = this.method8419(this.lb.aString108);
					this.bottom = this.method8419(this.lb.aString107);
					this.bodyLeft = this.method8419(this.lb.aString116);
					this.bodyRight = this.method8419(this.lb.aString111);
					this.bodyFill = this.method8419(this.lb.aString115);
					@Pc(279) Image[] local279 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(284) MediaTracker local284 = new MediaTracker(this);
					for (@Pc(286) int local286 = 0; local286 < local279.length; local286++) {
						local284.addImage(local279[local286], local286);
					}
					while (true) {
						try {
							local284.waitForAll();
							break;
						} catch (@Pc(303) InterruptedException local303) {
						}
					}
				} catch (@Pc(307) Throwable local307) {
					this.method8421();
				}
			}
			@Pc(312) unpack local312 = null;
			@Pc(320) byte[] local320;
			try {
				Class.forName("java.util.jar.Pack200");
				local320 = this.method8424(Class370.aClass369_2);
				if (local320 == null) {
					return;
				}
				local312 = new unpack_Sub1(local320);
			} catch (@Pc(331) Throwable local331) {
			}
			if (local312 == null) {
				local320 = this.method8424(Class370.aClass369_1);
				if (local320 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local320);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method8413(local355, local355.getName());
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method8424(Class370.aClass369_3);
				if (local370 == null) {
					return;
				}
				local312 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(406) ClassLoader_Sub1 local406 = new ClassLoader_Sub1(local312);
			@Pc(409) Class local409 = Class.forName("Class368");
			local406.method8413(local409, local409.getName());
			@Pc(419) Class local419 = local406.loadClass("client");
			synchronized (this) {
				if (this.aBoolean734) {
					return;
				}
				this.anApplet3 = (Applet) local419.getDeclaredConstructor().newInstance();
				local419.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean730) {
					this.anApplet3.start();
				}
				if (this.aBoolean732) {
					this.anApplet3.stop();
				}
			}
			this.method8429();
		} catch (@Pc(489) Exception local489) {
			RuntimeException_Sub2.anInt10301 = 2002920920;
			if (local489 instanceof InvocationTargetException) {
				@Pc(505) Throwable local505 = ((InvocationTargetException) local489).getTargetException();
				if (local505 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8408(this, local489.toString(), local505);
			} else {
				RuntimeException_Sub2.method8408(this, null, local489);
			}
			this.method8418("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10306, this.anInt10308);
			this.canvas.setVisible(true);
		}
		@Pc(39) Graphics local39 = this.canvas.getGraphics();
		if (local39 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10306, this.anInt10308);
			}
			@Pc(57) Graphics local57 = this.anImage14.getGraphics();
			@Pc(62) int local62 = this.bodyLeft.getWidth(null);
			@Pc(67) int local67 = this.bodyRight.getWidth(null);
			@Pc(72) int local72 = this.bodyFill.getWidth(null);
			@Pc(77) int local77 = this.bodyLeft.getHeight(null);
			@Pc(82) int local82 = this.bodyRight.getHeight(null);
			@Pc(87) int local87 = this.bodyFill.getHeight(null);
			local57.drawImage(this.bodyLeft, this.method8427(local62) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8425(local77) + this.lb.boxYOffset, null);
			@Pc(129) int local129 = local62 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(142) int local142 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local67;
			@Pc(144) int local144;
			for (local144 = local129; local144 <= local142; local144 += local72) {
				local57.drawImage(this.bodyFill, this.method8427(local62) + this.lb.boxXOffset + local144, this.method8425(local87) - -this.lb.boxYOffset, null);
			}
			local57.drawImage(this.bodyRight, this.method8427(local67) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8425(local82) + this.lb.boxYOffset, null);
			local144 = this.left.getWidth(null);
			@Pc(224) int local224 = this.left.getHeight(null);
			@Pc(229) int local229 = this.right.getWidth(null);
			@Pc(234) int local234 = this.right.getHeight(null);
			@Pc(239) int local239 = this.bottom.getHeight(null);
			@Pc(244) int local244 = this.top.getWidth(null);
			@Pc(249) int local249 = this.top.getHeight(null);
			@Pc(254) int local254 = this.bottom.getWidth(null);
			@Pc(259) int local259 = this.bar.getWidth(null);
			@Pc(264) int local264 = this.background.getWidth(null);
			@Pc(276) int local276 = this.method8427(this.lb.width) + this.lb.xOffset;
			@Pc(290) int local290 = this.method8425(this.lb.height) + this.lb.yOffset;
			local57.drawImage(this.left, local276, (this.lb.height - local224) / 2 + local290, null);
			local57.drawImage(this.right, local276 + this.lb.width - local229, local290 - -((this.lb.height - local234) / 2), null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local229 - local144, this.lb.height);
			}
			@Pc(356) Graphics local356 = this.barBuf.getGraphics();
			@Pc(358) int local358;
			for (local358 = 0; local358 < this.lb.width - local229 - local144; local358 += local244) {
				local356.drawImage(this.top, local358, 0, null);
			}
			for (local358 = 0; local358 < this.lb.width - local229 - local144; local358 += local254) {
				local356.drawImage(this.bottom, local358, this.lb.height - local239, null);
			}
			local358 = (this.lb.width - local229 - local144) * arg0 / 100;
			if (local358 > 0) {
				@Pc(448) Image local448 = this.createImage(local358, this.lb.height - local239 - local249);
				@Pc(452) int local452 = local448.getWidth(null);
				@Pc(455) Graphics local455 = local448.getGraphics();
				for (@Pc(459) int local459 = arg1 - local259; local459 < local452; local459 += local259) {
					local455.drawImage(this.bar, local459, 0, null);
				}
				local356.drawImage(local448, 0, local249, null);
			}
			@Pc(485) int local485 = local358;
			local358 = this.lb.width - local144 - local229 - local358;
			if (local358 > 0) {
				@Pc(517) Image local517 = this.createImage(local358, this.lb.height - local239 - local249);
				@Pc(521) int local521 = local517.getWidth(null);
				@Pc(524) Graphics local524 = local517.getGraphics();
				for (@Pc(526) int local526 = 0; local526 < local521; local526 += local264) {
					local524.drawImage(this.background, local526, 0, null);
				}
				local356.drawImage(local517, local485, local249, null);
			}
			local57.drawImage(this.barBuf, local144 + local276, local290, null);
			local57.setFont(this.bf);
			local57.setColor(this.colourtext);
			@Pc(581) String local581 = arg2 + " - " + arg0 + "%";
			local57.drawString(local581, local276 + (this.lb.width - this.bfm.stringWidth(local581)) / 2, this.lb.textYOffset + 4 + this.lb.height / 2 + local290);
			local39.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(619) Exception local619) {
			this.method8421();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method8423(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(42) IOException local42) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;)[B")
	private byte[] method8424(@OriginalArg(1) Class369 arg0) {
		@Pc(9) File local9;
		try {
			local9 = Class368.method8416(arg0.aString121);
		} catch (@Pc(11) Exception local11) {
			this.method8418("nocache");
			return null;
		}
		@Pc(22) byte[] local22 = this.method8423(local9);
		if (!this.method8420(arg0, local22)) {
			local22 = this.method8426(false, arg0);
			if (local22 == null) {
				local22 = this.method8426(true, arg0);
			}
			if (local22 == null) {
				this.method8418("download");
				return null;
			}
			if (!this.method8430(local22, local9)) {
				return null;
			}
			local22 = this.method8423(local9);
			if (!this.method8420(arg0, local22)) {
				this.method8418("mismatch");
				return null;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean734 = true;
		this.aBoolean730 = this.aBoolean732 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8425(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10308 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;I)[B")
	private byte[] method8426(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class369 arg1) {
		@Pc(13) byte[] local13 = new byte[arg1.anInt10303];
		@Pc(15) int local15 = 0;
		if (this.lb != null && this.bar != null) {
			local15 = this.bar.getWidth(null);
		}
		try {
			@Pc(69) InputStream local69;
			if (arg0) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg1.aString120 + "\n\n").getBytes());
				local69 = local40.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg1.aString120)).openStream();
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
					@Pc(114) int local114 = local69.read(local13, local84, local100);
					if (local114 >= 0) {
						local84 += local114;
						@Pc(135) int local135 = local84 * 100 / local13.length;
						@Pc(137) int local137 = 0;
						if (this.lb != null && this.bar != null) {
							local137 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local15;
						}
						if (local135 != local82 || local86 != local137) {
							try {
								if (this.method8428(arg1.aStringArray74[this.anInt10307], local137, local135)) {
									local82 = local135;
									local86 = local137;
								}
							} catch (@Pc(185) Exception local185) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local69.close();
				if (arg1.anInt10304 != arg1.anInt10303) {
					@Pc(202) byte[] local202 = new byte[arg1.anInt10304];
					@Pc(207) Inflater local207 = new Inflater(true);
					local207.setInput(local13);
					local207.inflate(local202);
					local13 = local202;
				}
				break;
			}
		} catch (@Pc(218) Exception local218) {
			return null;
		}
		return this.method8420(arg1, local13) ? local13 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method8427(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10306 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method8428(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class370.aClass367Array1[anInt10305] == null || this.aBoolean733 ? this.method8417(arg0, arg2) : this.method8422(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method8429() {
		this.aColor2 = null;
		this.aColor3 = null;
		this.barBuf = null;
		this.anImage14 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method8430(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method8418("savefile");
			return false;
		}
	}
}
