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

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString144;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString145;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt9446 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt9445;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet5;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9447;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean738;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!c;")
	private Class368 lb;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean734 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean735 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt9448 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean737 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method7838() {
		this.bf = null;
		this.bfm = null;
		this.aBoolean738 = true;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method7839(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method7845("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method7840(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class369.aClass368Array1[anInt9446] == null || this.aBoolean738 ? this.method7841(arg1, arg2) : this.method7842(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	private boolean method7841(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class369.anIntArray706[anInt9446]);
			this.aColor2 = new Color(Class369.anIntArray704[anInt9446]);
			this.colourtext = new Color(Class369.anIntArray705[anInt9446]);
		}
		@Pc(51) Graphics local51 = this.getGraphics();
		if (local51 == null) {
			this.repaint();
			return false;
		}
		@Pc(97) int local97;
		@Pc(104) int local104;
		@Pc(171) String local171;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9445, this.anInt9447);
			}
			@Pc(75) Graphics local75 = this.anImage14.getGraphics();
			local75.setColor(Color.black);
			local75.fillRect(0, 0, this.anInt9445, this.anInt9447);
			local75.setColor(this.aColor3);
			local97 = this.anInt9445 / 2 - 152;
			local104 = this.anInt9447 / 2 - 18;
			local75.drawRect(local97, local104, 303, 33);
			local75.setColor(this.aColor2);
			local75.fillRect(local97 + 2, local104 - -2, arg1 * 3, 30);
			local75.setColor(Color.black);
			local75.drawRect(local97 + 1, local104 - -1, 301, 31);
			local75.fillRect(arg1 * 3 + local97 + 2, local104 - -2, 300 - arg1 * 3, 30);
			local171 = arg0 + " - " + arg1 + "%";
			local75.setFont(this.bf);
			local75.setColor(this.colourtext);
			local75.drawString(local171, (this.anInt9445 - this.bfm.stringWidth(local171)) / 2, this.anInt9447 / 2 + 4);
			local51.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(208) Exception local208) {
			local51.setColor(Color.black);
			local51.fillRect(0, 0, this.anInt9445, this.anInt9447);
			local51.setColor(this.aColor3);
			local97 = this.anInt9445 / 2 - 152;
			local104 = this.anInt9447 / 2 - 18;
			local51.drawRect(local97, local104, 303, 33);
			local51.setColor(this.aColor2);
			local51.fillRect(local97 + 2, local104 - -2, arg1 * 3, 30);
			local51.setColor(Color.black);
			local51.drawRect(local97 + 1, local104 + 1, 301, 31);
			local51.fillRect(arg1 * 3 + local97 + 2, local104 - -2, 300 - arg1 * 3, 30);
			local51.setFont(this.bf);
			local171 = arg0 + " - " + arg1 + "%";
			local51.setColor(this.colourtext);
			local51.drawString(local171, (this.anInt9445 - this.bfm.stringWidth(local171)) / 2, this.anInt9447 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method7842(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9445, this.anInt9447);
			this.canvas.setVisible(true);
		}
		@Pc(40) Graphics local40 = this.canvas.getGraphics();
		if (local40 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9445, this.anInt9447);
			}
			@Pc(58) Graphics local58 = this.anImage14.getGraphics();
			@Pc(63) int local63 = this.bodyLeft.getWidth(null);
			@Pc(68) int local68 = this.bodyRight.getWidth(null);
			@Pc(73) int local73 = this.bodyFill.getWidth(null);
			@Pc(78) int local78 = this.bodyLeft.getHeight(null);
			@Pc(83) int local83 = this.bodyRight.getHeight(null);
			@Pc(88) int local88 = this.bodyFill.getHeight(null);
			local58.drawImage(this.bodyLeft, this.method7846(local63) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method7849(local78) - -this.lb.boxYOffset, null);
			@Pc(130) int local130 = this.lb.boxXOffset + local63 - this.lb.boxWidth / 2;
			@Pc(142) int local142 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local68;
			@Pc(144) int local144;
			for (local144 = local130; local144 <= local142; local144 += local73) {
				local58.drawImage(this.bodyFill, local144 + this.method7846(local63) + this.lb.boxXOffset, this.method7849(local88) + this.lb.boxYOffset, null);
			}
			local58.drawImage(this.bodyRight, this.method7846(local68) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method7849(local83) - -this.lb.boxYOffset, null);
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
			@Pc(276) int local276 = this.method7846(this.lb.width) + this.lb.xOffset;
			@Pc(289) int local289 = this.method7849(this.lb.height) + this.lb.yOffset;
			local58.drawImage(this.left, local276, local289 + (this.lb.height - local224) / 2, null);
			local58.drawImage(this.right, this.lb.width + local276 - local229, local289 - -((this.lb.height - local234) / 2), null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local229 - local144, this.lb.height);
			}
			@Pc(354) Graphics local354 = this.barBuf.getGraphics();
			@Pc(356) int local356;
			for (local356 = 0; local356 < this.lb.width - local229 - local144; local356 += local244) {
				local354.drawImage(this.top, local356, 0, null);
			}
			for (local356 = 0; local356 < this.lb.width - local144 - local229; local356 += local254) {
				local354.drawImage(this.bottom, local356, this.lb.height - local239, null);
			}
			local356 = (this.lb.width - local144 - local229) * arg1 / 100;
			if (local356 > 0) {
				@Pc(448) Image local448 = this.createImage(local356, this.lb.height - local239 - local249);
				@Pc(452) int local452 = local448.getWidth(null);
				@Pc(455) Graphics local455 = local448.getGraphics();
				for (@Pc(459) int local459 = arg0 - local259; local459 < local452; local459 += local259) {
					local455.drawImage(this.bar, local459, 0, null);
				}
				local354.drawImage(local448, 0, local249, null);
			}
			@Pc(485) int local485 = local356;
			local356 = this.lb.width - local144 - local229 - local356;
			if (local356 > 0) {
				@Pc(513) Image local513 = this.createImage(local356, this.lb.height - local249 - local239);
				@Pc(517) int local517 = local513.getWidth(null);
				@Pc(520) Graphics local520 = local513.getGraphics();
				for (@Pc(522) int local522 = 0; local522 < local517; local522 += local264) {
					local520.drawImage(this.background, local522, 0, null);
				}
				local354.drawImage(local513, local485, local249, null);
			}
			local58.drawImage(this.barBuf, local276 + local144, local289, null);
			local58.setFont(this.bf);
			local58.setColor(this.colourtext);
			@Pc(578) String local578 = arg2 + " - " + arg1 + "%";
			local58.drawString(local578, local276 + (this.lb.width - this.bfm.stringWidth(local578)) / 2, this.lb.height / 2 + 4 + (local289 - -this.lb.textYOffset));
			local40.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(618) Exception local618) {
			this.method7838();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/awt/Image;")
	private Image method7843(@OriginalArg(1) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(40) Exception local40) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean734 = false;
		this.aBoolean736 = true;
		if (this.anApplet5 != null) {
			this.anApplet5.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean737 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!e;)[B")
	private byte[] method7844(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class370 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9443];
		@Pc(14) int local14 = 0;
		if (this.lb != null && this.bar != null) {
			local14 = this.bar.getWidth(null);
		}
		try {
			@Pc(38) InputStream local38;
			if (arg0) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg1.aString142 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg1.aString142)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = 0;
			while (true) {
				if (local84 < local5.length) {
					@Pc(96) int local96 = local5.length - local84;
					if (local96 > 1000) {
						local96 = 1000;
					}
					@Pc(108) int local108 = local38.read(local5, local84, local96);
					if (local108 >= 0) {
						local84 += local108;
						@Pc(129) int local129 = local84 * 100 / local5.length;
						@Pc(131) int local131 = 0;
						if (this.lb != null && this.bar != null) {
							local131 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local14;
						}
						if (local129 != local82 || local86 != local131) {
							try {
								if (this.method7840(local131, arg1.aStringArray51[this.anInt9448], local129)) {
									local86 = local131;
									local82 = local129;
								}
							} catch (@Pc(180) Exception local180) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local38.close();
				if (arg1.anInt9443 != arg1.anInt9442) {
					@Pc(198) byte[] local198 = new byte[arg1.anInt9442];
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
		return this.method7848(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method7845(@OriginalArg(0) String arg0) {
		if (this.aBoolean735) {
			return;
		}
		this.aBoolean735 = true;
		try {
			if (aString145 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString145 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet5 != null) {
			this.anApplet5.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method7846(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt9445 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method7847(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean737 = true;
		this.aBoolean736 = this.aBoolean734 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.destroy();
		}
		this.anApplet5 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;I[B)Z")
	private boolean method7848(@OriginalArg(0) Class370 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg0.anIntArray707[local25] != local18[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method7845("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString144 = this.getParameter("unsignedurl");
			if (aString144 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean735 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString144), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString145 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class369.aStringArray50.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(66) String local66 = this.getParameter("colourid");
			if (local66 != null) {
				anInt9446 = Integer.parseInt(local66);
				if (anInt9446 < 0 || Class369.anIntArray706.length <= anInt9446) {
					anInt9446 = 0;
				}
			}
			this.lb = Class369.aClass368Array1[anInt9446];
			this.anInt9445 = this.getSize().width;
			this.anInt9447 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt9448 = Integer.parseInt(local114);
				}
			} catch (@Pc(123) Exception local123) {
			}
			Class371.method7853(Class369.aStringArray50[local36], local99);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString137, 0, this.lb.anInt9441);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9440);
					this.bar = this.method7843(this.lb.aString133);
					this.background = this.method7843(this.lb.aString132);
					this.left = this.method7843(this.lb.aString135);
					this.right = this.method7843(this.lb.aString134);
					this.top = this.method7843(this.lb.aString140);
					this.bottom = this.method7843(this.lb.aString136);
					this.bodyLeft = this.method7843(this.lb.aString139);
					this.bodyRight = this.method7843(this.lb.aString131);
					this.bodyFill = this.method7843(this.lb.aString138);
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
					this.method7838();
				}
			}
			@Pc(316) unpack local316 = null;
			@Pc(324) byte[] local324;
			try {
				Class.forName("java.util.jar.Pack200");
				local324 = this.method7851(Class369.aClass370_2);
				if (local324 == null) {
					return;
				}
				local316 = new unpack_Sub1(local324);
			} catch (@Pc(336) Throwable local336) {
			}
			if (local316 == null) {
				local324 = this.method7851(Class369.aClass370_1);
				if (local324 == null) {
					return;
				}
				@Pc(354) unpack local354 = new unpack(local324);
				@Pc(359) ClassLoader_Sub1 local359 = new ClassLoader_Sub1(local354);
				@Pc(362) Class local362 = Class.forName("unpack");
				local359.method7829(local362, local362.getName());
				@Pc(372) Class local372 = local359.loadClass("unpackclass");
				@Pc(377) byte[] local377 = this.method7851(Class369.aClass370_3);
				if (local377 == null) {
					return;
				}
				local316 = (unpack) local372.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local377, Boolean.TRUE);
			}
			@Pc(412) ClassLoader_Sub1 local412 = new ClassLoader_Sub1(local316);
			@Pc(415) Class local415 = Class.forName("Class371");
			local412.method7829(local415, local415.getName());
			@Pc(425) Class local425 = local412.loadClass("client");
			synchronized (this) {
				if (this.aBoolean737) {
					return;
				}
				this.anApplet5 = (Applet) local425.getDeclaredConstructor().newInstance();
				local425.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet5.init();
				if (this.aBoolean736) {
					this.anApplet5.start();
				}
				if (this.aBoolean734) {
					this.anApplet5.stop();
				}
			}
			this.method7850();
		} catch (@Pc(495) Exception local495) {
			RuntimeException_Sub2.anInt9444 = -2087578902;
			if (local495 instanceof InvocationTargetException) {
				@Pc(504) Throwable local504 = ((InvocationTargetException) local495).getTargetException();
				if (local504 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7833(this, local504, local495.toString());
			} else {
				RuntimeException_Sub2.method7833(this, local495, null);
			}
			this.method7845("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method7849(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt9447 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean734 = true;
		this.aBoolean736 = false;
		if (this.anApplet5 != null) {
			this.anApplet5.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(I)V")
	private void method7850() {
		this.barBuf = null;
		this.aColor2 = null;
		this.aColor3 = null;
		this.anImage14 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;)[B")
	private byte[] method7851(@OriginalArg(1) Class370 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class371.method7852(arg0.aString141);
		} catch (@Pc(17) Exception local17) {
			this.method7845("nocache");
			return null;
		}
		@Pc(28) byte[] local28 = this.method7847(local4);
		if (!this.method7848(arg0, local28)) {
			local28 = this.method7844(false, arg0);
			if (local28 == null) {
				local28 = this.method7844(true, arg0);
			}
			if (local28 == null) {
				this.method7845("download");
				return null;
			}
			if (!this.method7839(local4, local28)) {
				return null;
			}
			local28 = this.method7847(local4);
			if (!this.method7848(arg0, local28)) {
				this.method7845("mismatch");
				return null;
			}
		}
		return local28;
	}
}
