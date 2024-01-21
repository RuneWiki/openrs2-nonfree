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

@OriginalClass("loader!hf")
public final class Class108 implements Runnable {

	@OriginalMember(owner = "loader!hf", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!hf", name = "g", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!hf", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!hf", name = "n", descriptor = "Ljava/lang/String;")
	private static String aString10;

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!hf", name = "l", descriptor = "I")
	private static final int anInt4560 = 1;

	@OriginalMember(owner = "loader!hf", name = "m", descriptor = "[Lloader!ri;")
	private Class110[] aClass110Array1;

	@OriginalMember(owner = "loader!hf", name = "f", descriptor = "Lloader!cf;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!hf", name = "b", descriptor = "Lloader!ri;")
	private Class110 aClass110_1 = null;

	@OriginalMember(owner = "loader!hf", name = "s", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!hf", name = "c", descriptor = "Z")
	private boolean aBoolean196 = false;

	@OriginalMember(owner = "loader!hf", name = "j", descriptor = "Ljava/io/File;")
	public File aFile4 = null;

	@OriginalMember(owner = "loader!hf", name = "k", descriptor = "Lloader!la;")
	private Class109 aClass109_2 = null;

	@OriginalMember(owner = "loader!hf", name = "p", descriptor = "Lloader!ri;")
	private Class110 aClass110_2 = null;

	@OriginalMember(owner = "loader!hf", name = "e", descriptor = "Lloader!la;")
	private Class109 aClass109_1 = null;

	@OriginalMember(owner = "loader!hf", name = "q", descriptor = "Lloader!ri;")
	private Class110 aClass110_3 = null;

	@OriginalMember(owner = "loader!hf", name = "h", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!hf", name = "o", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!hf", name = "i", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!hf", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class108(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString9 = "1.1";
		aString8 = "Unknown";
		this.anApplet2 = arg1;
		try {
			aString8 = System.getProperty("java.vendor");
			aString9 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString10 = System.getProperty("user.home");
			if (aString10 != null) {
				aString10 = aString10 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString10 == null) {
			aString10 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method3217(arg3, arg2, arg4);
		this.aBoolean196 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!hf", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method3217(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 32 || arg1 > 34) {
			arg1 = 32;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString10, "/tmp/", "" };
		@Pc(77) String[] local77 = new String[] { ".jagex_cache_" + arg1, ".file_store_" + arg1 };
		for (@Pc(79) int local79 = 0; local79 < 2; local79++) {
			for (@Pc(86) int local86 = 0; local86 < local77.length; local86++) {
				for (@Pc(92) int local92 = 0; local92 < local45.length; local92++) {
					try {
						@Pc(104) String local104 = local45[local92];
						if (local104.length() > 0 && !(new File(local104)).exists()) {
							continue;
						}
						@Pc(129) File local129 = new File(local104 + local77[local86]);
						@Pc(139) boolean local139;
						if (local79 == 1 && !local129.exists()) {
							local139 = local129.mkdir();
							if (!local139) {
								continue;
							}
						}
						@Pc(153) File local153;
						if (this.aClass110_3 == null) {
							try {
								local153 = new File(local129, "random.dat");
								if (local79 == 1 || local153.exists()) {
									this.aClass110_3 = new Class110(local153, "rw", 25L);
								}
							} catch (@Pc(169) Exception local169) {
								this.aClass110_3 = null;
							}
						}
						if (this.aFile5 == null) {
							@Pc(225) int local225;
							try {
								local129 = new File(local129, arg0);
								if (local79 == 1 && !local129.exists()) {
									local139 = local129.mkdir();
									if (!local139) {
										continue;
									}
								}
								local153 = new File(local129, "main_file_cache.dat2");
								if (local79 == 0 && !local153.exists()) {
									continue;
								}
								this.aClass110_1 = new Class110(local153, "rw", 104857600L);
								this.aClass110Array1 = new Class110[24];
								for (local225 = 0; local225 < 24; local225++) {
									this.aClass110Array1[local225] = new Class110(new File(local129, "main_file_cache.idx" + local225), "rw", 1048576L);
								}
								this.aClass110_2 = new Class110(new File(local129, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile4 = this.aFile5 = local129;
							} catch (@Pc(271) Exception local271) {
								try {
									this.aClass110_1.method3237();
									for (local225 = 0; local225 < 24; local225++) {
										this.aClass110Array1[local225].method3237();
									}
									this.aClass110_2.method3237();
								} catch (@Pc(294) Exception local294) {
								}
								this.aFile4 = this.aFile5 = null;
								this.aClass110_1 = this.aClass110_2 = null;
								this.aClass110Array1 = null;
							}
						}
					} catch (@Pc(311) Exception local311) {
					}
					if (this.aClass110_3 != null && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!hf", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class109 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean196) {
						return;
					}
					if (this.aClass109_2 != null) {
						local16 = this.aClass109_2;
						this.aClass109_2 = this.aClass109_2.aClass109_3;
						if (this.aClass109_2 == null) {
							this.aClass109_1 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt4563;
				if (local46 == 1) {
					local16.anObject5 = new Socket(InetAddress.getByName((String) local16.anObject6), local16.anInt4562);
				} else if (local46 == 2) {
					@Pc(63) Thread local63 = new Thread((Runnable) local16.anObject6);
					local63.setDaemon(true);
					local63.start();
					local63.setPriority(local16.anInt4562);
					local16.anObject5 = local63;
				} else if (local46 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(144) Object[] local144;
					if (local46 == 8) {
						local144 = (Object[]) local16.anObject6;
						if (((Class) local144[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local144[0]).getDeclaredMethod((String) local144[1], (Class[]) local144[2]);
					} else if (local46 == 9) {
						local144 = (Object[]) local16.anObject6;
						if (((Class) local144[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local144[0]).getDeclaredField((String) local144[1]);
					} else if (local46 == 3) {
						@Pc(129) String local129 = (local16.anInt4562 >> 24 & 0xFF) + "." + (local16.anInt4562 >> 16 & 0xFF) + "." + (local16.anInt4562 >> 8 & 0xFF) + "." + (local16.anInt4562 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local129).getHostName();
					} else {
						throw new Exception();
					}
				}
				local16.anInt4561 = 1;
			} catch (@Pc(225) ThreadDeath local225) {
				throw local225;
			} catch (@Pc(228) Throwable local228) {
				local16.anInt4561 = 2;
			}
		}
	}
}
