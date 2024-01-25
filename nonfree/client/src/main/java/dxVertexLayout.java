import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class7 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!eda;[Lclient!uaa;)V")
	public dxVertexLayout(@OriginalArg(0) Class45_Sub2_Sub1 arg0, @OriginalArg(1) Class332[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aTc1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class332 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method6980() > local27; local27++) {
				@Pc(41) Class147 local41 = local25.method6976(local27);
				@Pc(46) byte local46;
				@Pc(50) byte local50;
				@Pc(48) int local48;
				if (local41 == Static227.aClass147_1) {
					local46 = 2;
					local48 = 0;
					local50 = 0;
				} else if (local41 == Static227.aClass147_2) {
					local50 = 3;
					local46 = 2;
					local48 = 0;
				} else if (local41 == Static227.aClass147_3) {
					local48 = 0;
					local50 = 10;
					local46 = 4;
				} else if (local41 == Static227.aClass147_4) {
					local50 = 5;
					local46 = 0;
					local48 = local9++;
				} else if (Static227.aClass147_5 == local41) {
					local46 = 1;
					local50 = 5;
					local48 = local9++;
				} else if (Static227.aClass147_6 == local41) {
					local48 = local9++;
					local46 = 2;
					local50 = 5;
				} else {
					local50 = 5;
					local46 = 3;
					local48 = local9++;
				}
				local7.addElement(local11, local46, 0, local50, local48, local21);
				local21 += local41.anInt3987;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
