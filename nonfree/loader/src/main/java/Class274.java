import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class274 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "()V")
	public Class274() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(30) GraphicsDevice local30 = local14[local18];
				if (local30 != null && local30.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local30;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(ILjava/awt/Frame;IIZI)V")
	public void method6067(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method6069(arg1);
		if (arg4 == 0) {
			@Pc(31) int local31 = this.aDisplayMode1.getRefreshRate();
			@Pc(35) DisplayMode[] local35 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(37) boolean local37 = false;
			for (@Pc(39) int local39 = 0; local39 < local35.length; local39++) {
				if (local35[local39].getWidth() == arg3 && arg0 == local35[local39].getHeight() && local35[local39].getBitDepth() == arg2) {
					@Pc(66) int local66 = local35[local39].getRefreshRate();
					if (!local37 || Math.abs(local66 - local31) < Math.abs(arg4 - local31)) {
						local37 = true;
						arg4 = local66;
					}
				}
			}
			if (!local37) {
				arg4 = local31;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg0, arg2, arg4));
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(I)V")
	public void method6068() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6069(null);
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(Ljava/awt/Frame;B)V")
	private void method6069(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(12) Field local12 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local12.setAccessible(true);
			@Pc(22) boolean local22 = (Boolean) local12.get(this.aGraphicsDevice1);
			if (local22) {
				local12.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(34) Throwable local34) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "(I)[I")
	public int[] method6070() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}
}
