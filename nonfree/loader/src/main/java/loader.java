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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString115;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString116;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt9851 = 0;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt9850;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Image;")
	private Image anImage17;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean704;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt9852;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class366 lb;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean701 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean700 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean703 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean702 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "I")
	private int anInt9853 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!b;)Z")
	private boolean method8060(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class365 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg1.anIntArray727[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(38) Exception local38) {
			this.method8067("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8061() {
		this.aBoolean704 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!b;)[B")
	private byte[] method8062(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class365 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9847];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(68) InputStream local68;
			if (arg0) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg1.aString103 + "\n\n").getBytes());
				local68 = local39.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg1.aString103)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local83 >= local5.length) {
					local68.close();
					if (arg1.anInt9847 != arg1.anInt9846) {
						@Pc(183) byte[] local183 = new byte[arg1.anInt9846];
						@Pc(188) Inflater local188 = new Inflater(true);
						local188.setInput(local5);
						local188.inflate(local183);
						local5 = local183;
					}
					break;
				}
				@Pc(94) int local94 = local5.length - local83;
				if (local94 > 1000) {
					local94 = 1000;
				}
				@Pc(105) int local105 = local68.read(local5, local83, local94);
				if (local105 < 0) {
					throw new EOFException();
				}
				local83 += local105;
				@Pc(125) int local125 = local83 * 100 / local5.length;
				@Pc(127) int local127 = 0;
				if (this.lb != null && this.bar != null) {
					local127 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local81 != local125 || local85 != local127) {
					try {
						if (this.method8063(arg1.aStringArray40[this.anInt9853], local125, local127)) {
							local85 = local127;
							local81 = local125;
						}
					} catch (@Pc(170) Exception local170) {
					}
				}
			}
		} catch (@Pc(199) Exception local199) {
			return null;
		}
		return this.method8060(local5, arg1) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;II)Z")
	private boolean method8063(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class367.aClass366Array1[anInt9851] == null || this.aBoolean704 ? this.method8065(arg0, arg1) : this.method8069(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean701 = true;
		this.aBoolean702 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean700 = false;
		this.setBackground(Color.black);
		@Pc(20) Thread local20 = new Thread(this);
		local20.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;Z)[B")
	private byte[] method8064(@OriginalArg(0) Class365 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class364.method8054(arg0.aString104);
		} catch (@Pc(6) Exception local6) {
			this.method8067("nocache");
			return null;
		}
		@Pc(27) byte[] local27 = this.method8068(local4);
		if (!this.method8060(local27, arg0)) {
			local27 = this.method8062(false, arg0);
			if (local27 == null) {
				local27 = this.method8062(true, arg0);
			}
			if (local27 == null) {
				this.method8067("download");
				return null;
			}
			if (!this.method8071(local27, local4)) {
				return null;
			}
			local27 = this.method8068(local4);
			if (!this.method8060(local27, arg0)) {
				this.method8067("mismatch");
				return null;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean702 = this.aBoolean701 = false;
		this.aBoolean700 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BI)Z")
	private boolean method8065(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class367.anIntArray730[anInt9851]);
			this.aColor3 = new Color(Class367.anIntArray728[anInt9851]);
			this.colourtext = new Color(Class367.anIntArray729[anInt9851]);
		}
		@Pc(52) Graphics local52 = this.getGraphics();
		if (local52 == null) {
			this.repaint();
			return false;
		}
		@Pc(94) int local94;
		@Pc(101) int local101;
		@Pc(169) String local169;
		try {
			if (this.anImage17 == null) {
				this.anImage17 = this.createImage(this.anInt9852, this.anInt9850);
			}
			@Pc(72) Graphics local72 = this.anImage17.getGraphics();
			local72.setColor(Color.black);
			local72.fillRect(0, 0, this.anInt9852, this.anInt9850);
			local72.setColor(this.aColor2);
			local94 = this.anInt9852 / 2 - 152;
			local101 = this.anInt9850 / 2 - 18;
			local72.drawRect(local94, local101, 303, 33);
			local72.setColor(this.aColor3);
			local72.fillRect(local94 + 2, local101 + 2, arg1 * 3, 30);
			local72.setColor(Color.black);
			local72.drawRect(local94 + 1, local101 + 1, 301, 31);
			local72.fillRect(local94 + arg1 * 3 + 2, local101 + 2, 300 - arg1 * 3, 30);
			local169 = arg0 + " - " + arg1 + "%";
			local72.setFont(this.bf);
			local72.setColor(this.colourtext);
			local72.drawString(local169, (this.anInt9852 - this.bfm.stringWidth(local169)) / 2, this.anInt9850 / 2 + 4);
			local52.drawImage(this.anImage17, 0, 0, null);
		} catch (@Pc(206) Exception local206) {
			local52.setColor(Color.black);
			local52.fillRect(0, 0, this.anInt9852, this.anInt9850);
			local52.setColor(this.aColor2);
			local94 = this.anInt9852 / 2 - 152;
			local101 = this.anInt9850 / 2 - 18;
			local52.drawRect(local94, local101, 303, 33);
			local52.setColor(this.aColor3);
			local52.fillRect(local94 + 2, local101 + 2, arg1 * 3, 30);
			local52.setColor(Color.black);
			local52.drawRect(local94 + 1, local101 + 1, 301, 31);
			local52.fillRect(local94 + arg1 * 3 + 2, local101 + 2, 300 - arg1 * 3, 30);
			local169 = arg0 + " - " + arg1 + "%";
			local52.setFont(this.bf);
			local52.setColor(this.colourtext);
			local52.drawString(local169, (this.anInt9852 - this.bfm.stringWidth(local169)) / 2, this.anInt9850 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8066() {
		this.aColor2 = null;
		this.barBuf = null;
		this.aColor3 = null;
		this.anImage17 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method8067(@OriginalArg(0) String arg0) {
		if (this.aBoolean703) {
			return;
		}
		this.aBoolean703 = true;
		try {
			if (aString115 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString115 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method8068(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local9];
			local28.readFully(local31, 0, local9);
			local28.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method8069(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9852, this.anInt9850);
			this.canvas.setVisible(true);
		}
		@Pc(34) Graphics local34 = this.canvas.getGraphics();
		if (local34 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage17 == null) {
				this.anImage17 = this.createImage(this.anInt9852, this.anInt9850);
			}
			@Pc(57) Graphics local57 = this.anImage17.getGraphics();
			@Pc(62) int local62 = this.bodyLeft.getWidth(null);
			@Pc(67) int local67 = this.bodyRight.getWidth(null);
			@Pc(72) int local72 = this.bodyFill.getWidth(null);
			@Pc(77) int local77 = this.bodyLeft.getHeight(null);
			@Pc(82) int local82 = this.bodyRight.getHeight(null);
			@Pc(87) int local87 = this.bodyFill.getHeight(null);
			local57.drawImage(this.bodyLeft, (this.anInt9852 - local62) / 2 + this.lb.boxXOffset - this.lb.boxWidth / 2, this.lb.boxYOffset + (-local77 + this.anInt9850) / 2, null);
			@Pc(135) int local135 = local62 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(147) int local147 = this.lb.boxWidth / 2 + this.lb.boxXOffset - local67;
			@Pc(149) int local149;
			for (local149 = local135; local149 <= local147; local149 += local72) {
				local57.drawImage(this.bodyFill, (this.anInt9852 - local62) / 2 + this.lb.boxXOffset + local149, (this.anInt9850 + -local87) / 2 - -this.lb.boxYOffset, null);
			}
			local57.drawImage(this.bodyRight, this.lb.boxWidth / 2 + this.lb.boxXOffset + (-local67 + this.anInt9852) / 2, this.lb.boxYOffset + (-local82 + this.anInt9850) / 2, null);
			local149 = this.left.getWidth(null);
			@Pc(238) int local238 = this.left.getHeight(null);
			@Pc(243) int local243 = this.right.getWidth(null);
			@Pc(248) int local248 = this.right.getHeight(null);
			@Pc(253) int local253 = this.bottom.getHeight(null);
			@Pc(258) int local258 = this.top.getWidth(null);
			@Pc(263) int local263 = this.top.getHeight(null);
			@Pc(268) int local268 = this.bottom.getWidth(null);
			@Pc(273) int local273 = this.bar.getWidth(null);
			@Pc(278) int local278 = this.background.getWidth(null);
			@Pc(292) int local292 = this.lb.xOffset + (this.anInt9852 - this.lb.width) / 2;
			@Pc(306) int local306 = (this.anInt9850 - this.lb.height) / 2 + this.lb.yOffset;
			local57.drawImage(this.left, local292, local306 + (this.lb.height - local238) / 2, null);
			local57.drawImage(this.right, this.lb.width + local292 - local243, local306 + (this.lb.height + -local248) / 2, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local149 - local243, this.lb.height);
			}
			@Pc(369) Graphics local369 = this.barBuf.getGraphics();
			@Pc(371) int local371;
			for (local371 = 0; local371 < this.lb.width - local243 - local149; local371 += local258) {
				local369.drawImage(this.top, local371, 0, null);
			}
			for (local371 = 0; local371 < this.lb.width - local243 - local149; local371 += local268) {
				local369.drawImage(this.bottom, local371, this.lb.height - local253, null);
			}
			local371 = (this.lb.width - local243 - local149) * arg1 / 100;
			if (local371 > 0) {
				@Pc(457) Image local457 = this.createImage(local371, this.lb.height - local253 - local263);
				@Pc(461) int local461 = local457.getWidth(null);
				@Pc(464) Graphics local464 = local457.getGraphics();
				for (@Pc(468) int local468 = arg2 - local273; local468 < local461; local468 += local273) {
					local464.drawImage(this.bar, local468, 0, null);
				}
				local369.drawImage(local457, 0, local263, null);
			}
			@Pc(494) int local494 = local371;
			local371 = this.lb.width - local243 - local149 - local371;
			if (local371 > 0) {
				@Pc(525) Image local525 = this.createImage(local371, this.lb.height - local263 - local253);
				@Pc(529) int local529 = local525.getWidth(null);
				@Pc(532) Graphics local532 = local525.getGraphics();
				for (@Pc(534) int local534 = 0; local534 < local529; local534 += local278) {
					local532.drawImage(this.background, local534, 0, null);
				}
				local369.drawImage(local525, local494, local263, null);
			}
			local57.drawImage(this.barBuf, local292 + local149, local306, null);
			local57.setFont(this.bf);
			local57.setColor(this.colourtext);
			@Pc(590) String local590 = arg0 + " - " + arg1 + "%";
			local57.drawString(local590, local292 + (this.lb.width - this.bfm.stringWidth(local590)) / 2, this.lb.height / 2 + local306 - (-this.lb.textYOffset + -4));
			local34.drawImage(this.anImage17, 0, 0, null);
		} catch (@Pc(630) Exception local630) {
			this.method8061();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8070(@OriginalArg(0) String arg0) throws IOException {
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString116 = this.getParameter("unsignedurl");
			if (aString116 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean703 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString116), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString115 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class367.aStringArray41.length) {
					local39 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt9851 = Integer.parseInt(local62);
				if (anInt9851 < 0 || anInt9851 >= Class367.anIntArray730.length) {
					anInt9851 = 0;
				}
			}
			this.lb = Class367.aClass366Array1[anInt9851];
			this.anInt9852 = this.getSize().width;
			this.anInt9850 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt9853 = Integer.parseInt(local113);
				}
			} catch (@Pc(122) Exception local122) {
			}
			Class364.method8053(local98, Class367.aStringArray41[local39]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString113, 0, this.lb.anInt9848);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9849);
					this.bar = this.method8070(this.lb.aString110);
					this.background = this.method8070(this.lb.aString107);
					this.left = this.method8070(this.lb.aString105);
					this.right = this.method8070(this.lb.aString112);
					this.top = this.method8070(this.lb.aString109);
					this.bottom = this.method8070(this.lb.aString114);
					this.bodyLeft = this.method8070(this.lb.aString108);
					this.bodyRight = this.method8070(this.lb.aString111);
					this.bodyFill = this.method8070(this.lb.aString106);
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
					this.method8061();
				}
			}
			@Pc(315) unpack local315 = null;
			@Pc(323) byte[] local323;
			try {
				Class.forName("java.util.jar.Pack200");
				local323 = this.method8064(Class367.aClass365_2);
				if (local323 == null) {
					return;
				}
				local315 = new unpack_Sub1(local323);
			} catch (@Pc(334) Throwable local334) {
			}
			if (local315 == null) {
				local323 = this.method8064(Class367.aClass365_1);
				if (local323 == null) {
					return;
				}
				@Pc(351) unpack local351 = new unpack(local323);
				@Pc(356) ClassLoader_Sub1 local356 = new ClassLoader_Sub1(local351);
				@Pc(359) Class local359 = Class.forName("unpack");
				local356.method8056(local359.getName(), local359);
				@Pc(369) Class local369 = local356.loadClass("unpackclass");
				@Pc(374) byte[] local374 = this.method8064(Class367.aClass365_3);
				if (local374 == null) {
					return;
				}
				local315 = (unpack) local369.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local374, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local315);
			@Pc(412) Class local412 = Class.forName("Class364");
			local409.method8056(local412.getName(), local412);
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean700) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean702) {
					this.anApplet3.start();
				}
				if (this.aBoolean701) {
					this.anApplet3.stop();
				}
			}
			this.method8066();
		} catch (@Pc(493) Exception local493) {
			RuntimeException_Sub2.anInt9844 = -1714163125;
			if (local493 instanceof InvocationTargetException) {
				@Pc(509) Throwable local509 = ((InvocationTargetException) local493).getTargetException();
				if (local509 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8050(this, local493.toString(), local509);
			} else {
				RuntimeException_Sub2.method8050(this, null, local493);
			}
			this.method8067("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean701 = false;
		this.aBoolean702 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method8071(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method8067("savefile");
			return false;
		}
	}
}
