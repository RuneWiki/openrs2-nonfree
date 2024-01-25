import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!a")
public final class Class221 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "()V")
	public Class221() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(31) GraphicsDevice local31 = local15[local19];
				if (local31 != null && local31.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local31;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5839(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local1 = true;
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(28) Throwable local28) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(Z)V")
	public void method5840() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5839(null);
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(ILjava/awt/Frame;IIBI)V")
	public void method5841(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5839(arg1);
		if (arg2 == 0) {
			@Pc(42) int local42 = this.aDisplayMode1.getRefreshRate();
			@Pc(46) DisplayMode[] local46 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(48) boolean local48 = false;
			for (@Pc(50) int local50 = 0; local50 < local46.length; local50++) {
				if (local46[local50].getWidth() == arg0 && arg3 == local46[local50].getHeight() && arg4 == local46[local50].getBitDepth()) {
					@Pc(82) int local82 = local46[local50].getRefreshRate();
					if (!local48 || Math.abs(local82 - local42) < Math.abs(arg2 - local42)) {
						local48 = true;
						arg2 = local82;
					}
				}
			}
			if (!local48) {
				arg2 = local42;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg0, arg3, arg4, arg2));
	}

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(I)[I")
	public int[] method5842() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local3.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local3.length; local17++) {
			local15[local17 << 2] = local3[local17].getWidth();
			local15[(local17 << 2) + 1] = local3[local17].getHeight();
			local15[(local17 << 2) + 2] = local3[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local3[local17].getRefreshRate();
		}
		return local15;
	}
}
