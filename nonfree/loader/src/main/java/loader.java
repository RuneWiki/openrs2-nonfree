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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString122;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString123;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt9833 = 0;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!b;")
	private Class369 lb;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt9830;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet4;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt9831;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean722 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt9832 = 0;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Z")
	private boolean aBoolean725 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean723 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean726 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean725 = false;
		this.setBackground(Color.black);
		@Pc(19) Thread local19 = new Thread(this);
		local19.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IIILjava/lang/String;)Z")
	private boolean method8008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout(null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt9830, this.anInt9831);
			this.canvas.setVisible(true);
		}
		@Pc(41) Graphics local41 = this.canvas.getGraphics();
		if (local41 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9830, this.anInt9831);
			}
			@Pc(63) Graphics local63 = this.anImage14.getGraphics();
			@Pc(68) int local68 = this.bodyLeft.getWidth(null);
			@Pc(73) int local73 = this.bodyRight.getWidth(null);
			@Pc(78) int local78 = this.bodyFill.getWidth(null);
			@Pc(83) int local83 = this.bodyLeft.getHeight(null);
			@Pc(88) int local88 = this.bodyRight.getHeight(null);
			@Pc(93) int local93 = this.bodyFill.getHeight(null);
			local63.drawImage(this.bodyLeft, this.method8017(local68) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method8018(local83) - -this.lb.boxYOffset, null);
			@Pc(137) int local137 = this.lb.boxXOffset + local68 - this.lb.boxWidth / 2;
			@Pc(150) int local150 = this.lb.boxXOffset + this.lb.boxWidth / 2 - local73;
			@Pc(152) int local152;
			for (local152 = local137; local152 <= local150; local152 += local78) {
				local63.drawImage(this.bodyFill, local152 + this.method8017(local68) + this.lb.boxXOffset, this.method8018(local93) + this.lb.boxYOffset, null);
			}
			local63.drawImage(this.bodyRight, this.method8017(local73) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method8018(local88) + this.lb.boxYOffset, null);
			local152 = this.left.getWidth(null);
			@Pc(229) int local229 = this.left.getHeight(null);
			@Pc(234) int local234 = this.right.getWidth(null);
			@Pc(239) int local239 = this.right.getHeight(null);
			@Pc(244) int local244 = this.bottom.getHeight(null);
			@Pc(249) int local249 = this.top.getWidth(null);
			@Pc(254) int local254 = this.top.getHeight(null);
			@Pc(259) int local259 = this.bottom.getWidth(null);
			@Pc(264) int local264 = this.bar.getWidth(null);
			@Pc(269) int local269 = this.background.getWidth(null);
			@Pc(280) int local280 = this.method8017(this.lb.width) + this.lb.xOffset;
			@Pc(291) int local291 = this.method8018(this.lb.height) + this.lb.yOffset;
			local63.drawImage(this.left, local280, local291 + (this.lb.height - local229) / 2, null);
			local63.drawImage(this.right, this.lb.width + local280 - local234, (-local239 + this.lb.height) / 2 + local291, null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local152 - local234, this.lb.height);
			}
			@Pc(354) Graphics local354 = this.barBuf.getGraphics();
			@Pc(356) int local356;
			for (local356 = 0; local356 < this.lb.width - local152 - local234; local356 += local249) {
				local354.drawImage(this.top, local356, 0, null);
			}
			for (local356 = 0; local356 < this.lb.width - local152 - local234; local356 += local259) {
				local354.drawImage(this.bottom, local356, this.lb.height - local244, null);
			}
			local356 = (this.lb.width - local234 - local152) * arg1 / 100;
			if (local356 > 0) {
				@Pc(450) Image local450 = this.createImage(local356, this.lb.height - local244 - local254);
				@Pc(454) int local454 = local450.getWidth(null);
				@Pc(457) Graphics local457 = local450.getGraphics();
				for (@Pc(461) int local461 = arg0 - local264; local461 < local454; local461 += local264) {
					local457.drawImage(this.bar, local461, 0, null);
				}
				local354.drawImage(local450, 0, local254, null);
			}
			@Pc(487) int local487 = local356;
			local356 = this.lb.width - local234 - local152 - local356;
			if (local356 > 0) {
				@Pc(516) Image local516 = this.createImage(local356, this.lb.height - local254 - local244);
				@Pc(520) int local520 = local516.getWidth(null);
				@Pc(523) Graphics local523 = local516.getGraphics();
				for (@Pc(525) int local525 = 0; local525 < local520; local525 += local269) {
					local523.drawImage(this.background, local525, 0, null);
				}
				local354.drawImage(local516, local487, local254, null);
			}
			local63.drawImage(this.barBuf, local280 + local152, local291, null);
			local63.setFont(this.bf);
			local63.setColor(this.colourtext);
			@Pc(580) String local580 = arg2 + " - " + arg1 + "%";
			local63.drawString(local580, (this.lb.width - this.bfm.stringWidth(local580)) / 2 + local280, this.lb.textYOffset + 4 + this.lb.height / 2 + local291);
			local41.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(618) Exception local618) {
			this.method8014();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method8009(@OriginalArg(0) String arg0) {
		if (this.aBoolean723) {
			return;
		}
		this.aBoolean723 = true;
		try {
			if (aString123 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString123 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean722 = true;
		this.aBoolean726 = false;
		if (this.anApplet4 != null) {
			this.anApplet4.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method8010(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method8009("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;I)Z")
	private boolean method8011(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class368.anIntArray633[anInt9833]);
			this.aColor3 = new Color(Class368.anIntArray632[anInt9833]);
			this.colourtext = new Color(Class368.anIntArray634[anInt9833]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(93) int local93;
		@Pc(100) int local100;
		@Pc(171) String local171;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt9830, this.anInt9831);
			}
			@Pc(71) Graphics local71 = this.anImage14.getGraphics();
			local71.setColor(Color.black);
			local71.fillRect(0, 0, this.anInt9830, this.anInt9831);
			local71.setColor(this.aColor2);
			local93 = this.anInt9830 / 2 - 152;
			local100 = this.anInt9831 / 2 - 18;
			local71.drawRect(local93, local100, 303, 33);
			local71.setColor(this.aColor3);
			local71.fillRect(local93 + 2, local100 + 2, arg1 * 3, 30);
			local71.setColor(Color.black);
			local71.drawRect(local93 + 1, local100 + 1, 301, 31);
			local71.fillRect(local93 + arg1 * 3 + 2, local100 + 2, 300 - arg1 * 3, 30);
			local71.setFont(this.bf);
			local171 = arg0 + " - " + arg1 + "%";
			local71.setColor(this.colourtext);
			local71.drawString(local171, (this.anInt9830 - this.bfm.stringWidth(local171)) / 2, this.anInt9831 / 2 + 4);
			local50.drawImage(this.anImage14, 0, 0, null);
		} catch (@Pc(203) Exception local203) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt9830, this.anInt9831);
			local50.setColor(this.aColor2);
			local93 = this.anInt9830 / 2 - 152;
			local100 = this.anInt9831 / 2 - 18;
			local50.drawRect(local93, local100, 303, 33);
			local50.setColor(this.aColor3);
			local50.fillRect(local93 + 2, local100 + 2, arg1 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local93 + 1, local100 + 1, 301, 31);
			local50.fillRect(arg1 * 3 + local93 + 2, local100 - -2, 300 - arg1 * 3, 30);
			local50.setFont(this.bf);
			local171 = arg0 + " - " + arg1 + "%";
			local50.setColor(this.colourtext);
			local50.drawString(local171, (this.anInt9830 - this.bfm.stringWidth(local171)) / 2, this.anInt9831 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method8012(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(9) byte[] local9 = new byte[1000];
			@Pc(11) int local11 = 0;
			@Pc(15) int local15;
			while ((local15 = local6.read()) != -1) {
				local9[local11++] = (byte) local15;
			}
			return Toolkit.getDefaultToolkit().createImage(local9);
		} catch (@Pc(32) Exception local32) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;)[B")
	private byte[] method8013(@OriginalArg(1) Class370 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class371.method8007(arg0.aString119);
		} catch (@Pc(6) Exception local6) {
			this.method8009("nocache");
			return null;
		}
		@Pc(17) byte[] local17 = this.method8021(local4);
		if (!this.method8020(arg0, local17)) {
			local17 = this.method8016(false, arg0);
			if (local17 == null) {
				local17 = this.method8016(true, arg0);
			}
			if (local17 == null) {
				this.method8009("download");
				return null;
			}
			if (!this.method8010(local4, local17)) {
				return null;
			}
			local17 = this.method8021(local4);
			if (!this.method8020(arg0, local17)) {
				this.method8009("mismatch");
				return null;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean725 = true;
		this.aBoolean726 = this.aBoolean722 = false;
		if (this.anApplet4 != null) {
			this.anApplet4.destroy();
		}
		this.anApplet4 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I)V")
	private void method8014() {
		this.aBoolean724 = true;
		this.bf = null;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;IB)Z")
	private boolean method8015(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		return Class368.aClass369Array1[anInt9833] == null || this.aBoolean724 ? this.method8011(arg1, arg2) : this.method8008(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;B)[B")
	private byte[] method8016(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class370 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt9828];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth(null);
		}
		try {
			@Pc(62) InputStream local62;
			if (arg0) {
				@Pc(25) URL local25 = this.getCodeBase();
				@Pc(33) Socket local33 = new Socket(InetAddress.getByName(local25.getHost()), 443);
				local33.setSoTimeout(10000);
				@Pc(39) OutputStream local39 = local33.getOutputStream();
				local39.write(17);
				local39.write(("JAGGRAB " + local25.getFile() + arg1.aString118 + "\n\n").getBytes());
				local62 = local33.getInputStream();
			} else {
				local62 = (new URL(this.getCodeBase(), arg1.aString118)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			while (true) {
				if (local77 >= local5.length) {
					local62.close();
					if (arg1.anInt9828 != arg1.anInt9827) {
						@Pc(189) byte[] local189 = new byte[arg1.anInt9827];
						@Pc(194) Inflater local194 = new Inflater(true);
						local194.setInput(local5);
						local194.inflate(local189);
						local5 = local189;
					}
					break;
				}
				@Pc(89) int local89 = local5.length - local77;
				if (local89 > 1000) {
					local89 = 1000;
				}
				@Pc(103) int local103 = local62.read(local5, local77, local89);
				if (local103 < 0) {
					throw new EOFException();
				}
				local77 += local103;
				@Pc(120) int local120 = local77 * 100 / local5.length;
				@Pc(122) int local122 = 0;
				if (this.lb != null && this.bar != null) {
					local122 = (int) (System.currentTimeMillis() / 200L * (long) this.lb.offsetPerTenCycles) % local7;
				}
				if (local75 != local120 || local79 != local122) {
					try {
						if (this.method8015(local122, arg1.aStringArray44[this.anInt9832], local120)) {
							local75 = local120;
							local79 = local122;
						}
					} catch (@Pc(169) Exception local169) {
					}
				}
			}
		} catch (@Pc(205) Exception local205) {
			return null;
		}
		return this.method8020(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(II)I")
	private int method8017(@OriginalArg(1) int arg0) {
		return this.lb.xMiddle ? (this.anInt9830 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(II)I")
	private int method8018(@OriginalArg(0) int arg0) {
		return this.lb.yMiddle ? (this.anInt9831 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method8019() {
		this.anImage14 = null;
		this.aColor3 = null;
		this.aColor2 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;Z[B)Z")
	private boolean method8020(@OriginalArg(0) Class370 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray635[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(50) Exception local50) {
			this.method8009("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString122 = this.getParameter("unsignedurl");
			if (aString122 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean723 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString122), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString123 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class368.aStringArray43.length) {
					local39 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt9833 = Integer.parseInt(local64);
				if (anInt9833 < 0 || anInt9833 >= Class368.anIntArray633.length) {
					anInt9833 = 0;
				}
			}
			this.lb = Class368.aClass369Array1[anInt9833];
			this.anInt9830 = this.getSize().width;
			this.anInt9831 = this.getSize().height;
			@Pc(101) int local101 = 32;
			try {
				@Pc(106) int local106 = Integer.parseInt(this.getParameter("modewhat"));
				local101 += local106;
			} catch (@Pc(112) Exception local112) {
			}
			try {
				@Pc(116) String local116 = this.getParameter("lang");
				if (local116 != null) {
					this.anInt9832 = Integer.parseInt(local116);
				}
			} catch (@Pc(125) Exception local125) {
			}
			Class371.method8005(Class368.aStringArray43[local39], local101);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString111, 0, this.lb.anInt9824);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt9825);
					this.bar = this.method8012(this.lb.aString110);
					this.background = this.method8012(this.lb.aString115);
					this.left = this.method8012(this.lb.aString116);
					this.right = this.method8012(this.lb.aString114);
					this.top = this.method8012(this.lb.aString112);
					this.bottom = this.method8012(this.lb.aString107);
					this.bodyLeft = this.method8012(this.lb.aString108);
					this.bodyRight = this.method8012(this.lb.aString113);
					this.bodyFill = this.method8012(this.lb.aString109);
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
					this.method8014();
				}
			}
			@Pc(314) unpack local314 = null;
			@Pc(322) byte[] local322;
			try {
				Class.forName("java.util.jar.Pack200");
				local322 = this.method8013(Class368.aClass370_2);
				if (local322 == null) {
					return;
				}
				local314 = new unpack_Sub1(local322);
			} catch (@Pc(333) Throwable local333) {
			}
			if (local314 == null) {
				local322 = this.method8013(Class368.aClass370_1);
				if (local322 == null) {
					return;
				}
				@Pc(351) unpack local351 = new unpack(local322);
				@Pc(356) ClassLoader_Sub1 local356 = new ClassLoader_Sub1(local351);
				@Pc(359) Class local359 = Class.forName("unpack");
				local356.method7996(local359, local359.getName());
				@Pc(369) Class local369 = local356.loadClass("unpackclass");
				@Pc(374) byte[] local374 = this.method8013(Class368.aClass370_3);
				if (local374 == null) {
					return;
				}
				local314 = (unpack) local369.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local374, Boolean.TRUE);
			}
			@Pc(408) ClassLoader_Sub1 local408 = new ClassLoader_Sub1(local314);
			@Pc(411) Class local411 = Class.forName("Class371");
			local408.method7996(local411, local411.getName());
			@Pc(421) Class local421 = local408.loadClass("client");
			synchronized (this) {
				if (this.aBoolean725) {
					return;
				}
				this.anApplet4 = (Applet) local421.getDeclaredConstructor().newInstance();
				local421.getMethod("provideLoaderApplet", Applet.class).invoke(null, this);
				this.anApplet4.init();
				if (this.aBoolean726) {
					this.anApplet4.start();
				}
				if (this.aBoolean722) {
					this.anApplet4.stop();
				}
			}
			this.method8019();
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt9826 = 1229992914;
			if (local491 instanceof InvocationTargetException) {
				@Pc(507) Throwable local507 = ((InvocationTargetException) local491).getTargetException();
				if (local507 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method8001(local491.toString(), this, local507);
			} else {
				RuntimeException_Sub2.method8001(null, this, local491);
			}
			this.method8009("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method8021(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local9];
			local20.readFully(local29, 0, local9);
			local20.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean722 = false;
		this.aBoolean726 = true;
		if (this.anApplet4 != null) {
			this.anApplet4.start();
		}
	}
}
