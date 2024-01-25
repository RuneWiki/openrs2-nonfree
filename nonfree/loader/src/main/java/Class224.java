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

@OriginalClass("loader!rd")
public final class Class224 implements Runnable {

	@OriginalMember(owner = "loader!rd", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!rd", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!rd", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!rd", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!rd", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString76;

	@OriginalMember(owner = "loader!rd", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString77;

	@OriginalMember(owner = "loader!rd", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!rd", name = "u", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!rd", name = "t", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!rd", name = "o", descriptor = "I")
	private static final int anInt6997 = 1;

	@OriginalMember(owner = "loader!rd", name = "w", descriptor = "Ljava/util/Hashtable;")
	private static final Hashtable aHashtable2 = new Hashtable(16);

	@OriginalMember(owner = "loader!rd", name = "v", descriptor = "J")
	private static volatile long aLong222 = 0L;

	@OriginalMember(owner = "loader!rd", name = "y", descriptor = "Lloader!mf;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "loader!rd", name = "s", descriptor = "Lloader!mi;")
	private Class223 aClass223_1 = null;

	@OriginalMember(owner = "loader!rd", name = "d", descriptor = "Lloader!ts;")
	private Class225 aClass225_1 = null;

	@OriginalMember(owner = "loader!rd", name = "m", descriptor = "Lloader!ts;")
	private Class225 aClass225_2 = null;

	@OriginalMember(owner = "loader!rd", name = "x", descriptor = "Z")
	private boolean aBoolean627 = false;

	@OriginalMember(owner = "loader!rd", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!rd", name = "l", descriptor = "Lloader!mi;")
	private Class223 aClass223_3 = null;

	@OriginalMember(owner = "loader!rd", name = "r", descriptor = "Lloader!mi;")
	private Class223 aClass223_2 = null;

	@OriginalMember(owner = "loader!rd", name = "A", descriptor = "I")
	private final int anInt6998;

	@OriginalMember(owner = "loader!rd", name = "q", descriptor = "Ljava/lang/String;")
	private String aString78;

	@OriginalMember(owner = "loader!rd", name = "k", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!rd", name = "i", descriptor = "[Lloader!mi;")
	private final Class223[] aClass223Array1;

	@OriginalMember(owner = "loader!rd", name = "z", descriptor = "Lloader!a;")
	private Class218 aClass218_1;

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "Lloader!f;")
	private Class222 aClass222_1;

	@OriginalMember(owner = "loader!rd", name = "e", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread4;

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/String;II)Lloader!mi;")
	private static Class223 method6052(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(29) String local29;
		if (arg1 == 33) {
			local29 = "jagex_" + arg0 + "_preferences2_rc.dat";
		} else if (arg1 == 34) {
			local29 = "jagex_" + arg0 + "_preferences2_wip.dat";
		} else {
			local29 = "jagex_" + arg0 + "_preferences2.dat";
		}
		@Pc(88) String[] local88 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			@Pc(102) String local102 = local88[local90];
			if (local102.length() <= 0 || (new File(local102)).exists()) {
				try {
					return new Class223(new File(local102, local29), "rw", 10000L);
				} catch (@Pc(128) Exception local128) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(ZILjava/lang/String;)Lloader!mi;")
	private static Class223 method6060(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) String local15;
		if (arg0 == 33) {
			local15 = "jagex_" + arg1 + "_preferences_rc.dat";
		} else if (arg0 == 34) {
			local15 = "jagex_" + arg1 + "_preferences_wip.dat";
		} else {
			local15 = "jagex_" + arg1 + "_preferences.dat";
		}
		@Pc(79) String[] local79 = new String[] { "c:/rscache/", "/rscache/", aString74, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", "" };
		for (@Pc(81) int local81 = 0; local81 < local79.length; local81++) {
			@Pc(89) String local89 = local79[local81];
			if (local89.length() <= 0 || (new File(local89)).exists()) {
				try {
					return new Class223(new File(local89, local15), "rw", 10000L);
				} catch (@Pc(114) Exception local114) {
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;B)Ljava/io/File;")
	private static File method6067(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(4) File local4 = (File) aHashtable2.get(arg2);
		if (local4 != null) {
			return local4;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString74, "/tmp/", "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(77) int local77 = 0; local77 < local70.length; local77++) {
				for (@Pc(83) int local83 = 0; local83 < local45.length; local83++) {
					@Pc(117) String local117 = local45[local83] + local70[local77] + "/" + (arg1 == null ? "" : arg1 + "/") + arg2;
					@Pc(119) RandomAccessFile local119 = null;
					try {
						@Pc(124) File local124 = new File(local117);
						if (local72 != 0 || local124.exists()) {
							@Pc(138) String local138 = local45[local83];
							if (local72 != 1 || local138.length() <= 0 || (new File(local138)).exists()) {
								(new File(local45[local83] + local70[local77])).mkdir();
								if (arg1 != null) {
									(new File(local45[local83] + local70[local77] + "/" + arg1)).mkdir();
								}
								local119 = new RandomAccessFile(local124, "rw");
								@Pc(203) int local203 = local119.read();
								local119.seek(0L);
								local119.write(local203);
								local119.seek(0L);
								local119.close();
								aHashtable2.put(arg2, local124);
								return local124;
							}
						}
					} catch (@Pc(222) Exception local222) {
						try {
							if (local119 != null) {
								local119.close();
							}
						} catch (@Pc(230) Exception local230) {
						}
					}
				}
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!rd", name = "<init>", descriptor = "(Ljava/applet/Applet;ILjava/lang/String;I)V")
	public Class224(@OriginalArg(0) Applet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) throws Exception {
		this.anInt6998 = arg1;
		aString77 = "Unknown";
		this.aString78 = arg2;
		this.anApplet3 = arg0;
		aString76 = "1.1";
		try {
			aString77 = System.getProperty("java.vendor");
			aString76 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString73 = System.getProperty("os.name");
		} catch (@Pc(48) Exception local48) {
			aString73 = "Unknown";
		}
		aString75 = aString73.toLowerCase();
		try {
			aString79 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(59) Exception local59) {
			aString79 = "";
		}
		try {
			aString72 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(67) Exception local67) {
			aString72 = "";
		}
		try {
			aString74 = System.getProperty("user.home");
			if (aString74 != null) {
				aString74 = aString74 + "/";
			}
		} catch (@Pc(85) Exception local85) {
		}
		if (aString74 == null) {
			aString74 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(95) Throwable local95) {
		}
		try {
			if (arg0 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg0.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(123) Exception local123) {
		}
		try {
			if (arg0 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg0.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(151) Exception local151) {
		}
		this.aClass223_2 = new Class223(method6067(this.anInt6998, null, "random.dat"), "rw", 25L);
		this.aClass223_3 = new Class223(this.method6073("main_file_cache.dat2"), "rw", 209715200L);
		this.aClass223_1 = new Class223(this.method6073("main_file_cache.idx255"), "rw", 1048576L);
		this.aClass223Array1 = new Class223[arg3];
		for (@Pc(192) int local192 = 0; local192 < arg3; local192++) {
			this.aClass223Array1[local192] = new Class223(this.method6073("main_file_cache.idx" + local192), "rw", 1048576L);
		}
		try {
			this.aClass218_1 = new Class218();
		} catch (@Pc(224) Throwable local224) {
		}
		try {
			this.aClass222_1 = new Class222();
		} catch (@Pc(231) Throwable local231) {
		}
		@Pc(234) ThreadGroup local234 = Thread.currentThread().getThreadGroup();
		for (@Pc(237) ThreadGroup local237 = local234.getParent(); local237 != null; local237 = local237.getParent()) {
			local234 = local237;
		}
		@Pc(248) Thread[] local248 = new Thread[1000];
		local234.enumerate(local248);
		for (@Pc(254) int local254 = 0; local254 < local248.length; local254++) {
			if (local248[local254] != null && local248[local254].getName().startsWith("AWT")) {
				local248[local254].setPriority(1);
			}
		}
		this.aBoolean627 = false;
		this.aThread4 = new Thread(this);
		this.aThread4.setPriority(10);
		this.aThread4.setDaemon(true);
		this.aThread4.start();
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(ILjava/lang/Object;III)Lloader!ts;")
	private Class225 method6043(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		local3.anInt7002 = arg4;
		local3.anInt6999 = arg3;
		local3.anInt7000 = arg2;
		local3.anObject8 = arg1;
		synchronized (this) {
			if (this.aClass225_2 == null) {
				this.aClass225_2 = this.aClass225_1 = local3;
			} else {
				this.aClass225_2.aClass225_3 = local3;
				this.aClass225_2 = local3;
			}
			this.notify();
			return local3;
		}
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/Object;IIII)Lloader!ts;")
	private Class225 method6044(@OriginalArg(0) Object arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class225 local3 = new Class225();
		synchronized (local3) {
			local3.anObject8 = arg0;
			local3.anInt7002 = arg1;
			local3.anInt6999 = arg4;
			if (arg3 != 30501) {
				return (Class225) null;
			}
			local3.anInt7000 = arg2;
			synchronized (this) {
				if (this.aClass225_2 == null) {
					this.aClass225_2 = this.aClass225_1 = local3;
				} else {
					this.aClass225_2.aClass225_3 = local3;
					this.aClass225_2 = local3;
				}
				this.notify();
			}
			try {
				local3.wait();
			} catch (@Pc(63) InterruptedException local63) {
			}
			return local3;
		}
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(B)Lloader!ts;")
	private Class225 method6045(@OriginalArg(0) byte arg0) {
		return arg0 > -2 ? (Class225) null : this.method6043(117, null, 12, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/Class;I)Lloader!ts;")
	private Class225 method6046(@OriginalArg(0) Class arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= -89) {
			aMethod4 = null;
		}
		return this.method6043(-98, arg0, 20, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/awt/datatransfer/Transferable;B)Lloader!ts;")
	private Class225 method6047(@OriginalArg(0) Transferable arg0, @OriginalArg(1) byte arg1) {
		if (arg1 < 33) {
			this.method6074(113, false, null);
		}
		return this.method6043(0, arg0, 19, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(IIBII)Lloader!ts;")
	private Class225 method6048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 <= 16) {
			this.aString78 = null;
		}
		return this.method6043(-117, null, 6, (arg3 << 16) + arg1, arg4 + (arg0 << 16));
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/net/URL;B)Lloader!ts;")
	private Class225 method6049(@OriginalArg(0) URL arg0) {
		return this.method6043(-45, arg0, 4, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "b", descriptor = "(B)Lloader!ts;")
	private Class225 method6050() {
		return this.method6043(122, null, 5, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/Runnable;IB)Lloader!ts;")
	private Class225 method6051(@OriginalArg(0) Runnable arg0, @OriginalArg(1) int arg1) {
		return this.method6043(119, arg0, 2, 0, arg1);
	}

	@OriginalMember(owner = "loader!rd", name = "b", descriptor = "(I)V")
	private void method6053(@OriginalArg(0) int arg0) {
		synchronized (this) {
			this.aBoolean627 = true;
			this.notifyAll();
		}
		try {
			if (arg0 >= -97) {
				aLong222 = -4L;
			}
			this.aThread4.join();
		} catch (@Pc(26) InterruptedException local26) {
		}
		if (this.aClass223_3 != null) {
			try {
				this.aClass223_3.method6041();
			} catch (@Pc(36) IOException local36) {
			}
		}
		if (this.aClass223_1 != null) {
			try {
				this.aClass223_1.method6041();
			} catch (@Pc(46) IOException local46) {
			}
		}
		if (this.aClass223Array1 != null) {
			for (@Pc(53) int local53 = 0; local53 < this.aClass223Array1.length; local53++) {
				if (this.aClass223Array1[local53] != null) {
					try {
						this.aClass223Array1[local53].method6041();
					} catch (@Pc(72) IOException local72) {
					}
				}
			}
		}
		if (this.aClass223_2 != null) {
			try {
				this.aClass223_2.method6041();
			} catch (@Pc(84) IOException local84) {
			}
		}
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Z)Lloader!ts;")
	private Class225 method6054(@OriginalArg(0) boolean arg0) {
		if (!arg0) {
			this.method6074(120, true, null);
		}
		return this.method6043(-47, null, 13, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "d", descriptor = "(I)Z")
	private boolean method6055(@OriginalArg(0) int arg0) {
		if (arg0 != 21) {
			this.anApplet3 = null;
		}
		return this.aClass218_1 != null;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/Class;Ljava/lang/Class;Z)Lloader!ts;")
	private Class225 method6056(@OriginalArg(0) String arg0, @OriginalArg(1) Class[] arg1, @OriginalArg(2) Class arg2, @OriginalArg(3) boolean arg3) {
		return arg3 ? this.method6043(123, new Object[] { arg2, arg0, arg1 }, 8, 0, 0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(BLjava/lang/String;)Lloader!ts;")
	private Class225 method6057(@OriginalArg(0) byte arg0, @OriginalArg(1) String arg1) {
		if (arg0 != -112) {
			this.method6064(null, (byte) 116);
		}
		return this.method6043(arg0 + 84, arg1, 21, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "([ILjava/awt/Point;ILjava/awt/Component;II)Lloader!ts;")
	private Class225 method6058(@OriginalArg(0) int[] arg0, @OriginalArg(1) Point arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3, @OriginalArg(4) int arg4) {
		return this.method6043(-31, new Object[] { arg3, arg0, arg1 }, 17, arg2, arg4);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(ILjava/lang/String;)Lloader!ts;")
	private Class225 method6059(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		return arg0 == 16 ? this.method6043(120, arg1, 16, 0, 0) : (Class225) null;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(ILjava/awt/Frame;)Lloader!ts;")
	private Class225 method6061(@OriginalArg(1) Frame arg0) {
		return this.method6043(-109, arg0, 7, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "b", descriptor = "(Z)V")
	private void method6062(@OriginalArg(0) boolean arg0) {
		aLong222 = Class220.method6013() + 5000L;
		if (arg0) {
			this.aClass222_1 = null;
		}
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(II)Lloader!ts;")
	private Class225 method6063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 8859 ? this.method6043(-7, null, 3, 0, arg1) : (Class225) null;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/Class;B)Lloader!ts;")
	private Class225 method6064(@OriginalArg(0) Class arg0, @OriginalArg(1) byte arg1) {
		if (arg1 >= -18) {
			this.method6050();
		}
		return this.method6043(-58, arg0, 11, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(IIILjava/awt/Component;)Lloader!ts;")
	private Class225 method6065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		@Pc(2) Point local2 = arg3.getLocationOnScreen();
		if (arg1 > -81) {
			this.method6074(-73, false, null);
		}
		return this.method6043(121, null, 14, arg0 + local2.y, local2.x + arg2);
	}

	@OriginalMember(owner = "loader!rd", name = "c", descriptor = "(I)Lloader!mf;")
	private Interface11 method6066(@OriginalArg(0) int arg0) {
		if (arg0 >= -43) {
			aString73 = null;
		}
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "loader!rd", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class225 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean627) {
						return;
					}
					if (this.aClass225_1 != null) {
						local16 = this.aClass225_1;
						this.aClass225_1 = this.aClass225_1.aClass225_3;
						if (this.aClass225_1 == null) {
							this.aClass225_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt7000;
				if (local45 == 1) {
					if (aLong222 > Class220.method6013()) {
						throw new IOException();
					}
					local16.anObject9 = new Socket(InetAddress.getByName((String) local16.anObject8), local16.anInt7002);
				} else if (local45 == 2) {
					@Pc(86) Thread local86 = new Thread((Runnable) local16.anObject8);
					local86.setDaemon(true);
					local86.start();
					local86.setPriority(local16.anInt7002);
					local16.anObject9 = local86;
				} else if (local45 == 4) {
					if (aLong222 > Class220.method6013()) {
						throw new IOException();
					}
					local16.anObject9 = new DataInputStream(((URL) local16.anObject8).openStream());
				} else {
					@Pc(135) Object[] local135;
					if (local45 == 8) {
						local135 = (Object[]) local16.anObject8;
						if (((Class) local135[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local135[0]).getDeclaredMethod((String) local135[1], (Class[]) local135[2]);
					} else if (local45 == 9) {
						local135 = (Object[]) local16.anObject8;
						if (((Class) local135[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject9 = ((Class) local135[0]).getDeclaredField((String) local135[1]);
					} else if (local45 == 18) {
						@Pc(893) Clipboard local893 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local16.anObject9 = local893.getContents(null);
					} else if (local45 == 19) {
						@Pc(882) Transferable local882 = (Transferable) local16.anObject8;
						@Pc(885) Clipboard local885 = Toolkit.getDefaultToolkit().getSystemClipboard();
						local885.setContents(local882, null);
					} else {
						@Pc(259) String local259;
						if (local45 == 3) {
							if (aLong222 > Class220.method6013()) {
								throw new IOException();
							}
							local259 = (local16.anInt7002 >> 24 & 0xFF) + "." + (local16.anInt7002 >> 16 & 0xFF) + "." + (local16.anInt7002 >> 8 & 0xFF) + "." + (local16.anInt7002 & 0xFF);
							local16.anObject9 = InetAddress.getByName(local259).getHostName();
						} else if (local45 == 21) {
							if (aLong222 > Class220.method6013()) {
								throw new IOException();
							}
							local16.anObject9 = InetAddress.getByName((String) local16.anObject8).getAddress();
						} else if (local45 == 5) {
							local16.anObject9 = this.aClass218_1.method6008();
						} else if (local45 == 6) {
							@Pc(288) Frame local288 = new Frame("Jagex Full Screen");
							local16.anObject9 = local288;
							local288.setResizable(false);
							this.aClass218_1.method6009(local16.anInt6999 >> 16, local16.anInt6999 & 0xFFFF, local16.anInt7002 >>> 16, local288, local16.anInt7002 & 0xFFFF);
						} else if (local45 == 7) {
							this.aClass218_1.method6010();
						} else {
							@Pc(504) Method local504;
							@Pc(496) Class[] local496;
							@Pc(498) Runtime local498;
							if (local45 == 10) {
								local496 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
								local498 = Runtime.getRuntime();
								if (!aString75.startsWith("mac")) {
									local504 = Class.forName("java.lang.Runtime").getDeclaredMethod("loadLibrary0", local496);
									local504.setAccessible(true);
									local504.invoke(local498, local16.anObject8, "jawt");
									local504.setAccessible(false);
								}
								local504 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local496);
								local504.setAccessible(true);
								if (aString75.startsWith("linux") || aString75.startsWith("sunos")) {
									local504.invoke(local498, local16.anObject8, this.method6073("libjaggl_dri.so").toString());
									@Pc(813) Class local813 = ((Class) local16.anObject8).getClassLoader().loadClass("jaggl.X11.dri");
									local813.getMethod("bind").invoke(null);
									local504.invoke(local498, local16.anObject8, this.method6073("libjaggl.so").toString());
									local813.getMethod("close").invoke(null);
								} else if (aString75.startsWith("mac")) {
									local504.invoke(local498, local16.anObject8, this.method6073("libjaggl.jnilib").toString());
								} else if (aString75.startsWith("win")) {
									local504.invoke(local498, local16.anObject8, this.method6073("jaggl.dll").toString());
								} else {
									throw new Exception();
								}
								local504.setAccessible(false);
							} else {
								@Pc(350) int local350;
								if (local45 == 11) {
									@Pc(337) Field local337 = Class.forName("java.lang.ClassLoader").getDeclaredField("nativeLibraries");
									local337.setAccessible(true);
									@Pc(348) Vector local348 = (Vector) local337.get(((Class) local16.anObject8).getClassLoader());
									for (local350 = 0; local350 < local348.size(); local350++) {
										@Pc(362) Object local362 = local348.elementAt(local350);
										@Pc(369) Method local369 = local362.getClass().getDeclaredMethod("finalize");
										local369.setAccessible(true);
										local369.invoke(local362);
										local369.setAccessible(false);
										@Pc(386) Field local386 = local362.getClass().getDeclaredField("handle");
										local386.setAccessible(true);
										local386.set(local362, Integer.valueOf(0));
										local386.setAccessible(false);
									}
									local337.setAccessible(false);
								} else {
									@Pc(657) Class223 local657;
									if (local45 == 12) {
										local657 = method6060(this.anInt6998, this.aString78);
										local16.anObject9 = local657;
									} else if (local45 == 13) {
										local657 = method6052(this.aString78, this.anInt6998);
										local16.anObject9 = local657;
									} else if (local45 == 14) {
										@Pc(640) int local640 = local16.anInt7002;
										@Pc(643) int local643 = local16.anInt6999;
										this.aClass222_1.method6015(local640, local643);
									} else if (local45 == 15) {
										@Pc(427) boolean local427 = local16.anInt7002 != 0;
										@Pc(431) Component local431 = (Component) local16.anObject8;
										this.aClass222_1.method6014(local431, local427);
									} else if (local45 == 17) {
										local135 = (Object[]) local16.anObject8;
										this.aClass222_1.method6016((Component) local135[0], (Point) local135[2], (int[]) local135[1], local16.anInt6999, local16.anInt7002);
									} else if (local45 == 16) {
										try {
											if (!aString75.startsWith("win")) {
												throw new Exception();
											}
											local259 = (String) local16.anObject8;
											if (!local259.startsWith("http://") && !local259.startsWith("https://")) {
												throw new Exception();
											}
											@Pc(595) String local595 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
											for (local350 = 0; local259.length() > local350; local350++) {
												if (local595.indexOf(local259.charAt(local350)) == -1) {
													throw new Exception();
												}
											}
											Runtime.getRuntime().exec("cmd /c start \"j\" \"" + local259 + "\"");
											local16.anObject9 = null;
										} catch (@Pc(633) Exception local633) {
											local16.anObject9 = local633;
										}
									} else if (local45 == 20) {
										try {
											local496 = new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") };
											local498 = Runtime.getRuntime();
											local504 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0", local496);
											local504.setAccessible(true);
											if (aString75.startsWith("win")) {
												if (aString79.startsWith("amd64") || aString79.startsWith("x86_64")) {
													local504.invoke(local498, local16.anObject8, this.method6073("jagmisc64.dll").toString());
												} else {
													local504.invoke(local498, local16.anObject8, this.method6073("jagmisc.dll").toString());
												}
											}
											local504.setAccessible(false);
										} catch (@Pc(563) Throwable local563) {
											local16.anObject9 = local563;
										}
									} else {
										throw new Exception("");
									}
								}
							}
						}
					}
				}
				local16.anInt7001 = 1;
			} catch (@Pc(903) ThreadDeath local903) {
				throw local903;
			} catch (@Pc(906) Throwable local906) {
				local16.anInt7001 = 2;
			}
			synchronized (local16) {
				local16.notify();
			}
		}
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Class;)Lloader!ts;")
	private Class225 method6068(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Class arg2) {
		if (arg1 != 124) {
			aString76 = null;
		}
		return this.method6043(arg1 ^ 0x7D, new Object[] { arg2, arg0 }, 9, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	private byte[] method6069(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class225 local9 = this.method6044(arg0, 0, 21, arg1 + 30581, 0);
		if (arg1 != -80) {
			aMethod3 = null;
		}
		return (byte[]) local9.anObject9;
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(I)Lloader!ts;")
	private Class225 method6070(@OriginalArg(0) int arg0) {
		if (arg0 != -24216) {
			this.method6063(-86, -101);
		}
		return this.method6043(arg0 + 24335, null, 18, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(Ljava/lang/String;BI)Lloader!ts;")
	private Class225 method6071(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		return arg1 > -76 ? (Class225) null : this.method6043(127, arg0, 1, 0, arg2);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(ZLjava/lang/Class;)Lloader!ts;")
	private Class225 method6072(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class arg1) {
		if (arg0) {
			aString74 = null;
		}
		return this.method6043(118, arg1, 10, 0, 0);
	}

	@OriginalMember(owner = "loader!rd", name = "b", descriptor = "(ILjava/lang/String;)Ljava/io/File;")
	public File method6073(@OriginalArg(1) String arg0) {
		return method6067(this.anInt6998, this.aString78, arg0);
	}

	@OriginalMember(owner = "loader!rd", name = "a", descriptor = "(IZLjava/awt/Component;)Lloader!ts;")
	private Class225 method6074(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Component arg2) {
		return arg0 == -4496 ? this.method6043(122, arg2, 15, 0, arg1 ? 1 : 0) : (Class225) null;
	}
}
