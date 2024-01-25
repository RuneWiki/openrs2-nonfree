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
	private static String aString148;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString149;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt11318 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean819;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt11319;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt11321;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!e;")
	private Class411 lb;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt11320 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean820 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean822 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean821 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean823 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/awt/Image;")
	private Image method9460(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[3000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(38) Exception local38) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!b;)[B")
	private byte[] method9461(@OriginalArg(1) Class410 arg0) {
		@Pc(11) File local11;
		try {
			local11 = Class413.method9475(arg0.aString136);
		} catch (@Pc(13) Exception local13) {
			this.method9464("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method9473(local11);
		if (!this.method9471(local24, arg0)) {
			local24 = this.method9470(arg0, false);
			if (local24 == null) {
				local24 = this.method9470(arg0, true);
			}
			if (local24 == null) {
				this.method9464("download");
				return null;
			}
			if (!this.method9466(local24, local11)) {
				return null;
			}
			local24 = this.method9473(local11);
			if (!this.method9471(local24, arg0)) {
				this.method9464("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IBI)Z")
	private boolean method9462(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt11319, this.anInt11321);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11319, this.anInt11321);
			}
			@Pc(58) Graphics local58 = this.anImage14.getGraphics();
			@Pc(63) int local63 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(68) int local68 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(73) int local73 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(78) int local78 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(83) int local83 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(88) int local88 = this.bodyFill.getHeight((ImageObserver) null);
			local58.drawImage(this.bodyLeft, this.method9467(local63) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9465(local78) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(130) int local130 = local63 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(140) int local140 = this.lb.boxWidth / 2 + this.lb.boxXOffset;
			@Pc(142) int local142;
			for (local142 = local130; local142 <= local140; local142 += local73) {
				local58.drawImage(this.bodyFill, local142 + this.method9467(local63) + this.lb.boxXOffset, this.method9465(local88) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local58.drawImage(this.bodyRight, this.method9467(local68) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9465(local83) - -this.lb.boxYOffset, (ImageObserver) null);
			local142 = this.left.getWidth((ImageObserver) null);
			@Pc(221) int local221 = this.left.getHeight((ImageObserver) null);
			@Pc(226) int local226 = this.right.getWidth((ImageObserver) null);
			@Pc(231) int local231 = this.right.getHeight((ImageObserver) null);
			@Pc(236) int local236 = this.bottom.getHeight((ImageObserver) null);
			@Pc(241) int local241 = this.top.getWidth((ImageObserver) null);
			@Pc(246) int local246 = this.top.getHeight((ImageObserver) null);
			@Pc(251) int local251 = this.bottom.getWidth((ImageObserver) null);
			@Pc(256) int local256 = this.bar.getWidth((ImageObserver) null);
			@Pc(261) int local261 = this.background.getWidth((ImageObserver) null);
			@Pc(272) int local272 = this.method9467(this.lb.width) + this.lb.xOffset;
			@Pc(283) int local283 = this.method9465(this.lb.height) + this.lb.yOffset;
			local58.drawImage(this.left, local272, (this.lb.height - local221) / 2 + local283, (ImageObserver) null);
			local58.drawImage(this.right, local272 + this.lb.width - local226, (this.lb.height - local231) / 2 + local283, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local226 - local142, this.lb.height);
			}
			@Pc(345) Graphics local345 = this.barBuf.getGraphics();
			@Pc(347) int local347;
			for (local347 = 0; local347 < this.lb.width - local142 - local226; local347 += local241) {
				local345.drawImage(this.top, local347, 0, (ImageObserver) null);
			}
			for (local347 = 0; local347 < this.lb.width - local226 - local142; local347 += local251) {
				local345.drawImage(this.bottom, local347, this.lb.height - local236, (ImageObserver) null);
			}
			local347 = arg2 * (this.lb.width - local142 - local226) / 100;
			if (local347 > 0) {
				@Pc(438) Image local438 = this.createImage(local347, this.lb.height - local246 - local236);
				@Pc(442) int local442 = local438.getWidth((ImageObserver) null);
				@Pc(445) Graphics local445 = local438.getGraphics();
				for (@Pc(450) int local450 = arg1 - local256; local450 < local442; local450 += local256) {
					local445.drawImage(this.bar, local450, 0, (ImageObserver) null);
				}
				local345.drawImage(local438, 0, local246, (ImageObserver) null);
			}
			@Pc(480) int local480 = local347;
			local347 = this.lb.width - local142 - local226 - local347;
			if (local347 > 0) {
				@Pc(509) Image local509 = this.createImage(local347, this.lb.height - local236 - local246);
				@Pc(513) int local513 = local509.getWidth((ImageObserver) null);
				@Pc(516) Graphics local516 = local509.getGraphics();
				for (@Pc(518) int local518 = 0; local518 < local513; local518 += local261) {
					local516.drawImage(this.background, local518, 0, (ImageObserver) null);
				}
				local345.drawImage(local509, local480, local246, (ImageObserver) null);
			}
			local58.drawImage(this.barBuf, local272 + local142, local283, (ImageObserver) null);
			local58.setFont(this.bf);
			local58.setColor(this.colourtext);
			@Pc(578) String local578 = arg0 + " - " + arg2 + "%";
			local58.drawString(local578, local272 + (this.lb.width - this.bfm.stringWidth(local578)) / 2, this.lb.height / 2 + 4 + local283 + this.lb.textYOffset);
			local33.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(618) Exception local618) {
			this.method9468();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean822 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;BII)Z")
	private boolean method9463(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Class412.aClass411Array1[anInt11318] == null || this.aBoolean819 ? this.method9469(arg0, arg2) : this.method9462(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method9464(@OriginalArg(1) String arg0) {
		if (this.aBoolean821) {
			return;
		}
		this.aBoolean821 = true;
		try {
			if (aString148 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString148 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method9465(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt11321 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method9466(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method9464("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean820 = false;
		this.aBoolean823 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method9467(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt11319 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9468() {
		this.bfm = null;
		this.bf = null;
		this.aBoolean819 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
	private boolean method9469(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class412.anIntArray645[anInt11318]);
			this.aColor2 = new Color(Class412.anIntArray644[anInt11318]);
			this.colourtext = new Color(Class412.anIntArray643[anInt11318]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(90) int local90;
		@Pc(97) int local97;
		@Pc(169) String local169;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt11319, this.anInt11321);
			}
			@Pc(68) Graphics local68 = this.anImage14.getGraphics();
			local68.setColor(Color.black);
			local68.fillRect(0, 0, this.anInt11319, this.anInt11321);
			local68.setColor(this.aColor3);
			local90 = this.anInt11319 / 2 - 152;
			local97 = this.anInt11321 / 2 - 18;
			local68.drawRect(local90, local97, 303, 33);
			local68.setColor(this.aColor2);
			local68.fillRect(local90 + 2, local97 + 2, arg1 * 3, 30);
			local68.setColor(Color.black);
			local68.drawRect(local90 + 1, local97 + 1, 301, 31);
			local68.fillRect(local90 + arg1 * 3 + 2, local97 + 2, 300 - arg1 * 3, 30);
			local68.setFont(this.bf);
			local169 = arg0 + " - " + arg1 + "%";
			local68.setColor(this.colourtext);
			local68.drawString(local169, (this.anInt11319 - this.bfm.stringWidth(local169)) / 2, this.anInt11321 / 2 + 4);
			local50.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(201) Exception local201) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt11319, this.anInt11321);
			local50.setColor(this.aColor3);
			local90 = this.anInt11319 / 2 - 152;
			local97 = this.anInt11321 / 2 - 18;
			local50.drawRect(local90, local97, 303, 33);
			local50.setColor(this.aColor2);
			local50.fillRect(local90 + 2, local97 - -2, arg1 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local90 + 1, local97 - -1, 301, 31);
			local50.fillRect(local90 + arg1 * 3 + 2, local97 + 2, 300 - arg1 * 3, 30);
			local169 = arg0 + " - " + arg1 + "%";
			local50.setFont(this.bf);
			local50.setColor(this.colourtext);
			local50.drawString(local169, (this.anInt11319 - this.bfm.stringWidth(local169)) / 2, this.anInt11321 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!b;Z)[B")
	private byte[] method9470(@OriginalArg(1) Class410 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt11313];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(38) InputStream local38;
			if (arg1) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg0.aString135 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg0.aString135)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local84 < local5.length) {
					@Pc(100) int local100 = local5.length - local84;
					if (local100 > 1000) {
						local100 = 1000;
					}
					@Pc(111) int local111 = local38.read(local5, local84, local100);
					if (local111 >= 0) {
						local84 += local111;
						@Pc(132) int local132 = local84 * 100 / local5.length;
						@Pc(134) int local134 = 0;
						if (this.lb != null && this.bar != null) {
							local134 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local132 != local82 || local134 != local86) {
							try {
								if (this.method9463(arg0.aStringArray43[this.anInt11320], local134, local132)) {
									local82 = local132;
									local86 = local134;
								}
							} catch (@Pc(180) Exception local180) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local38.close();
				if (arg0.anInt11313 != arg0.anInt11314) {
					@Pc(194) byte[] local194 = new byte[arg0.anInt11314];
					@Pc(199) Inflater local199 = new Inflater(true);
					local199.setInput(local5);
					local5 = local194;
					local199.inflate(local194);
				}
				break;
			}
		} catch (@Pc(210) Exception local210) {
			return null;
		}
		return this.method9471(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString149 = this.getParameter("unsignedurl");
			if (aString149 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean821 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString149), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString148 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class412.aStringArray44.length) {
					local37 = 0;
				}
			}
			@Pc(60) String local60 = this.getParameter("colourid");
			if (local60 != null) {
				anInt11318 = Integer.parseInt(local60);
				if (anInt11318 < 0 || anInt11318 >= Class412.anIntArray645.length) {
					anInt11318 = 0;
				}
			}
			this.lb = Class412.aClass411Array1[anInt11318];
			this.anInt11319 = this.getSize().width;
			this.anInt11321 = this.getSize().height;
			@Pc(97) int local97 = 32;
			try {
				@Pc(102) int local102 = Integer.parseInt(this.getParameter("modewhat"));
				local97 += local102;
			} catch (@Pc(108) Exception local108) {
			}
			try {
				@Pc(112) String local112 = this.getParameter("lang");
				if (local112 != null) {
					this.anInt11320 = Integer.parseInt(local112);
				}
			} catch (@Pc(121) Exception local121) {
			}
			Class413.method9476(local97, Class412.aStringArray44[local37]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString147, 0, this.lb.anInt11316);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt11317);
					this.bar = this.method9460(this.lb.aString142);
					this.background = this.method9460(this.lb.aString144);
					this.left = this.method9460(this.lb.aString138);
					this.right = this.method9460(this.lb.aString145);
					this.top = this.method9460(this.lb.aString141);
					this.bottom = this.method9460(this.lb.aString146);
					this.bodyLeft = this.method9460(this.lb.aString139);
					this.bodyRight = this.method9460(this.lb.aString140);
					this.bodyFill = this.method9460(this.lb.aString143);
					@Pc(277) Image[] local277 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(282) MediaTracker local282 = new MediaTracker(this);
					for (@Pc(284) int local284 = 0; local284 < local277.length; local284++) {
						local282.addImage(local277[local284], local284);
					}
					while (true) {
						try {
							local282.waitForAll();
							break;
						} catch (@Pc(301) InterruptedException local301) {
						}
					}
				} catch (@Pc(305) Throwable local305) {
					this.method9468();
				}
			}
			@Pc(310) unpack local310 = null;
			@Pc(318) byte[] local318;
			try {
				Class.forName("java.util.jar.Pack200");
				local318 = this.method9461(Class412.aClass410_2);
				if (local318 == null) {
					return;
				}
				local310 = new unpack_Sub1(local318);
			} catch (@Pc(328) Throwable local328) {
			}
			if (local310 == null) {
				local318 = this.method9461(Class412.aClass410_1);
				if (local318 == null) {
					return;
				}
				@Pc(345) unpack local345 = new unpack(local318);
				@Pc(350) ClassLoader_Sub1 local350 = new ClassLoader_Sub1(local345);
				@Pc(353) Class local353 = Class.forName("unpack");
				local350.method9459(local353.getName(), local353);
				@Pc(363) Class local363 = local350.loadClass("unpackclass");
				@Pc(368) byte[] local368 = this.method9461(Class412.aClass410_3);
				if (local368 == null) {
					return;
				}
				local310 = (unpack) local363.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local368, Boolean.TRUE);
			}
			@Pc(404) ClassLoader_Sub1 local404 = new ClassLoader_Sub1(local310);
			@Pc(407) Class local407 = Class.forName("Class413");
			local404.method9459(local407.getName(), local407);
			@Pc(417) Class local417 = local404.loadClass("client");
			synchronized (this) {
				if (this.aBoolean822) {
					return;
				}
				this.anApplet3 = (Applet) local417.getDeclaredConstructor().newInstance();
				local417.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet3.init();
				if (this.aBoolean823) {
					this.anApplet3.start();
				}
				if (this.aBoolean820) {
					this.anApplet3.stop();
				}
			}
			this.method9472();
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt11315 = 1249948486;
			if (local488 instanceof InvocationTargetException) {
				@Pc(497) Throwable local497 = ((InvocationTargetException) local488).getTargetException();
				if (local497 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9456(this, local497, local488.toString());
			} else {
				RuntimeException_Sub2.method9456(this, local488, (String) null);
			}
			this.method9464("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!b;I)Z")
	private boolean method9471(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class410 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(23) byte[] local23 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray642[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method9464("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method9472() {
		this.aColor3 = null;
		this.aColor2 = null;
		this.anImage14 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean822 = true;
		this.aBoolean823 = this.aBoolean820 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean820 = true;
		this.aBoolean823 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method9473(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local16];
			local27.readFully(local30, 0, local16);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}
}
