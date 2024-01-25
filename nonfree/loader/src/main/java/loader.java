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
	private static String aString117;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString118;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt9663 = 0;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt9661;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class368 lb;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt9664;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean745;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean741 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean742 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt9662 = 0;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean744 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean743 = false;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString118 = this.getParameter("unsignedurl");
			if (aString118 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean742 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString118), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString117 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class369.aStringArray192.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt9663 = Integer.parseInt(local67);
				if (anInt9663 < 0 || anInt9663 >= Class369.anIntArray704.length) {
					anInt9663 = 0;
				}
			}
			this.lb = Class369.aClass368Array1[anInt9663];
			this.anInt9661 = this.getSize().width;
			this.anInt9664 = this.getSize().height;
			@Pc(101) int local101 = 32;
			try {
				@Pc(106) int local106 = Integer.parseInt(this.getParameter("modewhat"));
				local101 += local106;
			} catch (@Pc(112) Exception local112) {
			}
			try {
				@Pc(116) String local116 = this.getParameter("lang");
				if (local116 != null) {
					this.anInt9662 = Integer.parseInt(local116);
				}
			} catch (@Pc(124) Exception local124) {
			}
			Class370.method8016(local101, Class369.aStringArray192[local38]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString107, 0, this.lb.anInt9657);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9658);
					this.bar = this.method8020(this.lb.aString106);
					this.background = this.method8020(this.lb.aString113);
					this.left = this.method8020(this.lb.aString112);
					this.right = this.method8020(this.lb.aString111);
					this.top = this.method8020(this.lb.aString110);
					this.bottom = this.method8020(this.lb.aString109);
					this.bodyLeft = this.method8020(this.lb.aString105);
					this.bodyRight = this.method8020(this.lb.aString104);
					this.bodyFill = this.method8020(this.lb.aString108);
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
					this.method8028();
				}
			}
			@Pc(314) unpack local314 = null;
			@Pc(322) byte[] local322;
			try {
				Class.forName("java.util.jar.Pack200");
				local322 = this.method8030(Class369.aClass367_2);
				if (local322 == null) {
					return;
				}
				local314 = new unpack_Sub1(local322);
			} catch (@Pc(334) Throwable local334) {
			}
			if (local314 == null) {
				local322 = this.method8030(Class369.aClass367_1);
				if (local322 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local322);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method8005(local358.getName(), local358);
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method8030(Class369.aClass367_3);
				if (local373 == null) {
					return;
				}
				local314 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local314);
			@Pc(412) Class local412 = Class.forName("Class370");
			local409.method8005(local412.getName(), local412);
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean741) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean743) {
					this.anApplet3.start();
				}
				if (this.aBoolean744) {
					this.anApplet3.stop();
				}
			}
			this.method8029();
		} catch (@Pc(492) Exception local492) {
			RuntimeException_Sub2.anInt9659 = -930623448;
			if (local492 instanceof InvocationTargetException) {
				@Pc(501) Throwable local501 = ((InvocationTargetException) local492).getTargetException();
				if (local501 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8012(this, local492.toString(), local501);
			} else {
				RuntimeException_Sub2.method8012(this, null, local492);
			}
			this.method8019("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method8017(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method8019("savefile");
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
		this.aBoolean741 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method8018(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local19.readFully(local28, 0, local8);
			local19.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean743 = true;
		this.aBoolean744 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean741 = true;
		this.aBoolean743 = this.aBoolean744 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8019(@OriginalArg(0) String arg0) {
		if (this.aBoolean742) {
			return;
		}
		this.aBoolean742 = true;
		try {
			if (aString117 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString117 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8020(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(13) InputStream local13 = this.getClass().getResourceAsStream(arg0);
			@Pc(16) byte[] local16 = new byte[1000];
			@Pc(18) int local18 = 0;
			@Pc(22) int local22;
			while ((local22 = local13.read()) != -1) {
				local16[local18++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local16);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IB)Z")
	private boolean method8021(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class369.anIntArray704[anInt9663]);
			this.aColor2 = new Color(Class369.anIntArray705[anInt9663]);
			this.colourtext = new Color(Class369.anIntArray706[anInt9663]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(91) int local91;
		@Pc(98) int local98;
		@Pc(170) String local170;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9661, this.anInt9664);
			}
			@Pc(69) Graphics local69 = this.anImage14.getGraphics();
			local69.setColor(Color.black);
			local69.fillRect(0, 0, this.anInt9661, this.anInt9664);
			local69.setColor(this.aColor3);
			local91 = this.anInt9661 / 2 - 152;
			local98 = this.anInt9664 / 2 - 18;
			local69.drawRect(local91, local98, 303, 33);
			local69.setColor(this.aColor2);
			local69.fillRect(local91 + 2, local98 + 2, arg1 * 3, 30);
			local69.setColor(Color.black);
			local69.drawRect(local91 + 1, local98 + 1, 301, 31);
			local69.fillRect(local91 + arg1 * 3 + 2, local98 + 2, 300 - arg1 * 3, 30);
			local69.setFont(this.bf);
			local170 = arg0 + " - " + arg1 + "%";
			local69.setColor(this.colourtext);
			local69.drawString(local170, (this.anInt9661 - this.bfm.stringWidth(local170)) / 2, this.anInt9664 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(202) Exception local202) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt9661, this.anInt9664);
			local43.setColor(this.aColor3);
			local91 = this.anInt9661 / 2 - 152;
			local98 = this.anInt9664 / 2 - 18;
			local43.drawRect(local91, local98, 303, 33);
			local43.setColor(this.aColor2);
			local43.fillRect(local91 + 2, local98 + 2, arg1 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local91 + 1, local98 + 1, 301, 31);
			local43.fillRect(local91 + arg1 * 3 + 2, local98 + 2, 300 - arg1 * 3, 30);
			local170 = arg0 + " - " + arg1 + "%";
			local43.setFont(this.bf);
			local43.setColor(this.colourtext);
			local43.drawString(local170, (this.anInt9661 - this.bfm.stringWidth(local170)) / 2, this.anInt9664 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!c;B)Z")
	private boolean method8022(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class367 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(18) int local18 = 0; local18 < 20; local18++) {
				if (local16[local18] != arg1.anIntArray703[local18]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method8019("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9661, this.anInt9664);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9661, this.anInt9664);
			}
			@Pc(52) Graphics local52 = this.anImage14.getGraphics();
			@Pc(57) int local57 = this.bodyLeft.getWidth(null);
			@Pc(62) int local62 = this.bodyRight.getWidth(null);
			@Pc(67) int local67 = this.bodyFill.getWidth(null);
			@Pc(72) int local72 = this.bodyLeft.getHeight(null);
			@Pc(77) int local77 = this.bodyRight.getHeight(null);
			@Pc(82) int local82 = this.bodyFill.getHeight(null);
			local52.drawImage(this.bodyLeft, this.method8024(local57) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8027(local72) + this.lb.boxYOffset, null);
			@Pc(125) int local125 = this.lb.boxXOffset + local57 - this.lb.boxWidth / 2;
			@Pc(138) int local138 = this.lb.boxWidth / 2 + this.lb.boxXOffset - local62;
			@Pc(140) int local140;
			for (local140 = local125; local140 <= local138; local140 += local67) {
				local52.drawImage(this.bodyFill, local140 + this.method8024(local57) + this.lb.boxXOffset, this.method8027(local82) - -this.lb.boxYOffset, null);
			}
			local52.drawImage(this.bodyRight, this.method8024(local62) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8027(local77) + this.lb.boxYOffset, null);
			local140 = this.left.getWidth(null);
			@Pc(214) int local214 = this.left.getHeight(null);
			@Pc(219) int local219 = this.right.getWidth(null);
			@Pc(224) int local224 = this.right.getHeight(null);
			@Pc(229) int local229 = this.bottom.getHeight(null);
			@Pc(234) int local234 = this.top.getWidth(null);
			@Pc(239) int local239 = this.top.getHeight(null);
			@Pc(244) int local244 = this.bottom.getWidth(null);
			@Pc(249) int local249 = this.bar.getWidth(null);
			@Pc(254) int local254 = this.background.getWidth(null);
			@Pc(265) int local265 = this.method8024(this.lb.width) + this.lb.xOffset;
			@Pc(277) int local277 = this.method8027(this.lb.height) + this.lb.yOffset;
			local52.drawImage(this.left, local265, local277 + (this.lb.height - local214) / 2, null);
			local52.drawImage(this.right, this.lb.width + local265 - local219, local277 + (-local224 + this.lb.height) / 2, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local219 - local140, this.lb.height);
			}
			@Pc(342) Graphics local342 = this.barBuf.getGraphics();
			@Pc(344) int local344;
			for (local344 = 0; local344 < this.lb.width - local219 - local140; local344 += local234) {
				local342.drawImage(this.top, local344, 0, null);
			}
			for (local344 = 0; local344 < this.lb.width - local140 - local219; local344 += local244) {
				local342.drawImage(this.bottom, local344, this.lb.height - local229, null);
			}
			local344 = arg0 * (this.lb.width - local219 - local140) / 100;
			if (local344 > 0) {
				@Pc(435) Image local435 = this.createImage(local344, this.lb.height - local239 - local229);
				@Pc(439) int local439 = local435.getWidth(null);
				@Pc(442) Graphics local442 = local435.getGraphics();
				for (@Pc(447) int local447 = arg1 - local249; local447 < local439; local447 += local249) {
					local442.drawImage(this.bar, local447, 0, null);
				}
				local342.drawImage(local435, 0, local239, null);
			}
			@Pc(473) int local473 = local344;
			local344 = this.lb.width - local344 - local219 - local140;
			if (local344 > 0) {
				@Pc(502) Image local502 = this.createImage(local344, this.lb.height - local239 - local229);
				@Pc(506) int local506 = local502.getWidth(null);
				@Pc(509) Graphics local509 = local502.getGraphics();
				for (@Pc(511) int local511 = 0; local511 < local506; local511 += local254) {
					local509.drawImage(this.background, local511, 0, null);
				}
				local342.drawImage(local502, local473, local239, null);
			}
			local52.drawImage(this.barBuf, local140 + local265, local277, null);
			local52.setFont(this.bf);
			local52.setColor(this.colourtext);
			@Pc(566) String local566 = arg2 + " - " + arg0 + "%";
			local52.drawString(local566, local265 + (this.lb.width - this.bfm.stringWidth(local566)) / 2, this.lb.textYOffset + 4 + this.lb.height / 2 + local277);
			local33.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(605) Exception local605) {
			this.method8028();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8024(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt9661 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!c;I)[B")
	private byte[] method8025(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class367 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9655];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(31) InputStream local31;
			if (arg0) {
				@Pc(36) URL local36 = this.getCodeBase();
				@Pc(44) Socket local44 = new Socket(InetAddress.getByName(local36.getHost()), 443);
				local44.setSoTimeout(10000);
				@Pc(50) OutputStream local50 = local44.getOutputStream();
				local50.write(17);
				local50.write(("JAGGRAB " + local36.getFile() + arg1.aString102 + "\n\n").getBytes());
				local31 = local44.getInputStream();
			} else {
				local31 = (new URL(this.getCodeBase(), arg1.aString102)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			while (true) {
				if (local77 >= local5.length) {
					local31.close();
					if (arg1.anInt9655 != arg1.anInt9656) {
						@Pc(184) byte[] local184 = new byte[arg1.anInt9656];
						@Pc(189) Inflater local189 = new Inflater(true);
						local189.setInput(local5);
						local189.inflate(local184);
						local5 = local184;
					}
					break;
				}
				@Pc(89) int local89 = local5.length - local77;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(103) int local103 = local31.read(local5, local77, local89);
				if (local103 < 0) {
					throw new EOFException();
				}
				local77 += local103;
				@Pc(121) int local121 = local77 * 100 / local5.length;
				@Pc(123) int local123 = 0;
				if (this.lb != null && this.bar != null) {
					local123 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local75 != local121 || local79 != local123) {
					try {
						if (this.method8026(local123, arg1.aStringArray191[this.anInt9662], local121)) {
							local79 = local123;
							local75 = local121;
						}
					} catch (@Pc(170) Exception local170) {
					}
				}
			}
		} catch (@Pc(200) Exception local200) {
			return null;
		}
		return this.method8022(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8026(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class369.aClass368Array1[anInt9663] == null || this.aBoolean745 ? this.method8021(arg1, arg2) : this.method8023(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method8027(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt9664 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean744 = true;
		this.aBoolean743 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8028() {
		this.aBoolean745 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8029() {
		this.aColor2 = null;
		this.anImage14 = null;
		this.barBuf = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;I)[B")
	private byte[] method8030(@OriginalArg(0) Class367 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class370.method8014(arg0.aString103);
		} catch (@Pc(6) Exception local6) {
			this.method8019("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method8018(local4);
		if (!this.method8022(local17, arg0)) {
			local17 = this.method8025(false, arg0);
			if (local17 == null) {
				local17 = this.method8025(true, arg0);
			}
			if (local17 == null) {
				this.method8019("download");
				return null;
			}
			if (!this.method8017(local4, local17)) {
				return null;
			}
			local17 = this.method8018(local4);
			if (!this.method8022(local17, arg0)) {
				this.method8019("mismatch");
				return null;
			}
		}
		return local17;
	}
}
