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
	private static String aString130;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString131;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt10792 = 0;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!f;")
	private Class383 lb;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10793;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean855;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt10794;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean853 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean854 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt10791 = 0;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean856 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean857 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;)[B")
	private byte[] method8808(@OriginalArg(1) Class384 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class386.method8822(arg0.aString129);
		} catch (@Pc(6) Exception local6) {
			this.method8816("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method8820(local4);
		if (!this.method8821(arg0, local23)) {
			local23 = this.method8812(arg0, false);
			if (local23 == null) {
				local23 = this.method8812(arg0, true);
			}
			if (local23 == null) {
				this.method8816("download");
				return null;
			}
			if (!this.method8814(local23, local4)) {
				return null;
			}
			local23 = this.method8820(local4);
			if (!this.method8821(arg0, local23)) {
				this.method8816("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8809(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class385.aClass383Array1[anInt10792] == null || this.aBoolean855 ? this.method8813(arg1, arg0) : this.method8810(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean857 = true;
		this.aBoolean856 = this.aBoolean854 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IIB)Z")
	private boolean method8810(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10794, this.anInt10793);
			this.canvas.setVisible(true);
		}
		@Pc(38) Graphics local38 = this.canvas.getGraphics();
		if (local38 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10794, this.anInt10793);
			}
			@Pc(61) Graphics local61 = this.anImage14.getGraphics();
			@Pc(66) int local66 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(71) int local71 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(76) int local76 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(86) int local86 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(91) int local91 = this.bodyFill.getHeight((ImageObserver) null);
			local61.drawImage(this.bodyLeft, this.method8818(local66) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8815(local81) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(132) int local132 = local66 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(142) int local142 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(144) int local144;
			for (local144 = local132; local144 <= local142; local144 += local76) {
				local61.drawImage(this.bodyFill, local144 + this.method8818(local66) + this.lb.boxXOffset, this.method8815(local91) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local61.drawImage(this.bodyRight, this.method8818(local71) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8815(local86) - -this.lb.boxYOffset, (ImageObserver) null);
			local144 = this.left.getWidth((ImageObserver) null);
			@Pc(219) int local219 = this.left.getHeight((ImageObserver) null);
			@Pc(224) int local224 = this.right.getWidth((ImageObserver) null);
			@Pc(229) int local229 = this.right.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.bottom.getHeight((ImageObserver) null);
			@Pc(239) int local239 = this.top.getWidth((ImageObserver) null);
			@Pc(244) int local244 = this.top.getHeight((ImageObserver) null);
			@Pc(249) int local249 = this.bottom.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.bar.getWidth((ImageObserver) null);
			@Pc(259) int local259 = this.background.getWidth((ImageObserver) null);
			@Pc(271) int local271 = this.method8818(this.lb.width) + this.lb.xOffset;
			@Pc(283) int local283 = this.method8815(this.lb.height) + this.lb.yOffset;
			local61.drawImage(this.left, local271, (this.lb.height - local219) / 2 + local283, (ImageObserver) null);
			local61.drawImage(this.right, local271 + this.lb.width - local224, (-local229 + this.lb.height) / 2 + local283, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local224 - local144, this.lb.height);
			}
			@Pc(349) Graphics local349 = this.barBuf.getGraphics();
			@Pc(351) int local351;
			for (local351 = 0; local351 < this.lb.width - local144 - local224; local351 += local239) {
				local349.drawImage(this.top, local351, 0, (ImageObserver) null);
			}
			for (local351 = 0; local351 < this.lb.width - local224 - local144; local351 += local249) {
				local349.drawImage(this.bottom, local351, this.lb.height - local234, (ImageObserver) null);
			}
			local351 = arg2 * (this.lb.width - local144 - local224) / 100;
			if (local351 > 0) {
				@Pc(438) Image local438 = this.createImage(local351, this.lb.height - local234 - local244);
				@Pc(442) int local442 = local438.getWidth((ImageObserver) null);
				@Pc(445) Graphics local445 = local438.getGraphics();
				for (@Pc(450) int local450 = arg1 - local254; local450 < local442; local450 += local254) {
					local445.drawImage(this.bar, local450, 0, (ImageObserver) null);
				}
				local349.drawImage(local438, 0, local244, (ImageObserver) null);
			}
			@Pc(480) int local480 = local351;
			local351 = this.lb.width - local144 - local224 - local351;
			if (local351 > 0) {
				@Pc(510) Image local510 = this.createImage(local351, this.lb.height - local234 - local244);
				@Pc(514) int local514 = local510.getWidth((ImageObserver) null);
				@Pc(517) Graphics local517 = local510.getGraphics();
				for (@Pc(519) int local519 = 0; local519 < local514; local519 += local259) {
					local517.drawImage(this.background, local519, 0, (ImageObserver) null);
				}
				local349.drawImage(local510, local480, local244, (ImageObserver) null);
			}
			local61.drawImage(this.barBuf, local144 + local271, local283, (ImageObserver) null);
			local61.setFont(this.bf);
			local61.setColor(this.colourtext);
			@Pc(574) String local574 = arg0 + " - " + arg2 + "%";
			local61.drawString(local574, (this.lb.width - this.bfm.stringWidth(local574)) / 2 + local271, this.lb.height / 2 + 4 + local283 + this.lb.textYOffset);
			local38.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(612) Exception local612) {
			this.method8811();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean856 = true;
		this.aBoolean854 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8811() {
		this.bf = null;
		this.bfm = null;
		this.aBoolean855 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;ZZ)[B")
	private byte[] method8812(@OriginalArg(0) Class384 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10789];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(31) InputStream local31;
			if (arg1) {
				@Pc(36) URL local36 = this.getCodeBase();
				@Pc(44) Socket local44 = new Socket(InetAddress.getByName(local36.getHost()), 443);
				local44.setSoTimeout(10000);
				@Pc(50) OutputStream local50 = local44.getOutputStream();
				local50.write(17);
				local50.write(("JAGGRAB " + local36.getFile() + arg0.aString128 + "\n\n").getBytes());
				local31 = local44.getInputStream();
			} else {
				local31 = (new URL(this.getCodeBase(), arg0.aString128)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			while (true) {
				if (local5.length <= local77) {
					local31.close();
					if (arg0.anInt10790 != arg0.anInt10789) {
						@Pc(192) byte[] local192 = new byte[arg0.anInt10790];
						@Pc(197) Inflater local197 = new Inflater(true);
						local197.setInput(local5);
						local197.inflate(local192);
						local5 = local192;
					}
					break;
				}
				@Pc(99) int local99 = local5.length - local77;
				if (local99 > 1000) {
					local99 = 1000;
				}
				@Pc(112) int local112 = local31.read(local5, local77, local99);
				if (local112 < 0) {
					throw new EOFException();
				}
				local77 += local112;
				@Pc(130) int local130 = local77 * 100 / local5.length;
				@Pc(132) int local132 = 0;
				if (this.lb != null && this.bar != null) {
					local132 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local75 != local130 || local79 != local132) {
					try {
						if (this.method8809(local130, arg0.aStringArray41[this.anInt10791], local132)) {
							local75 = local130;
							local79 = local132;
						}
					} catch (@Pc(179) Exception local179) {
					}
				}
			}
		} catch (@Pc(208) Exception local208) {
			return null;
		}
		return this.method8821(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	private boolean method8813(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class385.anIntArray576[anInt10792]);
			this.aColor2 = new Color(Class385.anIntArray577[anInt10792]);
			this.colourtext = new Color(Class385.anIntArray575[anInt10792]);
		}
		@Pc(47) Graphics local47 = this.getGraphics();
		if (local47 == null) {
			this.repaint();
			return false;
		}
		@Pc(87) int local87;
		@Pc(94) int local94;
		@Pc(165) String local165;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10794, this.anInt10793);
			}
			@Pc(65) Graphics local65 = this.anImage14.getGraphics();
			local65.setColor(Color.black);
			local65.fillRect(0, 0, this.anInt10794, this.anInt10793);
			local65.setColor(this.aColor3);
			local87 = this.anInt10794 / 2 - 152;
			local94 = this.anInt10793 / 2 - 18;
			local65.drawRect(local87, local94, 303, 33);
			local65.setColor(this.aColor2);
			local65.fillRect(local87 + 2, local94 + 2, arg1 * 3, 30);
			local65.setColor(Color.black);
			local65.drawRect(local87 + 1, local94 + 1, 301, 31);
			local65.fillRect(local87 + arg1 * 3 + 2, local94 + 2, 300 - arg1 * 3, 30);
			local65.setFont(this.bf);
			local165 = arg0 + " - " + arg1 + "%";
			local65.setColor(this.colourtext);
			local65.drawString(local165, (this.anInt10794 - this.bfm.stringWidth(local165)) / 2, this.anInt10793 / 2 + 4);
			local47.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(198) Exception local198) {
			local47.setColor(Color.black);
			local47.fillRect(0, 0, this.anInt10794, this.anInt10793);
			local47.setColor(this.aColor3);
			local87 = this.anInt10794 / 2 - 152;
			local94 = this.anInt10793 / 2 - 18;
			local47.drawRect(local87, local94, 303, 33);
			local47.setColor(this.aColor2);
			local47.fillRect(local87 + 2, local94 + 2, arg1 * 3, 30);
			local47.setColor(Color.black);
			local47.drawRect(local87 + 1, local94 + 1, 301, 31);
			local47.fillRect(arg1 * 3 + local87 + 2, local94 + 2, 300 - arg1 * 3, 30);
			local165 = arg0 + " - " + arg1 + "%";
			local47.setFont(this.bf);
			local47.setColor(this.colourtext);
			local47.drawString(local165, (this.anInt10794 - this.bfm.stringWidth(local165)) / 2, this.anInt10793 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method8814(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg1);
			local11.write(arg0, 0, arg0.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method8816("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8815(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10793 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean854 = true;
		this.aBoolean856 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method8816(@OriginalArg(1) String arg0) {
		if (this.aBoolean853) {
			return;
		}
		this.aBoolean853 = true;
		try {
			if (aString131 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString131 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8817() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
		this.aColor2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method8818(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10794 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/awt/Image;")
	private Image method8819(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22;
			while ((local22 = local6.read()) != -1) {
				local9[local17++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString130 = this.getParameter("unsignedurl");
			if (aString130 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean853 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString130), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			aString131 = this.getParameter("crashurl");
			@Pc(40) int local40 = 0;
			@Pc(44) String local44 = this.getParameter("cachesubdirid");
			if (local44 != null) {
				local40 = Integer.parseInt(local44);
				if (local40 < 0 || local40 >= Class385.aStringArray42.length) {
					local40 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt10792 = Integer.parseInt(local68);
				if (anInt10792 < 0 || anInt10792 >= Class385.anIntArray576.length) {
					anInt10792 = 0;
				}
			}
			this.lb = Class385.aClass383Array1[anInt10792];
			this.anInt10794 = this.getSize().width;
			this.anInt10793 = this.getSize().height;
			@Pc(103) int local103 = 32;
			try {
				@Pc(108) int local108 = Integer.parseInt(this.getParameter("modewhat"));
				local103 += local108;
			} catch (@Pc(114) Exception local114) {
			}
			try {
				@Pc(118) String local118 = this.getParameter("lang");
				if (local118 != null) {
					this.anInt10791 = Integer.parseInt(local118);
				}
			} catch (@Pc(127) Exception local127) {
			}
			Class386.method8824(local103, Class385.aStringArray42[local40]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString124, 0, this.lb.anInt10787);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10788);
					this.bar = this.method8819(this.lb.aString120);
					this.background = this.method8819(this.lb.aString127);
					this.left = this.method8819(this.lb.aString121);
					this.right = this.method8819(this.lb.aString119);
					this.top = this.method8819(this.lb.aString118);
					this.bottom = this.method8819(this.lb.aString125);
					this.bodyLeft = this.method8819(this.lb.aString123);
					this.bodyRight = this.method8819(this.lb.aString126);
					this.bodyFill = this.method8819(this.lb.aString122);
					@Pc(284) Image[] local284 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(289) MediaTracker local289 = new MediaTracker(this);
					for (@Pc(291) int local291 = 0; local291 < local284.length; local291++) {
						local289.addImage(local284[local291], local291);
					}
					while (true) {
						try {
							local289.waitForAll();
							break;
						} catch (@Pc(308) InterruptedException local308) {
						}
					}
				} catch (@Pc(312) Throwable local312) {
					this.method8811();
				}
			}
			@Pc(317) unpack local317 = null;
			@Pc(325) byte[] local325;
			try {
				Class.forName("java.util.jar.Pack200");
				local325 = this.method8808(Class385.aClass384_2);
				if (local325 == null) {
					return;
				}
				local317 = new unpack_Sub1(local325);
			} catch (@Pc(335) Throwable local335) {
			}
			if (local317 == null) {
				local325 = this.method8808(Class385.aClass384_1);
				if (local325 == null) {
					return;
				}
				@Pc(351) unpack local351 = new unpack(local325);
				@Pc(356) ClassLoader_Sub1 local356 = new ClassLoader_Sub1(local351);
				@Pc(359) Class local359 = Class.forName("unpack");
				local356.method8802(local359, local359.getName());
				@Pc(369) Class local369 = local356.loadClass("unpackclass");
				@Pc(374) byte[] local374 = this.method8808(Class385.aClass384_3);
				if (local374 == null) {
					return;
				}
				local317 = (unpack) local369.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local374, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local317);
			@Pc(412) Class local412 = Class.forName("Class386");
			local409.method8802(local412, local412.getName());
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean857) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean856) {
					this.anApplet3.start();
				}
				if (this.aBoolean854) {
					this.anApplet3.stop();
				}
			}
			this.method8817();
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt10786 = -1847900166;
			if (local491 instanceof InvocationTargetException) {
				@Pc(500) Throwable local500 = ((InvocationTargetException) local491).getTargetException();
				if (local500 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8803(local491.toString(), this, local500);
			} else {
				RuntimeException_Sub2.method8803((String) null, this, local491);
			}
			this.method8816("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method8820(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local9];
			local27.readFully(local30, 0, local9);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;[BI)Z")
	private boolean method8821(@OriginalArg(0) Class384 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg0.anIntArray574[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method8816("sha");
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
		this.aBoolean857 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}
}
