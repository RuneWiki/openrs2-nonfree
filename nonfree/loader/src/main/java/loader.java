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

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString258;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString259;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private static int anInt10618 = 0;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt10617;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!h;")
	private Class371 lb;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt10620;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean728;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean726 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt10619 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean725 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean727 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;IBI)Z")
	private boolean method8304(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10620, this.anInt10617);
			this.canvas.setVisible(true);
		}
		@Pc(44) Graphics local44 = this.canvas.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10620, this.anInt10617);
			}
			@Pc(61) Graphics local61 = this.anImage14.getGraphics();
			@Pc(66) int local66 = this.bodyLeft.getWidth(null);
			@Pc(71) int local71 = this.bodyRight.getWidth(null);
			@Pc(76) int local76 = this.bodyFill.getWidth(null);
			@Pc(81) int local81 = this.bodyLeft.getHeight(null);
			@Pc(86) int local86 = this.bodyRight.getHeight(null);
			@Pc(91) int local91 = this.bodyFill.getHeight(null);
			local61.drawImage(this.bodyLeft, this.method8308(local66) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8309(local81) + this.lb.boxYOffset, null);
			@Pc(132) int local132 = this.lb.boxXOffset + local66 - this.lb.boxWidth / 2;
			@Pc(144) int local144 = this.lb.boxWidth / 2 + this.lb.boxXOffset - local71;
			@Pc(146) int local146;
			for (local146 = local132; local146 <= local144; local146 += local76) {
				local61.drawImage(this.bodyFill, this.method8308(local66) + this.lb.boxXOffset + local146, this.method8309(local91) + this.lb.boxYOffset, null);
			}
			local61.drawImage(this.bodyRight, this.method8308(local71) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8309(local86) - -this.lb.boxYOffset, null);
			local146 = this.left.getWidth(null);
			@Pc(223) int local223 = this.left.getHeight(null);
			@Pc(228) int local228 = this.right.getWidth(null);
			@Pc(233) int local233 = this.right.getHeight(null);
			@Pc(238) int local238 = this.bottom.getHeight(null);
			@Pc(243) int local243 = this.top.getWidth(null);
			@Pc(248) int local248 = this.top.getHeight(null);
			@Pc(253) int local253 = this.bottom.getWidth(null);
			@Pc(258) int local258 = this.bar.getWidth(null);
			@Pc(263) int local263 = this.background.getWidth(null);
			@Pc(275) int local275 = this.method8308(this.lb.width) + this.lb.xOffset;
			@Pc(286) int local286 = this.method8309(this.lb.height) + this.lb.yOffset;
			local61.drawImage(this.left, local275, (this.lb.height - local223) / 2 + local286, null);
			local61.drawImage(this.right, this.lb.width + local275 - local228, local286 + (-local233 + this.lb.height) / 2, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local228 - local146, this.lb.height);
			}
			@Pc(350) Graphics local350 = this.barBuf.getGraphics();
			@Pc(352) int local352;
			for (local352 = 0; local352 < this.lb.width - local228 - local146; local352 += local243) {
				local350.drawImage(this.top, local352, 0, null);
			}
			for (local352 = 0; local352 < this.lb.width - local228 - local146; local352 += local253) {
				local350.drawImage(this.bottom, local352, this.lb.height - local238, null);
			}
			local352 = arg2 * (this.lb.width - local228 - local146) / 100;
			if (local352 > 0) {
				@Pc(446) Image local446 = this.createImage(local352, this.lb.height - local248 - local238);
				@Pc(450) int local450 = local446.getWidth(null);
				@Pc(453) Graphics local453 = local446.getGraphics();
				for (@Pc(457) int local457 = arg1 - local258; local457 < local450; local457 += local258) {
					local453.drawImage(this.bar, local457, 0, null);
				}
				local350.drawImage(local446, 0, local248, null);
			}
			@Pc(487) int local487 = local352;
			local352 = this.lb.width - local352 - local228 - local146;
			if (local352 > 0) {
				@Pc(519) Image local519 = this.createImage(local352, this.lb.height - local248 - local238);
				@Pc(523) int local523 = local519.getWidth(null);
				@Pc(526) Graphics local526 = local519.getGraphics();
				for (@Pc(528) int local528 = 0; local528 < local523; local528 += local263) {
					local526.drawImage(this.background, local528, 0, null);
				}
				local350.drawImage(local519, local487, local248, null);
			}
			local61.drawImage(this.barBuf, local275 + local146, local286, null);
			local61.setFont(this.bf);
			local61.setColor(this.colourtext);
			@Pc(587) String local587 = arg0 + " - " + arg2 + "%";
			local61.drawString(local587, (this.lb.width - this.bfm.stringWidth(local587)) / 2 + local275, this.lb.textYOffset + 4 + (local286 - -(this.lb.height / 2)));
			local44.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(627) Exception local627) {
			this.method8307();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
	private boolean method8305(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		return Class370.aClass371Array1[anInt10618] == null || this.aBoolean728 ? this.method8313(arg1, arg0) : this.method8304(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean727 = false;
		this.aBoolean725 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8306(@OriginalArg(0) String arg0) {
		if (this.aBoolean729) {
			return;
		}
		this.aBoolean729 = true;
		try {
			if (aString258 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString258 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method8307() {
		this.bfm = null;
		this.aBoolean728 = true;
		this.bf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZI)I")
	private int method8308(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt10620 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method8309(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt10617 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;ZI)[B")
	private byte[] method8310(@OriginalArg(0) Class368 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(5) byte[] local5 = new byte[arg0.anInt10611];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(62) InputStream local62;
			if (arg1) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg0.aString243 + "\n\n").getBytes());
				local62 = local33.getInputStream();
			} else {
				local62 = (new URL(this.getCodeBase(), arg0.aString243)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			while (true) {
				if (local77 < local5.length) {
					@Pc(93) int local93 = local5.length - local77;
					if (local93 > 1000) {
						local93 = 1000;
					}
					@Pc(105) int local105 = local62.read(local5, local77, local93);
					if (local105 >= 0) {
						local77 += local105;
						@Pc(126) int local126 = local77 * 100 / local5.length;
						@Pc(128) int local128 = 0;
						if (this.lb != null && this.bar != null) {
							local128 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
						}
						if (local126 != local75 || local79 != local128) {
							try {
								if (this.method8305(local126, arg0.aStringArray42[this.anInt10619], local128)) {
									local75 = local126;
									local79 = local128;
								}
							} catch (@Pc(176) Exception local176) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local62.close();
				if (arg0.anInt10612 != arg0.anInt10611) {
					@Pc(193) byte[] local193 = new byte[arg0.anInt10612];
					@Pc(198) Inflater local198 = new Inflater(true);
					local198.setInput(local5);
					local5 = local193;
					local198.inflate(local193);
				}
				break;
			}
		} catch (@Pc(214) Exception local214) {
			return null;
		}
		return this.method8311(arg0, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;B[B)Z")
	private boolean method8311(@OriginalArg(0) Class368 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg1);
			@Pc(21) byte[] local21 = local13.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg0.anIntArray592[local23] != local21[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method8306("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8312(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local8];
			local24.readFully(local27, 0, local8);
			local24.close();
			return local27;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;II)Z")
	private boolean method8313(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor3 = new Color(Class370.anIntArray593[anInt10618]);
			this.aColor2 = new Color(Class370.anIntArray595[anInt10618]);
			this.colourtext = new Color(Class370.anIntArray594[anInt10618]);
		}
		@Pc(45) Graphics local45 = this.getGraphics();
		if (local45 == null) {
			this.repaint();
			return false;
		}
		@Pc(98) int local98;
		@Pc(105) int local105;
		@Pc(172) String local172;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10620, this.anInt10617);
			}
			@Pc(76) Graphics local76 = this.anImage14.getGraphics();
			local76.setColor(Color.black);
			local76.fillRect(0, 0, this.anInt10620, this.anInt10617);
			local76.setColor(this.aColor3);
			local98 = this.anInt10620 / 2 - 152;
			local105 = this.anInt10617 / 2 - 18;
			local76.drawRect(local98, local105, 303, 33);
			local76.setColor(this.aColor2);
			local76.fillRect(local98 + 2, local105 + 2, arg1 * 3, 30);
			local76.setColor(Color.black);
			local76.drawRect(local98 + 1, local105 - -1, 301, 31);
			local76.fillRect(arg1 * 3 + local98 + 2, local105 + 2, 300 - arg1 * 3, 30);
			local172 = arg0 + " - " + arg1 + "%";
			local76.setFont(this.bf);
			local76.setColor(this.colourtext);
			local76.drawString(local172, (this.anInt10620 - this.bfm.stringWidth(local172)) / 2, this.anInt10617 / 2 + 4);
			local45.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(208) Exception local208) {
			local45.setColor(Color.black);
			local45.fillRect(0, 0, this.anInt10620, this.anInt10617);
			local45.setColor(this.aColor3);
			local98 = this.anInt10620 / 2 - 152;
			local105 = this.anInt10617 / 2 - 18;
			local45.drawRect(local98, local105, 303, 33);
			local45.setColor(this.aColor2);
			local45.fillRect(local98 + 2, local105 - -2, arg1 * 3, 30);
			local45.setColor(Color.black);
			local45.drawRect(local98 + 1, local105 + 1, 301, 31);
			local45.fillRect(local98 + arg1 * 3 + 2, local105 + 2, 300 - arg1 * 3, 30);
			local172 = arg0 + " - " + arg1 + "%";
			local45.setFont(this.bf);
			local45.setColor(this.colourtext);
			local45.drawString(local172, (this.anInt10620 - this.bfm.stringWidth(local172)) / 2, this.anInt10617 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!a;)[B")
	private byte[] method8314(@OriginalArg(1) Class368 arg0) {
		@Pc(10) File local10;
		try {
			local10 = Class369.method8296(arg0.aString244);
		} catch (@Pc(12) Exception local12) {
			this.method8306("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method8312(local10);
		if (!this.method8311(arg0, local23)) {
			local23 = this.method8310(arg0, false);
			if (local23 == null) {
				local23 = this.method8310(arg0, true);
			}
			if (local23 == null) {
				this.method8306("download");
				return null;
			}
			if (!this.method8315(local10, local23)) {
				return null;
			}
			local23 = this.method8312(local10);
			if (!this.method8311(arg0, local23)) {
				this.method8306("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method8315(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg0);
			local13.write(arg1, 0, arg1.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method8306("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString259 = this.getParameter("unsignedurl");
			if (aString259 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean729 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString259), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString258 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class370.aStringArray43.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt10618 = Integer.parseInt(local64);
				if (anInt10618 < 0 || Class370.anIntArray593.length <= anInt10618) {
					anInt10618 = 0;
				}
			}
			this.lb = Class370.aClass371Array1[anInt10618];
			this.anInt10620 = this.getSize().width;
			this.anInt10617 = this.getSize().height;
			@Pc(102) int local102 = 32;
			try {
				@Pc(107) int local107 = Integer.parseInt(this.getParameter("modewhat"));
				local102 += local107;
			} catch (@Pc(113) Exception local113) {
			}
			try {
				@Pc(117) String local117 = this.getParameter("lang");
				if (local117 != null) {
					this.anInt10619 = Integer.parseInt(local117);
				}
			} catch (@Pc(126) Exception local126) {
			}
			Class369.method8298(Class370.aStringArray43[local36], local102);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString253, 0, this.lb.anInt10616);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10615);
					this.bar = this.method8316(this.lb.aString250);
					this.background = this.method8316(this.lb.aString249);
					this.left = this.method8316(this.lb.aString251);
					this.right = this.method8316(this.lb.aString255);
					this.top = this.method8316(this.lb.aString248);
					this.bottom = this.method8316(this.lb.aString257);
					this.bodyLeft = this.method8316(this.lb.aString252);
					this.bodyRight = this.method8316(this.lb.aString254);
					this.bodyFill = this.method8316(this.lb.aString256);
					@Pc(282) Image[] local282 = new Image[] { this.bar, this.background, this.left, this.right, this.top, this.bottom, this.bodyLeft, this.bodyRight, this.bodyFill };
					@Pc(287) MediaTracker local287 = new MediaTracker(this);
					for (@Pc(289) int local289 = 0; local289 < local282.length; local289++) {
						local287.addImage(local282[local289], local289);
					}
					while (true) {
						try {
							local287.waitForAll();
							break;
						} catch (@Pc(306) InterruptedException local306) {
						}
					}
				} catch (@Pc(310) Throwable local310) {
					this.method8307();
				}
			}
			@Pc(315) unpack local315 = null;
			@Pc(323) byte[] local323;
			try {
				Class.forName("java.util.jar.Pack200");
				local323 = this.method8314(Class370.aClass368_2);
				if (local323 == null) {
					return;
				}
				local315 = new unpack_Sub1(local323);
			} catch (@Pc(334) Throwable local334) {
			}
			if (local315 == null) {
				local323 = this.method8314(Class370.aClass368_1);
				if (local323 == null) {
					return;
				}
				@Pc(350) unpack local350 = new unpack(local323);
				@Pc(355) ClassLoader_Sub1 local355 = new ClassLoader_Sub1(local350);
				@Pc(358) Class local358 = Class.forName("unpack");
				local355.method8292(local358.getName(), local358);
				@Pc(368) Class local368 = local355.loadClass("unpackclass");
				@Pc(373) byte[] local373 = this.method8314(Class370.aClass368_3);
				if (local373 == null) {
					return;
				}
				local315 = (unpack) local368.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local373, Boolean.TRUE);
			}
			@Pc(409) ClassLoader_Sub1 local409 = new ClassLoader_Sub1(local315);
			@Pc(412) Class local412 = Class.forName("Class369");
			local409.method8292(local412.getName(), local412);
			@Pc(422) Class local422 = local409.loadClass("client");
			synchronized (this) {
				if (this.aBoolean726) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet3.init();
				if (this.aBoolean725) {
					this.anApplet3.start();
				}
				if (this.aBoolean727) {
					this.anApplet3.stop();
				}
			}
			this.method8317();
		} catch (@Pc(490) Exception local490) {
			RuntimeException_Sub2.anInt10614 = -1458621809;
			if (local490 instanceof InvocationTargetException) {
				@Pc(499) Throwable local499 = ((InvocationTargetException) local490).getTargetException();
				if (local499 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8300(local499, local490.toString(), this);
			} else {
				RuntimeException_Sub2.method8300(local490, null, this);
			}
			this.method8306("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean725 = this.aBoolean727 = false;
		this.aBoolean726 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean727 = true;
		this.aBoolean725 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean726 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8316(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(11) int local11 = 0;
			@Pc(16) int local16;
			while ((local16 = local6.read()) != -1) {
				local9[local11++] = (byte) local16;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(32) Exception local32) {
			throw new IOException();
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
	private void method8317() {
		this.aColor2 = null;
		this.aColor3 = null;
		this.barBuf = null;
		this.anImage14 = null;
	}
}
