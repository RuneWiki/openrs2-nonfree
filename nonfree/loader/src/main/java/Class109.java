import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!bi")
public final class Class109 implements Runnable {

	@OriginalMember(owner = "loader!bi", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!bi", name = "c", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!bi", name = "p", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!bi", name = "o", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!bi", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "loader!bi", name = "j", descriptor = "I")
	private static final int anInt4228 = 1;

	@OriginalMember(owner = "loader!bi", name = "g", descriptor = "Lloader!qd;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!bi", name = "k", descriptor = "[Lloader!md;")
	private Class112[] aClass112Array1;

	@OriginalMember(owner = "loader!bi", name = "b", descriptor = "Lloader!md;")
	private Class112 aClass112_2 = null;

	@OriginalMember(owner = "loader!bi", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!bi", name = "a", descriptor = "Lloader!mb;")
	private Class111 aClass111_2 = null;

	@OriginalMember(owner = "loader!bi", name = "e", descriptor = "Lloader!mb;")
	private Class111 aClass111_1 = null;

	@OriginalMember(owner = "loader!bi", name = "l", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "loader!bi", name = "q", descriptor = "Lloader!md;")
	private Class112 aClass112_3 = null;

	@OriginalMember(owner = "loader!bi", name = "n", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!bi", name = "f", descriptor = "Lloader!md;")
	private Class112 aClass112_1 = null;

	@OriginalMember(owner = "loader!bi", name = "s", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!bi", name = "i", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!bi", name = "m", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!bi", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class109(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString10 = "Unknown";
		this.anApplet2 = arg1;
		aString8 = "1.1";
		try {
			aString10 = System.getProperty("java.vendor");
			aString8 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(72) Throwable local72) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(99) Exception local99) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(127) Exception local127) {
		}
		this.method3220(arg4, arg3, arg2);
		this.aBoolean192 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!bi", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3220(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(84) int local84 = 0; local84 < local77.length; local84++) {
				for (@Pc(90) int local90 = 0; local90 < local34.length; local90++) {
					try {
						@Pc(98) String local98 = local34[local90];
						if (local98.length() > 0 && !(new File(local98)).exists()) {
							continue;
						}
						@Pc(125) File local125 = new File(local98 + local77[local84]);
						@Pc(136) boolean local136;
						if (local79 == 1 && !local125.exists()) {
							local136 = local125.mkdir();
							if (!local136) {
								continue;
							}
						}
						@Pc(148) File local148;
						if (this.aClass112_2 == null) {
							try {
								local148 = new File(local125, "random.dat");
								if (local79 == 1 || local148.exists()) {
									this.aClass112_2 = new Class112(local148, "rw", 25L);
								}
							} catch (@Pc(164) Exception local164) {
								this.aClass112_2 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(222) int local222;
							try {
								local125 = new File(local125, arg1);
								if (local79 == 1 && !local125.exists()) {
									local136 = local125.mkdir();
									if (!local136) {
										continue;
									}
								}
								local148 = new File(local125, "main_file_cache.dat2");
								if (local79 == 0 && !local148.exists()) {
									continue;
								}
								this.aClass112_1 = new Class112(local148, "rw", 104857600L);
								this.aClass112Array1 = new Class112[26];
								for (local222 = 0; local222 < 26; local222++) {
									this.aClass112Array1[local222] = new Class112(new File(local125, "main_file_cache.idx" + local222), "rw", 1048576L);
								}
								this.aClass112_3 = new Class112(new File(local125, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local125;
							} catch (@Pc(272) Exception local272) {
								try {
									this.aClass112_1.method3237();
									for (local222 = 0; local222 < 26; local222++) {
										this.aClass112Array1[local222].method3237();
									}
									this.aClass112_3.method3237();
								} catch (@Pc(295) Exception local295) {
								}
								this.aClass112Array1 = null;
								this.aFile4 = this.aFile5 = null;
								this.aClass112_1 = this.aClass112_3 = null;
							}
						}
					} catch (@Pc(312) Exception local312) {
					}
					if (this.aClass112_2 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!bi", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class111 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean192) {
						return;
					}
					if (this.aClass111_1 != null) {
						local18 = this.aClass111_1;
						this.aClass111_1 = this.aClass111_1.aClass111_3;
						if (this.aClass111_1 == null) {
							this.aClass111_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(36) InterruptedException local36) {
					}
				}
			}
			try {
				@Pc(48) int local48 = local18.anInt4232;
				if (local48 == 1) {
					local18.anObject6 = new Socket(InetAddress.getByName((String) local18.anObject5), local18.anInt4233);
				} else if (local48 == 2) {
					@Pc(209) Thread local209 = new Thread((Runnable) local18.anObject5);
					local209.setDaemon(true);
					local209.start();
					local209.setPriority(local18.anInt4233);
					local18.anObject6 = local209;
				} else if (local48 == 4) {
					local18.anObject6 = new DataInputStream(((URL) local18.anObject5).openStream());
				} else {
					@Pc(79) Object[] local79;
					if (local48 == 8) {
						local79 = (Object[]) local18.anObject5;
						if (((Class) local79[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject6 = ((Class) local79[0]).getDeclaredMethod((String) local79[1], (Class[]) local79[2]);
					} else if (local48 == 9) {
						local79 = (Object[]) local18.anObject5;
						if (((Class) local79[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject6 = ((Class) local79[0]).getDeclaredField((String) local79[1]);
					} else if (local48 == 3) {
						@Pc(182) String local182 = (local18.anInt4233 >> 24 & 0xFF) + "." + (local18.anInt4233 >> 16 & 0xFF) + "." + (local18.anInt4233 >> 8 & 0xFF) + "." + (local18.anInt4233 & 0xFF);
						local18.anObject6 = InetAddress.getByName(local182).getHostName();
					} else {
						throw new Exception();
					}
				}
				local18.anInt4231 = 1;
			} catch (@Pc(226) ThreadDeath local226) {
				throw local226;
			} catch (@Pc(229) Throwable local229) {
				local18.anInt4231 = 2;
			}
		}
	}
}
