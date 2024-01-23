import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt5010;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt5011;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean452 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean451 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean453 = false;

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
			this.anInt5010 = this.getSize().width;
			@Pc(6) int local6 = 32;
			this.anInt5011 = this.getSize().height;
			try {
				@Pc(16) int local16 = Integer.parseInt(this.getParameter("modewhat"));
				local6 += local16;
			} catch (@Pc(22) Exception local22) {
			}
			try {
				@Pc(26) String local26 = this.getParameter("lang");
				if (local26 != null && local26.equals("1")) {
					this.aBoolean453 = true;
				}
			} catch (@Pc(39) Exception local39) {
			}
			@Pc(48) Class131 local48;
			try {
				local48 = new Class131(true, this, local6, "runescape", 27);
			} catch (@Pc(50) Exception local50) {
				this.method3778("nocache");
				return;
			}
			@Pc(59) ClassLoader_Sub1 local59 = new ClassLoader_Sub1();
			@Pc(68) byte[] local68;
			try {
				Class.forName("java.util.jar.Pack200");
				local68 = this.method3779(local48, Class130.aClass129_2);
				if (local68 == null) {
					return;
				}
				local59.anUnpack1 = new unpack_Sub1(local68);
			} catch (@Pc(81) Throwable local81) {
			}
			if (local59.anUnpack1 == null) {
				local68 = this.method3779(local48, Class130.aClass129_1);
				if (local68 == null) {
					return;
				}
				@Pc(100) ClassLoader_Sub1 local100 = new ClassLoader_Sub1();
				local100.anUnpack1 = new unpack(local68);
				@Pc(109) Class local109 = Class.forName("unpack");
				local100.aHashtable1.put(local109.getName(), local109);
				@Pc(120) Class local120 = local100.loadClass("unpackclass");
				@Pc(126) byte[] local126 = this.method3779(local48, Class130.aClass129_3);
				if (local126 == null) {
					return;
				}
				local59.anUnpack1 = (unpack) local120.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local126, Boolean.TRUE);
			}
			@Pc(160) Class local160 = Class.forName("Class132");
			local59.aHashtable1.put(local160.getName(), local160);
			@Pc(170) Class local170 = Class.forName("Class131");
			local59.aHashtable1.put(local170.getName(), local170);
			@Pc(180) Class local180 = Class.forName("Class133");
			local59.aHashtable1.put(local180.getName(), local180);
			@Pc(190) Class local190 = Class.forName("Interface5");
			local59.aHashtable1.put(local190.getName(), local190);
			@Pc(201) Class local201 = local59.loadClass("client");
			synchronized (this) {
				if (this.aBoolean450) {
					return;
				}
				this.anApplet3 = (Applet) local201.getDeclaredConstructor().newInstance();
				local201.getMethod("providesignlink", local170).invoke(null, local48);
				this.anApplet3.init();
				if (this.aBoolean451) {
					this.anApplet3.start();
				}
				if (this.aBoolean452) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(261) Exception local261) {
			RuntimeException_Sub2.anInt5005 = 399245477;
			if (local261 instanceof InvocationTargetException) {
				@Pc(277) Throwable local277 = ((InvocationTargetException) local261).getTargetException();
				if (local277 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method3753(local277, local261.toString(), this);
			} else {
				RuntimeException_Sub2.method3753(local261, null, this);
			}
			this.method3778("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean450 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method3778(@OriginalArg(0) String arg0) {
		if (this.aBoolean449) {
			return;
		}
		this.aBoolean449 = true;
		try {
			this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean450 = true;
		this.aBoolean451 = this.aBoolean452 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ej;ILloader!b;)[B")
	private byte[] method3779(@OriginalArg(0) Class131 arg0, @OriginalArg(2) Class129 arg1) {
		@Pc(7) File local7 = new File(arg0.aFile4, arg1.aString12);
		@Pc(18) byte[] local18 = this.method3780(local7);
		if (!this.method3782(arg1, local18)) {
			local18 = this.method3781(false, arg1);
			if (local18 == null) {
				local18 = this.method3781(true, arg1);
			}
			if (local18 == null) {
				this.method3778("download");
				return null;
			}
			if (!this.method3783(local18, local7)) {
				return null;
			}
			local18 = this.method3780(local7);
			if (!this.method3782(arg1, local18)) {
				this.method3778("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean452 = false;
		this.aBoolean451 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method3780(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(23) DataInputStream local23 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local23.readFully(local12, 0, local9);
			local23.close();
			return local12;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!b;B)[B")
	private byte[] method3781(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class129 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt5007];
		try {
			@Pc(71) InputStream local71;
			if (arg0) {
				@Pc(34) URL local34 = this.getCodeBase();
				@Pc(42) Socket local42 = new Socket(InetAddress.getByName(local34.getHost()), 443);
				local42.setSoTimeout(10000);
				@Pc(48) OutputStream local48 = local42.getOutputStream();
				local48.write(17);
				local48.write(("JAGGRAB " + local34.getFile() + arg1.aString15 + "\n\n").getBytes());
				local71 = local42.getInputStream();
			} else {
				local71 = (new URL(this.getCodeBase(), arg1.aString15)).openStream();
			}
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = 0;
			while (local21.length > local86) {
				@Pc(100) int local100 = local21.length - local86;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(113) int local113 = local71.read(local21, local86, local100);
				if (local113 < 0) {
					throw new EOFException();
				}
				local86 += local113;
				@Pc(130) int local130 = local86 * 100 / local21.length;
				if (local130 != local84) {
					try {
						@Pc(136) Graphics local136 = this.getGraphics();
						if (local136 == null) {
							this.repaint();
						} else {
							local136.setColor(Color.black);
							local136.fillRect(0, 0, this.anInt5010, this.anInt5011);
							local84 = local130;
							local136.setColor(local17);
							local136.drawRect(this.anInt5010 / 2 - 152, this.anInt5011 / 2 + -18, 303, 33);
							@Pc(190) String local190 = this.aBoolean453 ? arg1.aString14 : arg1.aString13 + " - " + local130 + "%";
							local136.setFont(local8);
							local136.setColor(Color.white);
							local136.drawString(local190, (this.anInt5010 - local12.stringWidth(local190)) / 2, this.anInt5011 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local71.close();
			if (arg1.anInt5007 != arg1.anInt5008) {
				@Pc(236) byte[] local236 = new byte[arg1.anInt5008];
				@Pc(241) Inflater local241 = new Inflater(true);
				local241.setInput(local21);
				local241.inflate(local236);
				local21 = local236;
			}
		} catch (@Pc(252) Exception local252) {
			return null;
		}
		return this.method3782(arg1, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;I[B)Z")
	private boolean method3782(@OriginalArg(0) Class129 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local18[local25] != arg0.anIntArray385[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method3778("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean452 = true;
		this.aBoolean451 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method3783(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method3778("savefile");
			return false;
		}
	}
}
