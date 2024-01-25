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
	private static String aString134;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString135;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt10774 = 0;

	@OriginalMember(owner = "loader!loader", name = "canvas", descriptor = "Ljava/awt/Canvas;")
	private Canvas canvas;

	@OriginalMember(owner = "loader!loader", name = "bodyFill", descriptor = "Ljava/awt/Image;")
	private Image bodyFill;

	@OriginalMember(owner = "loader!loader", name = "barBuf", descriptor = "Ljava/awt/Image;")
	private Image barBuf;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet4;

	@OriginalMember(owner = "loader!loader", name = "bottom", descriptor = "Ljava/awt/Image;")
	private Image bottom;

	@OriginalMember(owner = "loader!loader", name = "bfm", descriptor = "Ljava/awt/FontMetrics;")
	private FontMetrics bfm;

	@OriginalMember(owner = "loader!loader", name = "colourtext", descriptor = "Ljava/awt/Color;")
	private Color colourtext;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt10773;

	@OriginalMember(owner = "loader!loader", name = "lb", descriptor = "Lloader!d;")
	private Class386 lb;

	@OriginalMember(owner = "loader!loader", name = "right", descriptor = "Ljava/awt/Image;")
	private Image right;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean737;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/awt/Color;")
	private Color aColor2;

	@OriginalMember(owner = "loader!loader", name = "bodyRight", descriptor = "Ljava/awt/Image;")
	private Image bodyRight;

	@OriginalMember(owner = "loader!loader", name = "bodyLeft", descriptor = "Ljava/awt/Image;")
	private Image bodyLeft;

	@OriginalMember(owner = "loader!loader", name = "background", descriptor = "Ljava/awt/Image;")
	private Image background;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt10776;

	@OriginalMember(owner = "loader!loader", name = "bf", descriptor = "Ljava/awt/Font;")
	private Font bf;

	@OriginalMember(owner = "loader!loader", name = "left", descriptor = "Ljava/awt/Image;")
	private Image left;

	@OriginalMember(owner = "loader!loader", name = "bar", descriptor = "Ljava/awt/Image;")
	private Image bar;

	@OriginalMember(owner = "loader!loader", name = "m", descriptor = "Ljava/awt/Color;")
	private Color aColor3;

	@OriginalMember(owner = "loader!loader", name = "top", descriptor = "Ljava/awt/Image;")
	private Image top;

	@OriginalMember(owner = "loader!loader", name = "n", descriptor = "Ljava/awt/Image;")
	private Image anImage14;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean738 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean739 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt10775 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean736 = false;

	@OriginalMember(owner = "loader!loader", name = "o", descriptor = "Z")
	private boolean aBoolean740 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BI)I")
	private int method9058(@OriginalArg(1) int arg0) {
		return this.lb.yMiddle ? (this.anInt10773 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!a;)[B")
	private byte[] method9059(@OriginalArg(1) Class385 arg0) {
		@Pc(4) File local4;
		try {
			local4 = Class387.method9054(arg0.aString120);
		} catch (@Pc(6) Exception local6) {
			this.method9070("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method9064(local4);
		if (!this.method9065(arg0, local26)) {
			local26 = this.method9069(false, arg0);
			if (local26 == null) {
				local26 = this.method9069(true, arg0);
			}
			if (local26 == null) {
				this.method9070("download");
				return null;
			}
			if (!this.method9067(local26, local4)) {
				return null;
			}
			local26 = this.method9064(local4);
			if (!this.method9065(arg0, local26)) {
				this.method9070("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean736 = true;
		this.aBoolean739 = this.aBoolean738 = false;
		if (this.anApplet4 != null) {
			this.anApplet4.destroy();
		}
		this.anApplet4 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/awt/Image;")
	private Image method9060(@OriginalArg(0) String arg0) throws IOException {
		try {
			@Pc(6) InputStream local6 = this.getClass().getResourceAsStream(arg0);
			@Pc(16) byte[] local16 = new byte[3000];
			@Pc(18) int local18 = 0;
			@Pc(22) int local22;
			while ((local22 = local6.read()) != -1) {
				local16[local18++] = (byte) local22;
			}
			return Toolkit.getDefaultToolkit().createImage(local16);
		} catch (@Pc(39) Exception local39) {
			throw new IOException();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;III)Z")
	private boolean method9061(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.canvas == null) {
			this.canvas = new Canvas();
			this.setLayout((LayoutManager) null);
			this.add(this.canvas);
			this.canvas.setSize(this.anInt10776, this.anInt10773);
			this.canvas.setVisible(true);
		}
		@Pc(44) Graphics local44 = this.canvas.getGraphics();
		if (local44 == null) {
			this.repaint();
			return false;
		}
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10776, this.anInt10773);
			}
			@Pc(66) Graphics local66 = this.anImage14.getGraphics();
			@Pc(71) int local71 = this.bodyLeft.getWidth((ImageObserver) null);
			@Pc(76) int local76 = this.bodyRight.getWidth((ImageObserver) null);
			@Pc(81) int local81 = this.bodyFill.getWidth((ImageObserver) null);
			@Pc(86) int local86 = this.bodyLeft.getHeight((ImageObserver) null);
			@Pc(91) int local91 = this.bodyRight.getHeight((ImageObserver) null);
			@Pc(96) int local96 = this.bodyFill.getHeight((ImageObserver) null);
			local66.drawImage(this.bodyLeft, this.method9066(local71) + this.lb.boxXOffset - this.lb.boxWidth / 2, this.method9058(local86) - -this.lb.boxYOffset, (ImageObserver) null);
			@Pc(138) int local138 = local71 + this.lb.boxXOffset - this.lb.boxWidth / 2;
			@Pc(149) int local149 = this.lb.boxXOffset + this.lb.boxWidth / 2;
			@Pc(151) int local151;
			for (local151 = local138; local151 <= local149; local151 += local81) {
				local66.drawImage(this.bodyFill, this.method9066(local71) + this.lb.boxXOffset + local151, this.method9058(local96) - -this.lb.boxYOffset, (ImageObserver) null);
			}
			local66.drawImage(this.bodyRight, this.method9066(local76) + this.lb.boxXOffset + this.lb.boxWidth / 2, this.method9058(local91) - -this.lb.boxYOffset, (ImageObserver) null);
			local151 = this.left.getWidth((ImageObserver) null);
			@Pc(229) int local229 = this.left.getHeight((ImageObserver) null);
			@Pc(234) int local234 = this.right.getWidth((ImageObserver) null);
			@Pc(239) int local239 = this.right.getHeight((ImageObserver) null);
			@Pc(244) int local244 = this.bottom.getHeight((ImageObserver) null);
			@Pc(249) int local249 = this.top.getWidth((ImageObserver) null);
			@Pc(254) int local254 = this.top.getHeight((ImageObserver) null);
			@Pc(259) int local259 = this.bottom.getWidth((ImageObserver) null);
			@Pc(264) int local264 = this.bar.getWidth((ImageObserver) null);
			@Pc(269) int local269 = this.background.getWidth((ImageObserver) null);
			@Pc(280) int local280 = this.method9066(this.lb.width) + this.lb.xOffset;
			@Pc(292) int local292 = this.method9058(this.lb.height) + this.lb.yOffset;
			local66.drawImage(this.left, local280, (this.lb.height - local229) / 2 + local292, (ImageObserver) null);
			local66.drawImage(this.right, this.lb.width + local280 - local234, (this.lb.height - local239) / 2 + local292, (ImageObserver) null);
			if (this.barBuf == null) {
				this.barBuf = this.createImage(this.lb.width - local151 - local234, this.lb.height);
			}
			@Pc(353) Graphics local353 = this.barBuf.getGraphics();
			@Pc(355) int local355;
			for (local355 = 0; local355 < this.lb.width - local234 - local151; local355 += local249) {
				local353.drawImage(this.top, local355, 0, (ImageObserver) null);
			}
			for (local355 = 0; local355 < this.lb.width - local151 - local234; local355 += local259) {
				local353.drawImage(this.bottom, local355, this.lb.height - local244, (ImageObserver) null);
			}
			local355 = (this.lb.width - local234 - local151) * arg1 / 100;
			if (local355 > 0) {
				@Pc(448) Image local448 = this.createImage(local355, this.lb.height - local244 - local254);
				@Pc(452) int local452 = local448.getWidth((ImageObserver) null);
				@Pc(455) Graphics local455 = local448.getGraphics();
				for (@Pc(460) int local460 = arg2 - local264; local460 < local452; local460 += local264) {
					local455.drawImage(this.bar, local460, 0, (ImageObserver) null);
				}
				local353.drawImage(local448, 0, local254, (ImageObserver) null);
			}
			@Pc(486) int local486 = local355;
			local355 = this.lb.width - local151 - local234 - local355;
			if (local355 > 0) {
				@Pc(516) Image local516 = this.createImage(local355, this.lb.height - local244 - local254);
				@Pc(520) int local520 = local516.getWidth((ImageObserver) null);
				@Pc(523) Graphics local523 = local516.getGraphics();
				for (@Pc(525) int local525 = 0; local525 < local520; local525 += local269) {
					local523.drawImage(this.background, local525, 0, (ImageObserver) null);
				}
				local353.drawImage(local516, local486, local254, (ImageObserver) null);
			}
			local66.drawImage(this.barBuf, local280 + local151, local292, (ImageObserver) null);
			local66.setFont(this.bf);
			local66.setColor(this.colourtext);
			@Pc(584) String local584 = arg0 + " - " + arg1 + "%";
			local66.drawString(local584, (this.lb.width - this.bfm.stringWidth(local584)) / 2 + local280, this.lb.textYOffset + 4 + this.lb.height / 2 + local292);
			local44.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(623) Exception local623) {
			this.method9071();
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B)V")
	private void method9062() {
		this.aColor2 = null;
		this.aColor3 = null;
		this.anImage14 = null;
		this.barBuf = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		@Pc(2) Container local2 = this.getParent();
		if (local2 != null) {
			local2.setBackground(Color.black);
		}
		this.aBoolean736 = false;
		this.setBackground(Color.black);
		@Pc(18) Thread local18 = new Thread(this);
		local18.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	private boolean method9063(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.bf == null) {
			this.bf = new Font("Helvetica", 1, 13);
			this.bfm = this.getFontMetrics(this.bf);
			this.aColor2 = new Color(Class388.anIntArray653[anInt10774]);
			this.aColor3 = new Color(Class388.anIntArray652[anInt10774]);
			this.colourtext = new Color(Class388.anIntArray654[anInt10774]);
		}
		@Pc(50) Graphics local50 = this.getGraphics();
		if (local50 == null) {
			this.repaint();
			return false;
		}
		@Pc(90) int local90;
		@Pc(97) int local97;
		@Pc(164) String local164;
		try {
			if (this.anImage14 == null) {
				this.anImage14 = this.createImage(this.anInt10776, this.anInt10773);
			}
			@Pc(68) Graphics local68 = this.anImage14.getGraphics();
			local68.setColor(Color.black);
			local68.fillRect(0, 0, this.anInt10776, this.anInt10773);
			local68.setColor(this.aColor2);
			local90 = this.anInt10776 / 2 - 152;
			local97 = this.anInt10773 / 2 - 18;
			local68.drawRect(local90, local97, 303, 33);
			local68.setColor(this.aColor3);
			local68.fillRect(local90 + 2, local97 + 2, arg0 * 3, 30);
			local68.setColor(Color.black);
			local68.drawRect(local90 + 1, local97 + 1, 301, 31);
			local68.fillRect(arg0 * 3 + local90 + 2, local97 + 2, 300 - arg0 * 3, 30);
			local164 = arg1 + " - " + arg0 + "%";
			local68.setFont(this.bf);
			local68.setColor(this.colourtext);
			local68.drawString(local164, (this.anInt10776 - this.bfm.stringWidth(local164)) / 2, this.anInt10773 / 2 + 4);
			local50.drawImage(this.anImage14, 0, 0, (ImageObserver) null);
		} catch (@Pc(201) Exception local201) {
			local50.setColor(Color.black);
			local50.fillRect(0, 0, this.anInt10776, this.anInt10773);
			local50.setColor(this.aColor2);
			local90 = this.anInt10776 / 2 - 152;
			local97 = this.anInt10773 / 2 - 18;
			local50.drawRect(local90, local97, 303, 33);
			local50.setColor(this.aColor3);
			local50.fillRect(local90 + 2, local97 + 2, arg0 * 3, 30);
			local50.setColor(Color.black);
			local50.drawRect(local90 + 1, local97 - -1, 301, 31);
			local50.fillRect(arg0 * 3 + local90 + 2, local97 + 2, 300 - arg0 * 3, 30);
			local164 = arg1 + " - " + arg0 + "%";
			local50.setFont(this.bf);
			local50.setColor(this.colourtext);
			local50.drawString(local164, (this.anInt10776 - this.bfm.stringWidth(local164)) / 2, this.anInt10773 / 2 + 4);
		}
		return true;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method9064(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet4 != null) {
			this.anApplet4.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!a;[B)Z")
	private boolean method9065(@OriginalArg(1) Class385 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (local17[local26] != arg0.anIntArray651[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method9070("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean738 = true;
		this.aBoolean739 = false;
		if (this.anApplet4 != null) {
			this.anApplet4.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IB)I")
	private int method9066(@OriginalArg(0) int arg0) {
		return this.lb.xMiddle ? (this.anInt10776 - arg0) / 2 : 0;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method9067(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg1);
			local12.write(arg0, 0, arg0.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method9070("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean738 = false;
		this.aBoolean739 = true;
		if (this.anApplet4 != null) {
			this.anApplet4.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IILjava/lang/String;Z)Z")
	private boolean method9068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		return Class388.aClass386Array1[anInt10774] == null || this.aBoolean737 ? this.method9063(arg0, arg2) : this.method9061(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;I)[B")
	private byte[] method9069(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class385 arg1) {
		@Pc(5) byte[] local5 = new byte[arg1.anInt10767];
		@Pc(7) int local7 = 0;
		if (this.lb != null && this.bar != null) {
			local7 = this.bar.getWidth((ImageObserver) null);
		}
		try {
			@Pc(31) InputStream local31;
			if (arg0) {
				@Pc(36) URL local36 = this.getCodeBase();
				@Pc(44) Socket local44 = new Socket(InetAddress.getByName(local36.getHost()), 443);
				local44.setSoTimeout(10000);
				@Pc(50) OutputStream local50 = local44.getOutputStream();
				local50.write(17);
				local50.write(("JAGGRAB " + local36.getFile() + arg1.aString119 + "\n\n").getBytes());
				local31 = local44.getInputStream();
			} else {
				local31 = (new URL(this.getCodeBase(), arg1.aString119)).openStream();
			}
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = 0;
			@Pc(79) int local79 = 0;
			while (true) {
				if (local5.length > local77) {
					@Pc(89) int local89 = local5.length - local77;
					if (local89 > 1000) {
						local89 = 1000;
					}
					@Pc(102) int local102 = local31.read(local5, local77, local89);
					if (local102 >= 0) {
						local77 += local102;
						@Pc(123) int local123 = local77 * 100 / local5.length;
						@Pc(125) int local125 = 0;
						if (this.lb != null && this.bar != null) {
							local125 = (int) (System.currentTimeMillis() * (long) this.lb.offsetPerTenCycles / 200L) % local7;
						}
						if (local75 != local123 || local79 != local125) {
							try {
								if (this.method9068(local123, local125, arg1.aStringArray77[this.anInt10775])) {
									local75 = local123;
									local79 = local125;
								}
							} catch (@Pc(171) Exception local171) {
							}
						}
						continue;
					}
					throw new EOFException();
				}
				local31.close();
				if (arg1.anInt10767 != arg1.anInt10768) {
					@Pc(185) byte[] local185 = new byte[arg1.anInt10768];
					@Pc(190) Inflater local190 = new Inflater(true);
					local190.setInput(local5);
					local190.inflate(local185);
					local5 = local185;
				}
				break;
			}
		} catch (@Pc(201) Exception local201) {
			return null;
		}
		return this.method9065(arg1, local5) ? local5 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "(Ljava/lang/String;I)V")
	private void method9070(@OriginalArg(0) String arg0) {
		if (this.aBoolean740) {
			return;
		}
		this.aBoolean740 = true;
		try {
			if (aString135 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString135 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(59) Exception local59) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z)V")
	private void method9071() {
		this.bf = null;
		this.aBoolean737 = true;
		this.bfm = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString134 = this.getParameter("unsignedurl");
			if (aString134 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean740 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString134), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString135 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class388.aStringArray78.length) {
					local37 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt10774 = Integer.parseInt(local63);
				if (anInt10774 < 0 || anInt10774 >= Class388.anIntArray653.length) {
					anInt10774 = 0;
				}
			}
			this.lb = Class388.aClass386Array1[anInt10774];
			this.anInt10776 = this.getSize().width;
			this.anInt10773 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt10775 = Integer.parseInt(local113);
				}
			} catch (@Pc(121) Exception local121) {
			}
			Class387.method9052(Class388.aStringArray78[local37], local98);
			if (this.lb != null) {
				try {
					this.bf = new Font(this.lb.aString128, 0, this.lb.anInt10770);
					this.bfm = this.getFontMetrics(this.bf);
					this.colourtext = new Color(this.lb.anInt10771);
					this.bar = this.method9060(this.lb.aString123);
					this.background = this.method9060(this.lb.aString126);
					this.left = this.method9060(this.lb.aString124);
					this.right = this.method9060(this.lb.aString129);
					this.top = this.method9060(this.lb.aString127);
					this.bottom = this.method9060(this.lb.aString125);
					this.bodyLeft = this.method9060(this.lb.aString130);
					this.bodyRight = this.method9060(this.lb.aString131);
					this.bodyFill = this.method9060(this.lb.aString122);
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
					this.method9071();
				}
			}
			@Pc(310) unpack local310 = null;
			@Pc(318) byte[] local318;
			try {
				Class.forName("java.util.jar.Pack200");
				local318 = this.method9059(Class388.aClass385_2);
				if (local318 == null) {
					return;
				}
				local310 = new unpack_Sub1(local318);
			} catch (@Pc(329) Throwable local329) {
			}
			if (local310 == null) {
				local318 = this.method9059(Class388.aClass385_1);
				if (local318 == null) {
					return;
				}
				@Pc(347) unpack local347 = new unpack(local318);
				@Pc(352) ClassLoader_Sub1 local352 = new ClassLoader_Sub1(local347);
				@Pc(355) Class local355 = Class.forName("unpack");
				local352.method9051(local355, local355.getName());
				@Pc(365) Class local365 = local352.loadClass("unpackclass");
				@Pc(370) byte[] local370 = this.method9059(Class388.aClass385_3);
				if (local370 == null) {
					return;
				}
				local310 = (unpack) local365.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local370, Boolean.TRUE);
			}
			@Pc(405) ClassLoader_Sub1 local405 = new ClassLoader_Sub1(local310);
			@Pc(408) Class local408 = Class.forName("Class387");
			local405.method9051(local408, local408.getName());
			@Pc(418) Class local418 = local405.loadClass("client");
			synchronized (this) {
				if (this.aBoolean736) {
					return;
				}
				this.anApplet4 = (Applet) local418.getDeclaredConstructor().newInstance();
				local418.getMethod("provideLoaderApplet", Applet.class).invoke((Object) null, this);
				this.anApplet4.init();
				if (this.aBoolean739) {
					this.anApplet4.start();
				}
				if (this.aBoolean738) {
					this.anApplet4.stop();
				}
			}
			this.method9062();
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt10769 = 1896824403;
			if (local488 instanceof InvocationTargetException) {
				@Pc(504) Throwable local504 = ((InvocationTargetException) local488).getTargetException();
				if (local504 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method9045(local504, local488.toString(), this);
			} else {
				RuntimeException_Sub2.method9045(local488, (String) null, this);
			}
			this.method9070("crash");
		}
	}
}
