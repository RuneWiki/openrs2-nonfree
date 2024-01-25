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
	private static String aString151;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString152;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt10471 = 0;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt10472;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt10473;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet5;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!a;")
	private Class363 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean861;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean859 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean857 = false;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "I")
	private int anInt10474 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean858 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean860 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method8462(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg1);
			local12.write(arg0, 0, arg0.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method8473("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;B)Z")
	private boolean method8463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10472, this.anInt10473);
			this.canvas.setVisible(true);
		}
		@Pc(40) Graphics local40 = this.canvas.getGraphics();
		if (local40 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10472, this.anInt10473);
			}
			@Pc(62) Graphics local62 = this.anImage14.getGraphics();
			@Pc(67) int local67 = this.bodyLeft.getWidth(null);
			@Pc(72) int local72 = this.bodyRight.getWidth(null);
			@Pc(77) int local77 = this.bodyFill.getWidth(null);
			@Pc(82) int local82 = this.bodyLeft.getHeight(null);
			@Pc(87) int local87 = this.bodyRight.getHeight(null);
			@Pc(92) int local92 = this.bodyFill.getHeight(null);
			local62.drawImage(this.bodyLeft, (this.anInt10472 - local67) / 2 - 161, (-local82 + this.anInt10473) / 2 + 214, null);
			@Pc(118) int local118;
			for (local118 = -144; local118 <= 144; local118 += 32) {
				local62.drawImage(this.bodyFill, (this.anInt10472 - local77) / 2 - local118, (-local92 + this.anInt10473) / 2 + 214, null);
			}
			local62.drawImage(this.bodyRight, (this.anInt10472 - local72) / 2 + 161, (this.anInt10473 - local87) / 2 + 214, null);
			local118 = this.left.getWidth(null);
			@Pc(182) int local182 = this.left.getHeight(null);
			@Pc(187) int local187 = this.right.getWidth(null);
			@Pc(192) int local192 = this.right.getHeight(null);
			@Pc(197) int local197 = this.bottom.getHeight(null);
			@Pc(202) int local202 = this.top.getWidth(null);
			@Pc(207) int local207 = this.top.getHeight(null);
			@Pc(212) int local212 = this.bottom.getWidth(null);
			@Pc(217) int local217 = this.bar.getWidth(null);
			@Pc(222) int local222 = this.background.getWidth(null);
			@Pc(236) int local236 = (this.anInt10472 - this.lb.width) / 2 + this.lb.xOffset;
			@Pc(250) int local250 = this.lb.yOffset + (this.anInt10473 - this.lb.height) / 2;
			local62.drawImage(this.left, local236, (this.lb.height - local182) / 2 + local250, null);
			local62.drawImage(this.right, this.lb.width + local236 - local187, (this.lb.height + -local192) / 2 + local250, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local118 - local187, this.lb.height);
			}
			@Pc(312) Graphics local312 = this.barBuf.getGraphics();
			@Pc(314) int local314;
			for (local314 = 0; local314 < this.lb.width - local118 - local187; local314 += local202) {
				local312.drawImage(this.top, local314, 0, null);
			}
			for (local314 = 0; local314 < this.lb.width - local187 - local118; local314 += local212) {
				local312.drawImage(this.bottom, local314, this.lb.height - local197, null);
			}
			local314 = arg1 * (this.lb.width - local187 - local118) / 100;
			if (local314 > 0) {
				@Pc(408) Image local408 = this.createImage(local314, this.lb.height - local197 - local207);
				@Pc(412) int local412 = local408.getWidth(null);
				@Pc(415) Graphics local415 = local408.getGraphics();
				for (@Pc(419) int local419 = arg0 - local217; local419 < local412; local419 += local217) {
					local415.drawImage(this.bar, local419, 0, null);
				}
				local312.drawImage(local408, 0, local207, null);
			}
			@Pc(445) int local445 = local314;
			local314 = this.lb.width - local314 - local118 - local187;
			if (local314 > 0) {
				@Pc(471) Image local471 = this.createImage(local314, this.lb.height - local197 - local207);
				@Pc(475) int local475 = local471.getWidth(null);
				@Pc(478) Graphics local478 = local471.getGraphics();
				for (@Pc(480) int local480 = 0; local480 < local475; local480 += local222) {
					local478.drawImage(this.background, local480, 0, null);
				}
				local312.drawImage(local471, local445, local207, null);
			}
			local62.drawImage(this.barBuf, local236 + local118, local250, null);
			local62.setFont(this.bf);
			local62.setColor(this.colourtext);
			@Pc(539) String local539 = arg2 + " - " + arg1 + "%";
			local62.drawString(local539, (this.lb.width - this.bfm.stringWidth(local539)) / 2 + local236, this.lb.textYOffset + 4 + local250 - -(this.lb.height / 2));
			local40.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(579) Exception local579) {
			this.method8464();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8464() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean861 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8465() {
		this.aColor2 = null;
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;)[B")
	private byte[] method8466(@OriginalArg(1) Class365 arg0) {
		@Pc(11) File local11;
		try {
			local11 = Class366.method8456(arg0.aString146);
		} catch (@Pc(13) Exception local13) {
			this.method8473("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method8467(local11);
		if (!this.method8469(arg0, local26)) {
			local26 = this.method8471(false, arg0);
			if (local26 == null) {
				local26 = this.method8471(true, arg0);
			}
			if (local26 == null) {
				this.method8473("download");
				return null;
			}
			if (!this.method8462(local26, local11)) {
				return null;
			}
			local26 = this.method8467(local11);
			if (!this.method8469(arg0, local26)) {
				this.method8473("mismatch");
				return null;
			}
		}
		return local26;
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

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean857 = true;
		this.aBoolean860 = this.aBoolean859 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.destroy();
		}
		this.anApplet5 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method8467(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) arg0.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local13];
			local24.readFully(local27, 0, local13);
			local24.close();
			return local27;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;B)Z")
	private boolean method8468(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class364.anIntArray685[anInt10471]);
			this.aColor2 = new Color(Class364.anIntArray684[anInt10471]);
			this.colourtext = new Color(Class364.anIntArray686[anInt10471]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(92) int local92;
		@Pc(99) int local99;
		@Pc(170) String local170;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10472, this.anInt10473);
			}
			@Pc(70) Graphics local70 = this.anImage14.getGraphics();
			local70.setColor(Color.black);
			local70.fillRect(0, 0, this.anInt10472, this.anInt10473);
			local70.setColor(this.aColor3);
			local92 = this.anInt10472 / 2 - 152;
			local99 = this.anInt10473 / 2 - 18;
			local70.drawRect(local92, local99, 303, 33);
			local70.setColor(this.aColor2);
			local70.fillRect(local92 + 2, local99 - -2, arg0 * 3, 30);
			local70.setColor(Color.black);
			local70.drawRect(local92 + 1, local99 + 1, 301, 31);
			local70.fillRect(arg0 * 3 + local92 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local70.setFont(this.bf);
			local170 = arg1 + " - " + arg0 + "%";
			local70.setColor(this.colourtext);
			local70.drawString(local170, (this.anInt10472 - this.bfm.stringWidth(local170)) / 2, this.anInt10473 / 2 + 4);
			local50.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(203) Exception local203) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt10472, this.anInt10473);
			local50.setColor(this.aColor3);
			local92 = this.anInt10472 / 2 - 152;
			local99 = this.anInt10473 / 2 - 18;
			local50.drawRect(local92, local99, 303, 33);
			local50.setColor(this.aColor2);
			local50.fillRect(local92 + 2, local99 + 2, arg0 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local92 + 1, local99 + 1, 301, 31);
			local50.fillRect(arg0 * 3 + local92 + 2, local99 + 2, 300 - arg0 * 3, 30);
			local170 = arg1 + " - " + arg0 + "%";
			local50.setFont(this.bf);
			local50.setColor(this.colourtext);
			local50.drawString(local170, (this.anInt10472 - this.bfm.stringWidth(local170)) / 2, this.anInt10473 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;B[B)Z")
	private boolean method8469(@OriginalArg(0) Class365 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray687[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method8473("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean859 = true;
		this.aBoolean860 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;II)Z")
	private boolean method8470(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return Class364.aClass363Array1[anInt10471] == null || this.aBoolean861 ? this.method8468(arg0, arg1) : this.method8463(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!f;)[B")
	private byte[] method8471(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class365 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10467];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(69) InputStream local69;
			if (arg0) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg1.aString147 + "\n\n").getBytes());
				local69 = local40.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg1.aString147)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local5.length <= local84) {
					local69.close();
					if (arg1.anInt10467 != arg1.anInt10468) {
						@Pc(201) byte[] local201 = new byte[arg1.anInt10468];
						@Pc(206) Inflater local206 = new Inflater(true);
						local206.setInput(local5);
						local206.inflate(local201);
						local5 = local201;
					}
					break;
				}
				@Pc(100) int local100 = local5.length - local84;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(112) int local112 = local69.read(local5, local84, local100);
				if (local112 < 0) {
					throw new EOFException();
				}
				local84 += local112;
				@Pc(132) int local132 = local84 * 100 / local5.length;
				@Pc(134) int local134 = 0;
				if (this.lb != null && this.bar != null) {
					local134 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local132 != local82 || local134 != local86) {
					try {
						if (this.method8470(local132, arg1.aStringArray39[this.anInt10474], local134)) {
							local86 = local134;
							local82 = local132;
						}
					} catch (@Pc(187) Exception local187) {
					}
				}
			}
		} catch (@Pc(217) Exception local217) {
			return null;
		}
		return this.method8469(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean860 = true;
		this.aBoolean859 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString152 = this.getParameter("unsignedurl");
			if (aString152 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean858 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString152), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString151 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class364.aStringArray38.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10471 = Integer.parseInt(local64);
				if (anInt10471 < 0 || anInt10471 >= Class364.anIntArray685.length) {
					anInt10471 = 0;
				}
			}
			this.lb = Class364.aClass363Array1[anInt10471];
			this.anInt10472 = this.getSize().width;
			this.anInt10473 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt10474 = Integer.parseInt(local115);
				}
			} catch (@Pc(124) Exception local124) {
			}
			Class366.method8458(Class364.aStringArray38[local38], local100);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString145, 0, this.lb.anInt10465);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10466);
					this.bar = this.method8472(this.lb.aString139);
					this.background = this.method8472(this.lb.aString143);
					this.left = this.method8472(this.lb.aString144);
					this.right = this.method8472(this.lb.aString142);
					this.top = this.method8472(this.lb.aString138);
					this.bottom = this.method8472(this.lb.aString141);
					this.bodyLeft = this.method8472(this.lb.aString137);
					this.bodyRight = this.method8472(this.lb.aString140);
					this.bodyFill = this.method8472(this.lb.aString136);
					@Pc(280) Image[] local280 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(285) MediaTracker local285 = new MediaTracker(this);
					for (@Pc(287) int local287 = 0; local287 < local280.length; local287++) {
						local285.addImage(local280[local287], local287);
					}
					while (true) {
						try {
							local285.waitForAll();
							break;
						} catch (@Pc(304) InterruptedException local304) {
						}
					}
				} catch (@Pc(308) Throwable local308) {
					this.method8464();
				}
			}
			@Pc(313) unpack local313 = null;
			@Pc(321) byte[] local321;
			try {
				Class.forName("java.util.jar.Pack200");
				local321 = this.method8466(Class364.aClass365_2);
				if (local321 == null) {
					return;
				}
				local313 = new unpack_Sub1(local321);
			} catch (@Pc(332) Throwable local332) {
			}
			if (local313 == null) {
				local321 = this.method8466(Class364.aClass365_1);
				if (local321 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local321);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method8450(local358, local358.getName());
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method8466(Class364.aClass365_3);
				if (local373 == null) {
					return;
				}
				local313 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(408) ClassLoader_Sub1 local408 = new ClassLoader_Sub1(local313);
			@Pc(411) Class local411 = Class.forName("Class366");
			local408.method8450(local411, local411.getName());
			@Pc(421) Class local421 = local408.loadClass("client");
			synchronized (this) {
				if (this.aBoolean857) {
					return;
				}
				this.anApplet5 = (Applet) local421.getDeclaredConstructor().newInstance();
				local421.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet5.init();
				if (this.aBoolean860) {
					this.anApplet5.start();
				}
				if (this.aBoolean859) {
					this.anApplet5.stop();
				}
			}
			this.method8465();
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt10469 = 441801193;
			if (local491 instanceof InvocationTargetException) {
				@Pc(507) Throwable local507 = ((InvocationTargetException) local491).getTargetException();
				if (local507 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8454(local507, local491.toString(), this);
			} else {
				RuntimeException_Sub2.method8454(local491, null, this);
			}
			this.method8473("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/awt/Image;")
	private Image method8472(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(11) InputStream local11 = this.getClass().getResourceAsStream(arg0);
			@Pc(14) byte[] local14 = new byte[1000];
			@Pc(16) int local16 = 0;
			@Pc(21) int local21;
			while ((local21 = local11.read()) != -1) {
				local14[local16++] = (byte) local21;
			}
			return Toolkit.getDefaultToolkit().createImage(local14);
		} catch (@Pc(37) Exception local37) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8473(@OriginalArg(0) String arg0) {
		if (this.aBoolean858) {
			return;
		}
		this.aBoolean858 = true;
		try {
			if (aString151 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString151 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}
}
