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
	private static String aString132;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString133;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt10689 = 0;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt10686;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt10687;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!a;")
	private Class395 lb;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet7;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean800;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean797 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt10688 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean798 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean799 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean801 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;Z[B)Z")
	private boolean method8842(@OriginalArg(0) Class397 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray623[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(37) Exception local37) {
			this.method8855("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8843(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class396.aClass395Array1[anInt10689] == null || this.aBoolean800 ? this.method8852(arg1, arg0) : this.method8853(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method8844(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10686 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B[B)Z")
	private boolean method8845(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method8855("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8846() {
		this.bf = null;
		this.aBoolean800 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/awt/Image;")
	private Image method8847(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(12) InputStream local12 = this.getClass().getResourceAsStream(arg0);
			@Pc(15) byte[] local15 = new byte[3000];
			@Pc(17) int local17 = 0;
			@Pc(22) int local22;
			while ((local22 = local12.read()) != -1) {
				local15[local17++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local15);
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
		this.aBoolean797 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean797 = true;
		this.aBoolean798 = this.aBoolean801 = false;
		if (this.anApplet7 != null) {
			this.anApplet7.destroy();
		}
		this.anApplet7 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!h;)[B")
	private byte[] method8848(@OriginalArg(1) Class397 arg0) {
		@Pc(10) File local10;
		try {
			local10 = Class398.method8856(arg0.aString130);
		} catch (@Pc(12) Exception local12) {
			this.method8855("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method8850(local10);
		if (!this.method8842(arg0, local23)) {
			local23 = this.method8851(arg0, false);
			if (local23 == null) {
				local23 = this.method8851(arg0, true);
			}
			if (local23 == null) {
				this.method8855("download");
				return null;
			}
			if (!this.method8845(local10, local23)) {
				return null;
			}
			local23 = this.method8850(local10);
			if (!this.method8842(arg0, local23)) {
				this.method8855("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8849(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10687 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean798 = false;
		this.aBoolean801 = true;
		if (this.anApplet7 != null) {
			this.anApplet7.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method8850(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;ZB)[B")
	private byte[] method8851(@OriginalArg(0) Class397 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10685];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(71) InputStream local71;
			if (arg1) {
				@Pc(34) URL local34 = this.getCodeBase();
				@Pc(42) Socket local42 = new Socket(InetAddress.getByName(local34.getHost()), 443);
				local42.setSoTimeout(10000);
				@Pc(48) OutputStream local48 = local42.getOutputStream();
				local48.write(17);
				local48.write(("JAGGRAB " + local34.getFile() + arg0.aString131 + "\n\n").getBytes());
				local71 = local42.getInputStream();
			} else {
				local71 = (new URL(this.getCodeBase(), arg0.aString131)).openStream();
			}
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = 0;
			@Pc(88) int local88 = 0;
			while (true) {
				if (local5.length <= local86) {
					local71.close();
					if (arg0.anInt10684 != arg0.anInt10685) {
						@Pc(203) byte[] local203 = new byte[arg0.anInt10684];
						@Pc(208) Inflater local208 = new Inflater(true);
						local208.setInput(local5);
						local208.inflate(local203);
						local5 = local203;
					}
					break;
				}
				@Pc(102) int local102 = local5.length - local86;
				if (local102 > 1000) {
					local102 = 1000;
				}
				@Pc(115) int local115 = local71.read(local5, local86, local102);
				if (local115 < 0) {
					throw new EOFException();
				}
				local86 += local115;
				@Pc(135) int local135 = local86 * 100 / local5.length;
				@Pc(137) int local137 = 0;
				if (this.lb != null && this.bar != null) {
					local137 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
				}
				if (local135 != local84 || local88 != local137) {
					try {
						if (this.method8843(local135, arg0.aStringArray45[this.anInt10688], local137)) {
							local88 = local137;
							local84 = local135;
						}
					} catch (@Pc(190) Exception local190) {
					}
				}
			}
		} catch (@Pc(219) Exception local219) {
			return null;
		}
		return this.method8842(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet7 != null) {
			this.anApplet7.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean801 = false;
		this.aBoolean798 = true;
		if (this.anApplet7 != null) {
			this.anApplet7.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	private boolean method8852(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class396.anIntArray620[anInt10689]);
			this.aColor2 = new Color(Class396.anIntArray622[anInt10689]);
			this.colourtext = new Color(Class396.anIntArray621[anInt10689]);
		}
		@Pc(44) Graphics local44 = this.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		@Pc(88) int local88;
		@Pc(95) int local95;
		@Pc(166) String local166;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10686, this.anInt10687);
			}
			@Pc(66) Graphics local66 = this.anImage14.getGraphics();
			local66.setColor(Color.black);
			local66.fillRect(0, 0, this.anInt10686, this.anInt10687);
			local66.setColor(this.aColor3);
			local88 = this.anInt10686 / 2 - 152;
			local95 = this.anInt10687 / 2 - 18;
			local66.drawRect(local88, local95, 303, 33);
			local66.setColor(this.aColor2);
			local66.fillRect(local88 + 2, local95 + 2, arg1 * 3, 30);
			local66.setColor(Color.black);
			local66.drawRect(local88 + 1, local95 + 1, 301, 31);
			local66.fillRect(arg1 * 3 + local88 + 2, local95 + 2, 300 - arg1 * 3, 30);
			local66.setFont(this.bf);
			local166 = arg0 + " - " + arg1 + "%";
			local66.setColor(this.colourtext);
			local66.drawString(local166, (this.anInt10686 - this.bfm.stringWidth(local166)) / 2, this.anInt10687 / 2 + 4);
			local44.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(198) Exception local198) {
			local44.setColor(Color.black);
			local44.fillRect(0, 0, this.anInt10686, this.anInt10687);
			local44.setColor(this.aColor3);
			local88 = this.anInt10686 / 2 - 152;
			local95 = this.anInt10687 / 2 - 18;
			local44.drawRect(local88, local95, 303, 33);
			local44.setColor(this.aColor2);
			local44.fillRect(local88 + 2, local95 + 2, arg1 * 3, 30);
			local44.setColor(Color.black);
			local44.drawRect(local88 + 1, local95 - -1, 301, 31);
			local44.fillRect(local88 + arg1 * 3 + 2, local95 + 2, 300 - arg1 * 3, 30);
			local44.setFont(this.bf);
			local166 = arg0 + " - " + arg1 + "%";
			local44.setColor(this.colourtext);
			local44.drawString(local166, (this.anInt10686 - this.bfm.stringWidth(local166)) / 2, this.anInt10687 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(IILjava/lang/String;I)Z")
	private boolean method8853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10686, this.anInt10687);
			this.canvas.setVisible(true);
		}
		@Pc(33) Graphics local33 = this.canvas.getGraphics();
		if (local33 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10686, this.anInt10687);
			}
			@Pc(59) Graphics local59 = this.anImage14.getGraphics();
			@Pc(64) int local64 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(69) int local69 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(74) int local74 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(79) int local79 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(84) int local84 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(89) int local89 = this.bodyFill.getHeight((ImageObserver) null);
			local59.drawImage(this.bodyLeft, this.method8844(local64) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8849(local79) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(132) int local132 = this.lb.boxXOffset + local64 - this.lb.boxWidth / 2;
			@Pc(143) int local143 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(145) int local145;
			for (local145 = local132; local145 <= local143; local145 += local74) {
				local59.drawImage(this.bodyFill, this.method8844(local64) + this.lb.boxXOffset + local145, this.method8849(local89) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local59.drawImage(this.bodyRight, this.method8844(local69) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8849(local84) + this.lb.boxYOffset, (ImageObserver) null);
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
			@Pc(271) int local271 = this.method8844(this.lb.width) + this.lb.xOffset;
			@Pc(282) int local282 = this.method8849(this.lb.height) + this.lb.yOffset;
			local59.drawImage(this.left, local271, local282 + (this.lb.height - local220) / 2, (ImageObserver) null);
			local59.drawImage(this.right, local271 + this.lb.width - local225, local282 + (-local230 + this.lb.height) / 2, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local145 - local225, this.lb.height);
			}
			@Pc(347) Graphics local347 = this.barBuf.getGraphics();
			@Pc(349) int local349;
			for (local349 = 0; local349 < this.lb.width - local225 - local145; local349 += local240) {
				local347.drawImage(this.top, local349, 0, (ImageObserver) null);
			}
			for (local349 = 0; local349 < this.lb.width - local145 - local225; local349 += local250) {
				local347.drawImage(this.bottom, local349, this.lb.height - local235, (ImageObserver) null);
			}
			local349 = arg1 * (this.lb.width - local145 - local225) / 100;
			if (local349 > 0) {
				@Pc(444) Image local444 = this.createImage(local349, this.lb.height - local235 - local245);
				@Pc(448) int local448 = local444.getWidth((ImageObserver) null);
				@Pc(451) Graphics local451 = local444.getGraphics();
				for (@Pc(456) int local456 = arg0 - local255; local456 < local448; local456 += local255) {
					local451.drawImage(this.bar, local456, 0, (ImageObserver) null);
				}
				local347.drawImage(local444, 0, local245, (ImageObserver) null);
			}
			@Pc(486) int local486 = local349;
			local349 = this.lb.width - local349 - local225 - local145;
			if (local349 > 0) {
				@Pc(517) Image local517 = this.createImage(local349, this.lb.height - local235 - local245);
				@Pc(521) int local521 = local517.getWidth((ImageObserver) null);
				@Pc(524) Graphics local524 = local517.getGraphics();
				for (@Pc(526) int local526 = 0; local526 < local521; local526 += local260) {
					local524.drawImage(this.background, local526, 0, (ImageObserver) null);
				}
				local347.drawImage(local517, local486, local245, (ImageObserver) null);
			}
			local59.drawImage(this.barBuf, local145 + local271, local282, (ImageObserver) null);
			local59.setFont(this.bf);
			local59.setColor(this.colourtext);
			@Pc(581) String local581 = arg2 + " - " + arg1 + "%";
			local59.drawString(local581, local271 + (this.lb.width - this.bfm.stringWidth(local581)) / 2, this.lb.height / 2 + 4 + local282 - -this.lb.textYOffset);
			local33.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(622) Exception local622) {
			this.method8846();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString132 = this.getParameter("unsignedurl");
			if (aString132 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean799 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString132), "_parent");
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
				if (local37 < 0 || local37 >= Class396.aStringArray44.length) {
					local37 = 0;
				}
			}
			@Pc(65) String local65 = this.getParameter("colourid");
			if (local65 != null) {
				anInt10689 = Integer.parseInt(local65);
				if (anInt10689 < 0 || Class396.anIntArray620.length <= anInt10689) {
					anInt10689 = 0;
				}
			}
			this.lb = Class396.aClass395Array1[anInt10689];
			this.anInt10686 = this.getSize().width;
			this.anInt10687 = this.getSize().height;
			@Pc(101) int local101 = 32;
			try {
				@Pc(106) int local106 = Integer.parseInt(this.getParameter("modewhat"));
				local101 += local106;
			} catch (@Pc(112) Exception local112) {
			}
			try {
				@Pc(116) String local116 = this.getParameter("lang");
				if (local116 != null) {
					this.anInt10688 = Integer.parseInt(local116);
				}
			} catch (@Pc(125) Exception local125) {
			}
			Class398.method8858(Class396.aStringArray44[local37], local101);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString119, 0, this.lb.anInt10681);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10682);
					this.bar = this.method8847(this.lb.aString124);
					this.background = this.method8847(this.lb.aString127);
					this.left = this.method8847(this.lb.aString128);
					this.right = this.method8847(this.lb.aString126);
					this.top = this.method8847(this.lb.aString121);
					this.bottom = this.method8847(this.lb.aString120);
					this.bodyLeft = this.method8847(this.lb.aString123);
					this.bodyRight = this.method8847(this.lb.aString125);
					this.bodyFill = this.method8847(this.lb.aString122);
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
					this.method8846();
				}
			}
			@Pc(313) unpack local313 = null;
			@Pc(321) byte[] local321;
			try {
				Class.forName("java.util.jar.Pack200");
				local321 = this.method8848(Class396.aClass397_2);
				if (local321 == null) {
					return;
				}
				local313 = new unpack_Sub1(local321);
			} catch (@Pc(331) Throwable local331) {
			}
			if (local313 == null) {
				local321 = this.method8848(Class396.aClass397_1);
				if (local321 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local321);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method8841(local355.getName(), local355);
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method8848(Class396.aClass397_3);
				if (local370 == null) {
					return;
				}
				local313 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(406) ClassLoader_Sub1 local406 = new ClassLoader_Sub1(local313);
			@Pc(409) Class local409 = Class.forName("Class398");
			local406.method8841(local409.getName(), local409);
			@Pc(419) Class local419 = local406.loadClass("client");
			synchronized (this) {
				if (this.aBoolean797) {
					return;
				}
				this.anApplet7 = (Applet) local419.getDeclaredConstructor().newInstance();
				local419.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet7.init();
				if (this.aBoolean798) {
					this.anApplet7.start();
				}
				if (this.aBoolean801) {
					this.anApplet7.stop();
				}
			}
			this.method8854();
		} catch (@Pc(489) Exception local489) {
			RuntimeException_Sub2.anInt10683 = 1283906069;
			if (local489 instanceof InvocationTargetException) {
				@Pc(505) Throwable local505 = ((InvocationTargetException) local489).getTargetException();
				if (local505 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8833(this, local505, local489.toString());
			} else {
				RuntimeException_Sub2.method8833(this, local489, (String) null);
			}
			this.method8855("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet7 != null) {
			this.anApplet7.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(B)V")
	private void method8854() {
		this.barBuf = null;
		this.anImage14 = null;
		this.aColor2 = null;
		this.aColor3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8855(@OriginalArg(0) String arg0) {
		if (this.aBoolean799) {
			return;
		}
		this.aBoolean799 = true;
		try {
			if (aString133 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString133 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}
}
