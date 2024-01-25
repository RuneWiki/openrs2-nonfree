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
	private static String aString162;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString163;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt10516 = 0;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean849;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!a;")
	private Class386 lb;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt10515;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet7;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt10517;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean850 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean851 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean852 = false;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "I")
	private int anInt10518 = 0;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean853 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BZ)Z")
	private boolean method8932(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method8933("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet7 != null) {
			this.anApplet7.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method8933(@OriginalArg(0) String arg0) {
		if (this.aBoolean851) {
			return;
		}
		this.aBoolean851 = true;
		try {
			if (aString163 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString163 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method8934(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean852 = true;
		this.aBoolean853 = false;
		if (this.anApplet7 != null) {
			this.anApplet7.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean852 = this.aBoolean853 = false;
		this.aBoolean850 = true;
		if (this.anApplet7 != null) {
			this.anApplet7.destroy();
		}
		this.anApplet7 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8935() {
		this.aColor2 = null;
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLloader!e;)Z")
	private boolean method8936(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class389 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg1.anIntArray849[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(38) Exception local38) {
			this.method8933("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	private boolean method8937(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class388.anIntArray846[anInt10516]);
			this.aColor3 = new Color(Class388.anIntArray847[anInt10516]);
			this.colourtext = new Color(Class388.anIntArray848[anInt10516]);
		}
		@Pc(43) Graphics local43 = this.getGraphics();
		if (local43 == null) {
			this.repaint();
			return false;
		}
		@Pc(97) int local97;
		@Pc(104) int local104;
		@Pc(171) String local171;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10517, this.anInt10515);
			}
			@Pc(75) Graphics local75 = this.anImage14.getGraphics();
			local75.setColor(Color.black);
			local75.fillRect(0, 0, this.anInt10517, this.anInt10515);
			local75.setColor(this.aColor2);
			local97 = this.anInt10517 / 2 - 152;
			local104 = this.anInt10515 / 2 - 18;
			local75.drawRect(local97, local104, 303, 33);
			local75.setColor(this.aColor3);
			local75.fillRect(local97 + 2, local104 + 2, arg1 * 3, 30);
			local75.setColor(Color.black);
			local75.drawRect(local97 + 1, local104 - -1, 301, 31);
			local75.fillRect(local97 + arg1 * 3 + 2, local104 - -2, 300 - arg1 * 3, 30);
			local171 = arg0 + " - " + arg1 + "%";
			local75.setFont(this.bf);
			local75.setColor(this.colourtext);
			local75.drawString(local171, (this.anInt10517 - this.bfm.stringWidth(local171)) / 2, this.anInt10515 / 2 + 4);
			local43.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(207) Exception local207) {
			local43.setColor(Color.black);
			local43.fillRect(0, 0, this.anInt10517, this.anInt10515);
			local43.setColor(this.aColor2);
			local97 = this.anInt10517 / 2 - 152;
			local104 = this.anInt10515 / 2 - 18;
			local43.drawRect(local97, local104, 303, 33);
			local43.setColor(this.aColor3);
			local43.fillRect(local97 + 2, local104 - -2, arg1 * 3, 30);
			local43.setColor(Color.black);
			local43.drawRect(local97 + 1, local104 + 1, 301, 31);
			local43.fillRect(arg1 * 3 + local97 + 2, local104 + 2, 300 - arg1 * 3, 30);
			local171 = arg0 + " - " + arg1 + "%";
			local43.setFont(this.bf);
			local43.setColor(this.colourtext);
			local43.drawString(local171, (this.anInt10517 - this.bfm.stringWidth(local171)) / 2, this.anInt10515 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;B)Z")
	private boolean method8938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10517, this.anInt10515);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10517, this.anInt10515);
			}
			@Pc(61) Graphics local61 = this.anImage14.getGraphics();
			@Pc(66) int local66 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(71) int local71 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(76) int local76 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(86) int local86 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(91) int local91 = this.bodyFill.getHeight((ImageObserver) null);
			local61.drawImage(this.bodyLeft, this.method8943(local66) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8945(local81) + this.lb.boxYOffset, (ImageObserver) null);
			@Pc(132) int local132 = local66 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(143) int local143 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(145) int local145;
			for (local145 = local132; local145 <= local143; local145 += local76) {
				local61.drawImage(this.bodyFill, this.method8943(local66) + this.lb.boxXOffset + local145, this.method8945(local91) + this.lb.boxYOffset, (ImageObserver) null);
			}
			local61.drawImage(this.bodyRight, this.method8943(local71) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8945(local86) - -this.lb.boxYOffset, (ImageObserver) null);
			local145 = this.left.getWidth((ImageObserver) null);
			@Pc(220) int local220 = this.left.getHeight((ImageObserver) null);
			@Pc(225) int local225 = this.right.getWidth((ImageObserver) null);
			@Pc(230) int local230 = this.right.getHeight((ImageObserver) null);
			@Pc(235) int local235 = this.bottom.getHeight((ImageObserver) null);
			@Pc(240) int local240 = this.top.getWidth((ImageObserver) null);
			@Pc(245) int local245 = this.top.getHeight((ImageObserver) null);
			@Pc(250) int local250 = this.bottom.getWidth((ImageObserver) null);
			@Pc(255) int local255 = this.bar.getWidth((ImageObserver) null);
			@Pc(260) int local260 = this.background.getWidth((ImageObserver) null);
			@Pc(271) int local271 = this.method8943(this.lb.width) + this.lb.xOffset;
			@Pc(283) int local283 = this.method8945(this.lb.height) + this.lb.yOffset;
			local61.drawImage(this.left, local271, local283 + (this.lb.height - local220) / 2, (ImageObserver) null);
			local61.drawImage(this.right, this.lb.width + local271 - local225, local283 + (this.lb.height + -local230) / 2, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local225 - local145, this.lb.height);
			}
			@Pc(346) Graphics local346 = this.barBuf.getGraphics();
			@Pc(348) int local348;
			for (local348 = 0; local348 < this.lb.width - local225 - local145; local348 += local240) {
				local346.drawImage(this.top, local348, 0, (ImageObserver) null);
			}
			for (local348 = 0; local348 < this.lb.width - local145 - local225; local348 += local250) {
				local346.drawImage(this.bottom, local348, this.lb.height - local235, (ImageObserver) null);
			}
			local348 = arg1 * (this.lb.width - local145 - local225) / 100;
			if (local348 > 0) {
				@Pc(429) Image local429 = this.createImage(local348, this.lb.height - local245 - local235);
				@Pc(433) int local433 = local429.getWidth((ImageObserver) null);
				@Pc(436) Graphics local436 = local429.getGraphics();
				for (@Pc(441) int local441 = arg0 - local255; local441 < local433; local441 += local255) {
					local436.drawImage(this.bar, local441, 0, (ImageObserver) null);
				}
				local346.drawImage(local429, 0, local245, (ImageObserver) null);
			}
			@Pc(467) int local467 = local348;
			local348 = this.lb.width - local348 - local145 - local225;
			if (local348 > 0) {
				@Pc(494) Image local494 = this.createImage(local348, this.lb.height - local235 - local245);
				@Pc(498) int local498 = local494.getWidth((ImageObserver) null);
				@Pc(501) Graphics local501 = local494.getGraphics();
				for (@Pc(503) int local503 = 0; local503 < local498; local503 += local260) {
					local501.drawImage(this.background, local503, 0, (ImageObserver) null);
				}
				local346.drawImage(local494, local467, local245, (ImageObserver) null);
			}
			local61.drawImage(this.barBuf, local145 + local271, local283, (ImageObserver) null);
			local61.setFont(this.bf);
			local61.setColor(this.colourtext);
			@Pc(562) String local562 = arg2 + " - " + arg1 + "%";
			local61.drawString(local562, (this.lb.width - this.bfm.stringWidth(local562)) / 2 + local271, this.lb.textYOffset + this.lb.height / 2 + (local283 - -4));
			local33.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(601) Exception local601) {
			this.method8944();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;Z)[B")
	private byte[] method8939(@OriginalArg(1) Class389 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10513];
		@Pc(14) int local14 = 0;
		if (this.lb != null && this.bar != null) {
			local14 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(68) InputStream local68;
			if (arg1) {
				@Pc(31) URL local31 = this.getCodeBase();
				@Pc(39) Socket local39 = new Socket(InetAddress.getByName(local31.getHost()), 443);
				local39.setSoTimeout(10000);
				@Pc(45) OutputStream local45 = local39.getOutputStream();
				local45.write(17);
				local45.write(("JAGGRAB " + local31.getFile() + arg0.aString159 + "\n\n").getBytes());
				local68 = local39.getInputStream();
			} else {
				local68 = (new URL(this.getCodeBase(), arg0.aString159)).openStream();
			}
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = 0;
			@Pc(85) int local85 = 0;
			while (true) {
				if (local5.length > local83) {
					@Pc(99) int local99 = local5.length - local83;
					if (local99 > 1000) {
						local99 = 1000;
					}
					@Pc(112) int local112 = local68.read(local5, local83, local99);
					if (local112 >= 0) {
						local83 += local112;
						@Pc(130) int local130 = local83 * 100 / local5.length;
						@Pc(132) int local132 = 0;
						if (this.lb != null && this.bar != null) {
							local132 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local14;
						}
						if (local130 != local81 || local132 != local85) {
							try {
								if (this.method8941(local130, local132, arg0.aStringArray48[this.anInt10518])) {
									local81 = local130;
									local85 = local132;
								}
							} catch (@Pc(181) Exception local181) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local68.close();
				if (arg0.anInt10512 != arg0.anInt10513) {
					@Pc(198) byte[] local198 = new byte[arg0.anInt10512];
					@Pc(203) Inflater local203 = new Inflater(true);
					local203.setInput(local5);
					local5 = local198;
					local203.inflate(local198);
				}
				break;
			}
		} catch (@Pc(214) Exception local214) {
			return null;
		}
		return this.method8936(local5, arg0) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(4) Container local4 = this.getParent();
		if (local4 != null) {
			local4.setBackground(Color.black);
		}
		this.aBoolean850 = false;
		this.setBackground(Color.black);
		@Pc(22) Thread local22 = new Thread(this);
		local22.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/awt/Image;")
	private Image method8940(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(12) InputStream local12 = this.getClass().getResourceAsStream(arg0);
			@Pc(15) byte[] local15 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(21) int local21;
			while ((local21 = local12.read()) != -1) {
				local15[local17++] = (byte) local21;
			}
			return Toolkit.getDefaultToolkit().createImage(local15);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString162 = this.getParameter("unsignedurl");
			if (aString162 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean851 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString162), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			aString163 = this.getParameter("crashurl");
			@Pc(40) int local40 = 0;
			@Pc(44) String local44 = this.getParameter("cachesubdirid");
			if (local44 != null) {
				local40 = Integer.parseInt(local44);
				if (local40 < 0 || local40 >= Class388.aStringArray47.length) {
					local40 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt10516 = Integer.parseInt(local63);
				if (anInt10516 < 0 || Class388.anIntArray846.length <= anInt10516) {
					anInt10516 = 0;
				}
			}
			this.lb = Class388.aClass386Array1[anInt10516];
			this.anInt10517 = this.getSize().width;
			this.anInt10515 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt10518 = Integer.parseInt(local111);
				}
			} catch (@Pc(119) Exception local119) {
			}
			Class387.method8919(local96, Class388.aStringArray47[local40]);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString149, 0, this.lb.anInt10509);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10510);
					this.bar = this.method8940(this.lb.aString153);
					this.background = this.method8940(this.lb.aString152);
					this.left = this.method8940(this.lb.aString155);
					this.right = this.method8940(this.lb.aString147);
					this.top = this.method8940(this.lb.aString156);
					this.bottom = this.method8940(this.lb.aString148);
					this.bodyLeft = this.method8940(this.lb.aString154);
					this.bodyRight = this.method8940(this.lb.aString150);
					this.bodyFill = this.method8940(this.lb.aString151);
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
					this.method8944();
				}
			}
			@Pc(311) unpack local311 = null;
			@Pc(319) byte[] local319;
			try {
				Class.forName("java.util.jar.Pack200");
				local319 = this.method8942(Class388.aClass389_2);
				if (local319 == null) {
					return;
				}
				local311 = new unpack_Sub1(local319);
			} catch (@Pc(330) Throwable local330) {
			}
			if (local311 == null) {
				local319 = this.method8942(Class388.aClass389_1);
				if (local319 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local319);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method8926(local355, local355.getName());
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method8942(Class388.aClass389_3);
				if (local370 == null) {
					return;
				}
				local311 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(405) ClassLoader_Sub1 local405 = new ClassLoader_Sub1(local311);
			@Pc(408) Class local408 = Class.forName("Class387");
			local405.method8926(local408, local408.getName());
			@Pc(418) Class local418 = local405.loadClass("client");
			synchronized (this) {
				if (this.aBoolean850) {
					return;
				}
				this.anApplet7 = (Applet) local418.getDeclaredConstructor().newInstance();
				local418.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet7.init();
				if (this.aBoolean852) {
					this.anApplet7.start();
				}
				if (this.aBoolean853) {
					this.anApplet7.stop();
				}
			}
			this.method8935();
		} catch (@Pc(489) Exception local489) {
			RuntimeException_Sub2.anInt10514 = -1809165728;
			if (local489 instanceof InvocationTargetException) {
				@Pc(498) Throwable local498 = ((InvocationTargetException) local489).getTargetException();
				if (local498 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8929(local489.toString(), local498, this);
			} else {
				RuntimeException_Sub2.method8929((String) null, local489, this);
			}
			this.method8933("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method8941(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		return Class388.aClass386Array1[anInt10516] == null || this.aBoolean849 ? this.method8937(arg2, arg0) : this.method8938(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean852 = false;
		this.aBoolean853 = true;
		if (this.anApplet7 != null) {
			this.anApplet7.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;B)[B")
	private byte[] method8942(@OriginalArg(0) Class389 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class387.method8920(arg0.aString160);
		} catch (@Pc(6) Exception local6) {
			this.method8933("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method8934(local4);
		if (!this.method8936(local17, arg0)) {
			local17 = this.method8939(arg0, false);
			if (local17 == null) {
				local17 = this.method8939(arg0, true);
			}
			if (local17 == null) {
				this.method8933("download");
				return null;
			}
			if (!this.method8932(local4, local17)) {
				return null;
			}
			local17 = this.method8934(local4);
			if (!this.method8936(local17, arg0)) {
				this.method8933("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method8943(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10517 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method8944() {
		this.aBoolean849 = true;
		this.bfm = null;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet7 != null) {
			this.anApplet7.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(BI)I")
	private int method8945(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10515 - arg0) / 2 : 0;
	}
}
