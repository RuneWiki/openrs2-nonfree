import java.applet.Applet;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!hu")
public final class Class275 implements Runnable {

	@OriginalMember(owner = "loader!hu", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!hu", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!hu", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!hu", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!hu", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!hu", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString82;

	@OriginalMember(owner = "loader!hu", name = "x", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!hu", name = "w", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!hu", name = "m", descriptor = "I")
	private static final int anInt7627 = 1;

	@OriginalMember(owner = "loader!hu", name = "A", descriptor = "Ljava/util/Hashtable;")
	private static Hashtable aHashtable4 = new Hashtable(16);

	@OriginalMember(owner = "loader!hu", name = "y", descriptor = "J")
	private static volatile long aLong227 = 0L;

	@OriginalMember(owner = "loader!hu", name = "p", descriptor = "Lloader!gq;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "loader!hu", name = "c", descriptor = "Z")
	private boolean aBoolean503 = false;

	@OriginalMember(owner = "loader!hu", name = "u", descriptor = "Lloader!me;")
	private Class277 aClass277_2 = null;

	@OriginalMember(owner = "loader!hu", name = "o", descriptor = "Lloader!me;")
	private Class277 aClass277_1 = null;

	@OriginalMember(owner = "loader!hu", name = "z", descriptor = "Lloader!hh;")
	private Class274 aClass274_3 = null;

	@OriginalMember(owner = "loader!hu", name = "r", descriptor = "Lloader!hh;")
	private Class274 aClass274_2 = null;

	@OriginalMember(owner = "loader!hu", name = "t", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!hu", name = "k", descriptor = "Lloader!me;")
	private Class277 aClass277_3 = null;

	@OriginalMember(owner = "loader!hu", name = "q", descriptor = "I")
	private final int anInt7626;

	@OriginalMember(owner = "loader!hu", name = "s", descriptor = "Ljava/lang/String;")
	private final String aString79;

	@OriginalMember(owner = "loader!hu", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!hu", name = "v", descriptor = "[Lloader!me;")
	private Class277[] aClass277Array1;

	@OriginalMember(owner = "loader!hu", name = "e", descriptor = "Lloader!h;")
	private Class273 aClass273_1;

	@OriginalMember(owner = "loader!hu", name = "l", descriptor = "Lloader!e;")
	private Class272 aClass272_1;

	@OriginalMember(owner = "loader!hu", name = "d", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)Lloader!me;")
	private static Class277 method5931(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(35) String local35;
		if (arg0 == 33) {
			local35 = "jagex_" + arg1 + "_preferences" + arg2 + "_rc.dat";
		} else if (arg0 == 34) {
			local35 = "jagex_" + arg1 + "_preferences" + arg2 + "_wip.dat";
		} else {
			local35 = "jagex_" + arg1 + "_preferences" + arg2 + ".dat";
		}
		@Pc(102) String[] local102 = new String[] { "c:/rscache/", "/rscache/", aString82, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(104) int local104 = 0; local104 < local102.length; local104++) {
			@Pc(116) String local116 = local102[local104];
			if (local116.length() <= 0 || (new File(local116)).exists()) {
				try {
					return new Class277(new File(local116, local35), "rw", 10000L);
				} catch (@Pc(142) Exception local142) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(IBLjava/lang/String;Ljava/lang/String;)Ljava/io/File;")
	private static File method5935(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		@Pc(4) File local4 = (File) aHashtable4.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(44) String[] local44 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString82, "/tmp/", "" };
		@Pc(69) String[] local69 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(71) int local71 = 0; local71 < 2; local71++) {
			for (@Pc(78) int local78 = 0; local78 < local69.length; local78++) {
				for (@Pc(84) int local84 = 0; local84 < local44.length; local84++) {
					@Pc(122) String local122 = local44[local84] + local69[local78] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(124) RandomAccessFile local124 = null;
					try {
						@Pc(129) File local129 = new File(local122);
						if (local71 != 0 || local129.exists()) {
							@Pc(140) String local140 = local44[local84];
							if (local71 != 1 || local140.length() <= 0 || (new File(local140)).exists()) {
								(new File(local44[local84] + local69[local78])).mkdir();
								if (arg1 != null) {
									(new File(local44[local84] + local69[local78] + "/" + arg1)).mkdir();
								}
								local124 = new RandomAccessFile(local129, "rw");
								@Pc(202) int local202 = local124.read();
								local124.seek(0L);
								local124.write(local202);
								local124.seek(0L);
								local124.close();
								aHashtable4.put(arg2, local129);
								return local129;
							}
						}
					} catch (@Pc(221) Exception local221) {
						try {
							if (local124 != null) {
								local124.close();
							}
						} catch (@Pc(230) Exception local230) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!hu", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class275(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		aString76 = "1.1";
		aString77 = "Unknown";
		this.anInt7626 = arg1;
		this.anApplet2 = arg0;
		this.aString79 = arg2;
		try {
			aString77 = System.getProperty("java.vendor");
			aString76 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString78 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString78 = "Unknown";
		}
		aString75 = aString78.toLowerCase();
		try {
			aString80 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString80 = "";
		}
		try {
			aString81 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString81 = "";
		}
		try {
			aString82 = System.getProperty("user.home");
			if (aString82 != null) {
				aString82 = aString82 + "/";
			}
		} catch (@Pc(87) Exception local87) {
		}
		if (aString82 == null) {
			aString82 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(98) Throwable local98) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(154) Exception local154) {
		}
		this.aClass277_2 = new Class277(method5935(this.anInt7626, null, "random.dat"), "rw", 25L);
		this.aClass277_3 = new Class277(this.method5926("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass277_1 = new Class277(this.method5926("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass277Array1 = new Class277[arg3];
		for (@Pc(195) int local195 = 0; local195 < arg3; local195++) {
			this.aClass277Array1[local195] = new Class277(this.method5926("main_file_cache.idx" + local195), "rw", 1048576L);
		}
		try {
			this.aClass273_1 = new Class273();
		} catch (@Pc(231) Throwable local231) {
		}
		try {
			this.aClass272_1 = new Class272();
		} catch (@Pc(238) Throwable local238) {
		}
		@Pc(241) ThreadGroup local241 = Thread.currentThread().getThreadGroup();
		for (@Pc(244) ThreadGroup local244 = local241.getParent(); local244 != null; local244 = local244.getParent()) {
			local241 = local244;
		}
		@Pc(255) Thread[] local255 = new Thread[1000];
		local241.enumerate(local255);
		for (@Pc(261) int local261 = 0; local261 < local255.length; local261++) {
			if (local255[local261] != null && local255[local261].getName().startsWith("AWT")) {
				local255[local261].setPriority(1);
			}
		}
		this.aBoolean503 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ILjava/lang/Runnable;I)Lloader!hh;")
	private Class274 method5910(@OriginalArg(0) int arg0, @OriginalArg(1) Runnable arg1, @OriginalArg(2) int arg2) {
		if (arg2 != -10265) {
			aString81 = null;
		}
		return this.method5929(arg0, -12825, arg1, 2, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Lloader!hh;")
	private Class274 method5911(@OriginalArg(0) int arg0, @OriginalArg(1) Class arg1, @OriginalArg(2) String arg2) {
		if (arg0 != 15) {
			aString77 = null;
		}
		return this.method5929(0, -12825, new Object[] { arg1, arg2 }, 9, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "b", descriptor = "(Ljava/lang/String;I)[B")
	private byte[] method5912(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class274 local7 = this.method5922(arg1, 0, (byte) -36, 0, arg0);
		return (byte[]) local7.anObject11;
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ILjava/awt/Component;II)Lloader!hh;")
	private Class274 method5913(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 27730) {
			this.method5917(null, (byte) -65);
		}
		@Pc(11) Point local11 = arg1.getLocationOnScreen();
		return this.method5929(arg2 + local11.x, -12825, null, 14, arg3 + local11.y);
	}

	@OriginalMember(owner = "loader!hu", name = "b", descriptor = "(I)V")
	private void method5914(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean503 = true;
			this.notifyAll();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
		if (arg0 != 3584) {
			this.method5911(14, null, null);
		}
		if (this.aClass277_3 != null) {
			try {
				this.aClass277_3.method5948();
			} catch (@Pc(42) IOException local42) {
			}
		}
		if (this.aClass277_1 != null) {
			try {
				this.aClass277_1.method5948();
			} catch (@Pc(52) IOException local52) {
			}
		}
		if (this.aClass277Array1 != null) {
			for (@Pc(57) int local57 = 0; local57 < this.aClass277Array1.length; local57++) {
				if (this.aClass277Array1[local57] != null) {
					try {
						this.aClass277Array1[local57].method5948();
					} catch (@Pc(76) IOException local76) {
					}
				}
			}
		}
		if (this.aClass277_2 != null) {
			try {
				this.aClass277_2.method5948();
			} catch (@Pc(88) IOException local88) {
			}
		}
	}

	@OriginalMember(owner = "loader!hu", name = "c", descriptor = "(Ljava/lang/String;I)Lloader!hh;")
	private Class274 method5915(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 24678) {
			this.method5927(true, null);
		}
		return this.method5929(0, -12825, arg0, 16, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "c", descriptor = "(B)V")
	private void method5916() {
		aLong227 = Class276.method5940() + 5000L;
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!hh;")
	private Class274 method5917(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		return arg1 >= -54 ? (Class274) null : this.method5929(0, -12825, arg0, 19, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "([IILjava/awt/Point;Ljava/awt/Component;II)Lloader!hh;")
	private Class274 method5918(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Point arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return arg1 == 19865 ? this.method5929(arg5, -12825, new Object[] { arg3, arg0, arg2 }, 17, arg4) : (Class274) null;
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ILjava/net/URL;)Lloader!hh;")
	private Class274 method5919(@OriginalArg(0) int arg0, @OriginalArg(1) URL arg1) {
		if (arg0 != 0) {
			this.aClass274_3 = null;
		}
		return this.method5929(0, -12825, arg1, 4, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(IIIBI)Lloader!hh;")
	private Class274 method5920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		if (arg3 != -30) {
			this.method5929(-98, -6, null, -96, -44);
		}
		return this.method5929(arg2 + (arg1 << 16), -12825, null, 6, arg0 + (arg4 << 16));
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(II)Lloader!hh;")
	private Class274 method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 16) {
			aMethod4 = null;
		}
		return this.method5929(arg0, arg1 - 12841, null, 3, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(IIBILjava/lang/Object;)Lloader!hh;")
	private Class274 method5922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Object arg4) {
		@Pc(3) Class274 local3 = new Class274();
		synchronized (local3) {
			local3.anInt7624 = arg1;
			local3.anInt7625 = arg0;
			local3.anObject12 = arg4;
			local3.anInt7623 = arg3;
			synchronized (this) {
				if (this.aClass274_2 == null) {
					this.aClass274_2 = this.aClass274_3 = local3;
				} else {
					this.aClass274_2.aClass274_1 = local3;
					this.aClass274_2 = local3;
				}
				if (arg2 != -36) {
					this.method5918(null, -125, null, null, -16, 1);
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(70) InterruptedException local70) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!hu", name = "b", descriptor = "(Ljava/lang/Class;I)Lloader!hh;")
	private Class274 method5923(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			this.method5927(true, null);
		}
		return this.method5929(0, arg1 - 12825, arg0, 20, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(I)Lloader!hh;")
	private Class274 method5924(@OriginalArg(0) int arg0) {
		if (arg0 != 5) {
			aHashtable4 = null;
		}
		return this.method5929(0, arg0 ^ 0xFFFFCDE2, null, 5, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!hh;")
	private Class274 method5925(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		return arg1 == -31183 ? this.method5929(0, -12825, arg0, 11, 0) : (Class274) null;
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/io/File;")
	public File method5926(@OriginalArg(0) String arg0) {
		return method5935(this.anInt7626, this.aString79, arg0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ZLjava/awt/Frame;)Lloader!hh;")
	private Class274 method5927(@OriginalArg(0) boolean arg0, @OriginalArg(1) Frame arg1) {
		return arg0 ? (Class274) null : this.method5929(0, -12825, arg1, 7, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "b", descriptor = "(B)Lloader!gq;")
	private Interface14 method5928(@OriginalArg(0) byte arg0) {
		if (arg0 != -83) {
			this.method5937((byte) 65);
		}
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(IILjava/lang/Object;II)Lloader!hh;")
	private Class274 method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Object arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class274 local3 = new Class274();
		local3.anInt7625 = arg3;
		local3.anInt7624 = arg0;
		local3.anObject12 = arg2;
		local3.anInt7623 = arg4;
		synchronized (this) {
			if (arg1 != -12825) {
				this.method5927(true, null);
			}
			if (this.aClass274_2 == null) {
				this.aClass274_2 = this.aClass274_3 = local3;
			} else {
				this.aClass274_2.aClass274_1 = local3;
				this.aClass274_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!hu", name = "d", descriptor = "(Ljava/lang/String;I)Lloader!hh;")
	private Class274 method5930(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (arg1 > -90) {
			this.method5925(null, -60);
		}
		return this.method5929(0, -12825, arg0, 21, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "c", descriptor = "(I)Lloader!hh;")
	private Class274 method5932(@OriginalArg(0) int arg0) {
		if (arg0 != 1) {
			this.aClass273_1 = null;
		}
		return this.method5929(0, -12825, null, 18, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(ILjava/lang/String;I)Lloader!hh;")
	private Class274 method5933(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			aString80 = null;
		}
		return this.method5929(arg0, arg2 ^ 0xFFFFCDE7, arg1, 1, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class274 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean503) {
						return;
					}
					if (this.aClass274_3 != null) {
						local18 = this.aClass274_3;
						this.aClass274_3 = this.aClass274_3.aClass274_1;
						if (this.aClass274_3 == null) {
							this.aClass274_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local18.anInt7625;
				if (local47 == 1) {
					if (Class276.method5940() < aLong227) {
						throw new IOException();
					}
					local18.anObject11 = new Socket(InetAddress.getByName((String) local18.anObject12), local18.anInt7624);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local18.anObject12);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local18.anInt7624);
					local18.anObject11 = local62;
				} else if (local47 == 4) {
					if (Class276.method5940() < aLong227) {
						throw new IOException();
					}
					local18.anObject11 = new DataInputStream(((URL) local18.anObject12).openStream());
				} else {
					@Pc(93) Object[] local93;
					if (local47 == 8) {
						local93 = (Object[]) local18.anObject12;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject11 = ((Class) local93[0]).getDeclaredMethod((String) local93[1], (Class[]) local93[2]);
					} else if (local47 == 9) {
						local93 = (Object[]) local18.anObject12;
						if (((Class) local93[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject11 = ((Class) local93[0]).getDeclaredField((String) local93[1]);
					} else if (local47 == 18) {
						@Pc(121) Clipboard local121 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local18.anObject11 = local121.getContents(null);
					} else if (local47 == 19) {
						@Pc(134) Transferable local134 = (Transferable) local18.anObject12;
						@Pc(137) Clipboard local137 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local137.setContents(local134, null);
					} else {
						@Pc(198) String local198;
						if (local47 == 3) {
							if (Class276.method5940() < aLong227) {
								throw new IOException();
							}
							local198 = (local18.anInt7624 >> 24 & 0xFF) + "." + (local18.anInt7624 >> 16 & 0xFF) + "." + (local18.anInt7624 >> 8 & 0xFF) + "." + (local18.anInt7624 & 0xFF);
							local18.anObject11 = InetAddress.getByName(local198).getHostName();
						} else if (local47 == 21) {
							if (aLong227 > Class276.method5940()) {
								throw new IOException();
							}
							local18.anObject11 = InetAddress.getByName((String) local18.anObject12).getAddress();
						} else if (local47 == 5) {
							local18.anObject11 = this.aClass273_1.method5906();
						} else if (local47 == 6) {
							@Pc(591) Frame local591 = new Frame("Jagex Full Screen");
							local18.anObject11 = local591;
							local591.setResizable(false);
							this.aClass273_1.method5907(local591, local18.anInt7624 >>> 16, local18.anInt7624 & 0xFFFF, local18.anInt7623 & 0xFFFF, local18.anInt7623 >> 16);
						} else if (local47 == 7) {
							this.aClass273_1.method5908();
						} else {
							@Pc(438) int local438;
							if (local47 == 11) {
								@Pc(513) Field local513 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
								local513.setAccessible(true);
								@Pc(524) Vector local524 = (Vector) local513.get(((Class) local18.anObject12).getClassLoader());
								for (local438 = 0; local438 < local524.size(); local438++) {
									@Pc(538) Object local538 = local524.elementAt(local438);
									@Pc(545) Method local545 = local538.getClass().getDeclaredMethod("finalize");
									local545.setAccessible(true);
									local545.invoke(local538);
									local545.setAccessible(false);
									@Pc(562) Field local562 = local538.getClass().getDeclaredField("handle");
									local562.setAccessible(true);
									local562.set(local538, Integer.valueOf(0));
									local562.setAccessible(false);
								}
								local513.setAccessible(false);
							} else if (local47 == 12) {
								@Pc(265) Class277 local265 = method5931(this.anInt7626, this.aString79, (String) local18.anObject12);
								local18.anObject11 = local265;
							} else if (local47 == 14) {
								@Pc(277) int local277 = local18.anInt7624;
								@Pc(280) int local280 = local18.anInt7623;
								this.aClass272_1.method5891(local277, local280);
							} else if (local47 == 15) {
								@Pc(297) boolean local297 = local18.anInt7624 != 0;
								@Pc(301) Component local301 = (Component) local18.anObject12;
								this.aClass272_1.method5890(local301, local297);
							} else if (local47 == 17) {
								local93 = (Object[]) local18.anObject12;
								this.aClass272_1.method5889(local18.anInt7624, local18.anInt7623, (Component) local93[0], (Point) local93[2], (int[]) local93[1]);
							} else if (local47 == 16) {
								try {
									if (!aString75.startsWith("win")) {
										throw new Exception();
									}
									local198 = (String) local18.anObject12;
									if (!local198.startsWith("http://") && !local198.startsWith("https://")) {
										throw new Exception();
									}
									@Pc(436) String local436 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
									for (local438 = 0; local438 < local198.length(); local438++) {
										if (local436.indexOf(local198.charAt(local438)) == -1) {
											throw new Exception();
										}
									}
									Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local198 + "\"");
									local18.anObject11 = null;
								} catch (@Pc(476) Exception local476) {
									local18.anObject11 = local476;
									throw local476;
								}
							} else if (local47 == 20) {
								try {
									@Pc(332) Class[] local332 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
									@Pc(334) Runtime local334 = Runtime.getRuntime();
									@Pc(340) Method local340 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local332);
									local340.setAccessible(true);
									if (aString75.startsWith("win")) {
										if (aString80.startsWith("amd64") || aString80.startsWith("x86_64")) {
											local340.invoke(local334, local18.anObject12, this.method5926("jagmisc64.dll").toString());
										} else {
											local340.invoke(local334, local18.anObject12, this.method5926("jagmisc.dll").toString());
										}
									}
									local340.setAccessible(false);
								} catch (@Pc(400) Throwable local400) {
									local18.anObject11 = local400;
								}
							} else {
								throw new Exception("");
							}
						}
					}
				}
				local18.anInt7622 = 1;
			} catch (@Pc(696) ThreadDeath local696) {
				throw local696;
			} catch (@Pc(699) Throwable local699) {
				local18.anInt7622 = 2;
			}
			synchronized (local18) {
				local18.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(Ljava/lang/Class;Z)V")
	private void method5934(@OriginalArg(0) Class arg0, @OriginalArg(1) boolean arg1) throws Exception {
		@Pc(12) Class[] local12 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
		@Pc(14) Runtime local14 = Runtime.getRuntime();
		@Pc(25) Method local25 = Class.forName("java.lang.reflect.Method").getMethod("setAccessible", Boolean.TYPE);
		@Pc(36) Method local36;
		if (!aString75.startsWith("mac")) {
			local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local12);
			local25.invoke(local36, Boolean.TRUE);
			local36.invoke(local14, arg0, "jawt");
			local25.invoke(local36, Boolean.FALSE);
		}
		local36 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local12);
		if (arg1) {
			this.aClass277Array1 = null;
		}
		local25.invoke(local36, Boolean.TRUE);
		if (!aString75.startsWith("win")) {
			throw new Exception();
		}
		local36.invoke(local14, arg0, this.method5926("sw3d.dll").toString());
		local25.invoke(local36, Boolean.FALSE);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(Ljava/lang/String;B)Lloader!hh;")
	private Class274 method5936(@OriginalArg(0) String arg0) {
		return this.method5929(0, -12825, arg0, 12, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(B)Z")
	private boolean method5937(@OriginalArg(0) byte arg0) {
		if (arg0 < 120) {
			return true;
		} else {
			return this.aClass273_1 != null;
		}
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(B[Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;)Lloader!hh;")
	private Class274 method5938(@OriginalArg(0) byte arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class arg3) {
		if (arg0 > -2) {
			this.method5912(null, -62);
		}
		return this.method5929(0, -12825, new Object[] { arg3, arg2, arg1 }, 8, 0);
	}

	@OriginalMember(owner = "loader!hu", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lloader!hh;")
	private Class274 method5939(@OriginalArg(0) Component arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 != 0) {
			this.method5930(null, 15);
		}
		return this.method5929(arg1 ? 1 : 0, arg2 ^ 0xFFFFCDE7, arg0, 15, 0);
	}
}
